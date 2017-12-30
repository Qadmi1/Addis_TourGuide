package com.example.appty.addis_tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by appty on 28/12/17.
 */

public class DetailListAdapter extends ArrayAdapter<PlaceDetail> {

    public DetailListAdapter(Context context, ArrayList<PlaceDetail> list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.detail_item, parent, false);
        }


        // Create a PlaceDetail object and assign the current item in the ListView to it
        PlaceDetail currentItem = getItem(position);

        // Make sure the currentItem in the ListView is not null
        if (currentItem != null) {
            // Create a reference to the detail_image view and set the image in the currentItem to
            // it
            ImageView detailImage = listItemView.findViewById(R.id.detail_image);
            detailImage.setImageResource(currentItem.getmImageResource());

            // Create a reference to the detail_title view and set the image in the currentItem to
            //it
            TextView detailTitle = listItemView.findViewById(R.id.detail_title);
            detailTitle.setText(currentItem.getmTitle());

            // Create a reference to the detail_disc view and set the image in the currentItem to it
            TextView detailDisc = listItemView.findViewById(R.id.detail_disc);
            detailDisc.setText(currentItem.getmDiscription());

            // Create a reference to the detail_address view and set the image in the currentItem to it
            TextView detailAdress = listItemView.findViewById(R.id.detail_address);
            detailAdress.setText(currentItem.getmAddress());

            // Create a reference to the detail_call view and set the image in the currentItem to
            //it
            TextView detailCall = listItemView.findViewById(R.id.detail_call);
            detailCall.setText(currentItem.getmTitle());



        }

        return listItemView;
    }
}
