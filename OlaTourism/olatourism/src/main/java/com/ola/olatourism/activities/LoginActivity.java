package com.ola.olatourism.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.net.http.SslError;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.ola.olatourism.R;
import com.ola.olatourism.util.OlaConstants;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;


public class LoginActivity extends Activity {

    private Button btnLogin;
    public static final String MyPREFERENCES = "MyPrefs" ;
    private static String url = "http://sandbox-t.olacabs.com/oauth2/authorize?response_type=token&client_id=MDAyNThjOTktNWQxZC00MjBkLTlhMjYtNTJlNzU3Yzk5YmQ5&redirect_uri=http://localhost/team33&scope=profile%20booking&state=state123";
    private WebView webview;
    private static String redirect_uri = "http://localhost/team33";
    SharedPreferences sharedpreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        webview = (WebView) findViewById(R.id.authWebView);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        editor = sharedpreferences.edit();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(View.VISIBLE);
                // set up webview for OAuth2 login
                webview.setWebViewClient(new WebViewClient() {
                    @Override
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {

                        if ( url.startsWith(redirect_uri) ) {

                            // extract OAuth2 access_token appended in url
                            if ( url.indexOf("access_token=") != -1 ) {
                                webview.setVisibility(View.GONE);
                                try {
                                    String[] split1 = url.split("#");
                                    String[] split2 = split1[1].split("=");
                                    String[] split3 = split2[1].split("&");

                                    Log.e("URL",split3[0]);
                                    editor.putString(OlaConstants.USER_TOKEN, split3[0]);

                                    Intent i = new Intent(LoginActivity.this, HopperActivity.class);
                                    startActivity(i);
                                }catch (Exception e){}
                            }

                            return true;
                        }

                        // load the webpage from url: login and grant access
                        return super.shouldOverrideUrlLoading(view, url); // return false;
                    }

                    public void onReceivedSslError (WebView view, SslErrorHandler handler, SslError error) {
                        handler.proceed() ;
                    }
                });

                webview.loadUrl(url);
            }
        });
    }

    public static Map<String, String> splitQuery(URL url) throws UnsupportedEncodingException {
        Map<String, String> query_pairs = new LinkedHashMap<String, String>();
        String query = url.getQuery();
        String[] pairs = query.split("&");
        for (String pair : pairs) {
            int idx = pair.indexOf("=");
            Log.e("index", idx+"");
            query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
        }
        return query_pairs;
    }
}
