package com.example.ikeda.listviewcustom;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        Bitmap image;
        image = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);

        List<ItemData> items = new ArrayList<>();

        ItemData item1 = new ItemData();
        item1.setImage(image);
        item1.setText("リンゴ");

        ItemData item2 = new ItemData();
        item2.setImage(image);
        item2.setText("みかん");

        ItemData item3 = new ItemData();
        item3.setImage(image);
        item3.setText("梨");

        ItemData item4 = new ItemData();
        item4.setImage(image);
        item4.setText("ドリアン");

        items.add(item1);
	    items.add(item2);
	    items.add(item3);
	    items.add(item4);

        CustomAdapter customAdapter = new CustomAdapter(getActivity(), 0, items);

        ListView listView = (ListView)rootView.findViewById(R.id.listView);
        listView.setAdapter(customAdapter);

        return rootView;
    }
}
