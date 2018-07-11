package com.example.android.ahoustontour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of atraction information.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> list) {
        super ( context, 0, list );

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from ( getContext () ).inflate
                    ( R.layout.list_item, parent, false );
        }

        Place placeName = getItem ( position );

        ImageView iconView = (ImageView) listItemView.findViewById ( R.id.imageView_icon );
        iconView.setImageResource ( placeName.getImageResourceId () );

        TextView name = (TextView) listItemView.findViewById ( R.id.place_name );
        name.setText ( placeName.getPlaceName () );

        TextView info = (TextView) listItemView.findViewById ( R.id.place_description );
        info.setText ( placeName.getInfo () );

        return listItemView;
    }

}