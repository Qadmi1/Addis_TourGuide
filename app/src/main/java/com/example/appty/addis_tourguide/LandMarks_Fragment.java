package com.example.appty.addis_tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by appty on 23/12/17.
 */

public class LandMarks_Fragment extends Fragment {

    public LandMarks_Fragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View itemView = inflater.inflate(R.layout.item_list, container, false);

        //Create a list of LandMarks
        ArrayList<PlaceMain> list = new ArrayList<>();
        list.add(new PlaceMain(R.drawable.img_5159, R.string.menelik));
        list.add(new PlaceMain(R.drawable.mesquel, R.string.meskel));
        list.add(new PlaceMain(R.drawable.menelik_square, R.string.menelik_square));
        list.add(new PlaceMain(R.drawable.bob_marley, R.string.bob));
        list.add(new PlaceMain(R.drawable.anwar_mosque, R.string.anwar));
        list.add(new PlaceMain(R.drawable.yekatit_square, R.string.yekatit));
        list.add(new PlaceMain(R.drawable.meyazia_27_square, R.string.meyazia));
        list.add(new PlaceMain(R.drawable.karls_square, R.string.karls));
        list.add(new PlaceMain(R.drawable.tewodros_square, R.string.twedros));

        //Create an instance of our custom Adapter
        MainListAdapter mainListAdapter = new MainListAdapter(getActivity(), list);

        //Find the ListView with id list_item in the item_list.xml layout
        ListView mainList = itemView.findViewById(R.id.list_item);

        //Set the Adapter we created above to our ListView
        mainList.setAdapter(mainListAdapter);

        mainList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

        return itemView;
    }
}
