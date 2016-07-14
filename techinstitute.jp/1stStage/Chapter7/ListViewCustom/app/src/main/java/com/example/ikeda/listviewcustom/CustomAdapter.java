package com.example.ikeda.listviewcustom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;


public class CustomAdapter extends ArrayAdapter<ItemData> {
    private LayoutInflater lyoutInflater_;

    public CustomAdapter(Context context, int textViewResourceId, List<ItemData> objects) {
        super(context, textViewResourceId, objects);
        lyoutInflater_ = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemData item = getItem(position);

        if(null == convertView) {
            convertView = lyoutInflater_.inflate(R.layout.item_layout, null);
        }

        ImageView imageView;
        imageView = (ImageView)convertView.findViewById(R.id.imageView);
        imageView.setImageBitmap(item.getImage());

        TextView textView;
        textView = (TextView)convertView.findViewById(R.id.textView);
        textView.setText(item.getText());

        return convertView;
    }
}
