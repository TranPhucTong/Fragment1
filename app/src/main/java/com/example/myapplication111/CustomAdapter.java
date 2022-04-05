package com.example.myapplication111;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Contact> {
    private Activity activity;
    private int idLayout;
    private ArrayList<Contact> list;

    public CustomAdapter(Activity activity, int idLayout,
                         ArrayList<Contact> list){
        super(activity, idLayout, list);
        this.activity =activity;
        this.idLayout = idLayout;
        this.list = list;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = activity.getLayoutInflater();
        convertView = inflater.inflate(idLayout, null);

        ImageView img =(ImageView) convertView.findViewById(R.id.image1);
        TextView text = (TextView) convertView.findViewById(R.id.tv_1);

        img.setImageResource(list.get(position).getHinh());
        text.setText(list.get(position).getName());

        return convertView;
    }
}
