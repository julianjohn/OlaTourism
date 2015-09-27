package com.ola.olatourism.activities;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.ola.olatourism.R;
import com.ola.olatourism.adapter.PlacesListViewAdapter;

import java.util.ArrayList;

import model.PlacesDTO;

public class TripPriorityActivity extends Activity {

    ListView lstPlaces;
    ArrayList<PlacesDTO> placeList = HopperActivity.placeList;
    private PlacesListViewAdapter placesListViewAdapter;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_priority);

        lstPlaces = (ListView) findViewById(R.id.placeListView);
        radioGroup = (RadioGroup) findViewById(R.id.radioPriorityType);
        placesListViewAdapter = new PlacesListViewAdapter(getApplicationContext(), placeList);
        lstPlaces.setAdapter(placesListViewAdapter);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                if(checkedId == R.id.radioDistance)
                    Toast.makeText(getApplication(),"Distance",Toast.LENGTH_SHORT).show();
                else if(checkedId == R.id.radioFare)
                    Toast.makeText(getApplication(),"Fare",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
