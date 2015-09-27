package com.ola.olatourism.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ola.olatourism.R;

import java.util.ArrayList;

import model.PlacesDTO;

/**
 * Created by PrakashNandi on 27/09/15.
 */
public class PlacesListViewAdapter extends BaseAdapter {

    ArrayList<PlacesDTO> placesList;
    Context context;

    public PlacesListViewAdapter(Context context, ArrayList<PlacesDTO> placesList) {
        this.context = context;
        this.placesList = placesList;
    }

    @Override
    public int getCount() {
        return placesList.size();
    }

    @Override
    public PlacesDTO getItem(int position) {
        return placesList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder {
        public TextView text;
        public ImageView image;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // reuse views
        if (rowView == null) {
            rowView = inflater.inflate(R.layout.places_item_list, parent, false);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.text = (TextView) rowView.findViewById(R.id.placeAddress);
            viewHolder.image = (ImageView) rowView
                    .findViewById(R.id.deleteImage);
            rowView.setTag(viewHolder);
        }

        // fill data
        ViewHolder holder = (ViewHolder) rowView.getTag();
        PlacesDTO placesDTO = getItem(position);
        holder.text.setText(placesDTO.address);

        return rowView;
    }
}
