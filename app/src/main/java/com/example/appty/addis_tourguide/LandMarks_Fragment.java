package com.example.appty.addis_tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by appty on 23/12/17.
 */

public class LandMarks_Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View itemView = inflater.inflate(R.layout.item_list, container, false);

        ArrayList<Place> list = new ArrayList<>();
        list.add(new Place(R.drawable.img_5159, R.string.menelik));
        list.add(new Place(R.drawable.mesquel, R.string.meskel));
        list.add(new Place(R.drawable.menelik_square, R.string.menelik_square));
        list.add(new Place(R.drawable.bob_marley, R.string.bob));
        list.add(new Place(R.drawable.anwar_mosque, R.string.anwar));
        list.add(new Place(R.drawable.yekatit_square, R.string.yekatit));
        list.add(new Place(R.drawable.meyazia_27_square, R.string.meyazia));
        list.add(new Place(R.drawable.karls_square, R.string.karls));
        list.add(new Place(R.drawable.tewodros_square, R.string.twedros));

        MainListAdapter mainListAdapter = new MainListAdapter(getActivity(), list);

        ListView mainList = itemView.findViewById(R.id.list_item);
        mainList.setAdapter(mainListAdapter);

        return itemView;
    }
}
