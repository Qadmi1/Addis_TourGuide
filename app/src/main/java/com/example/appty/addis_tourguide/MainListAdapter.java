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

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by appty on 26/12/17.
 */

public class MainListAdapter extends ArrayAdapter<Place> {

    public MainListAdapter(Context context, ArrayList<Place> list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.main_item, parent, false);
        }

        Place currentItem = getItem(position);

        ImageView mainImg = listItemView.findViewById(R.id.image_main);
        mainImg.setImageResource(currentItem.getmImageResource());

        TextView textMain = listItemView.findViewById(R.id.text_main);
        textMain.setText(currentItem.getmName());
        return listItemView;
    }
}
