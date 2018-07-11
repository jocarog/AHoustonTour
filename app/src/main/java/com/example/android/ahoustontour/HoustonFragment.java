package com.example.android.ahoustontour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass that displays the Tour app welcome page
 */
public class HoustonFragment extends Fragment {


    public HoustonFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate ( R.layout.list, container, false );

        // Create a list of houston places to visit
        final ArrayList<Place> place = new ArrayList<> ();
        place.add ( new Place ( getResources ().getString ( R.string.attraction_1 ), getResources ().getString ( R.string.description_1 ), R.drawable.houston_small ) );
        // Create a place adapter, whose data source is a list of places or tourist sites. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter ( getActivity (), place );

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list layout file.

        ListView listView = rootView.findViewById ( R.id.list );

        listView.setAdapter ( adapter );

        return rootView;
    }
}

