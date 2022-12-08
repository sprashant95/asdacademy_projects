package com.example.asdgridview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;

public class MyGridAdapter extends ArrayAdapter<String> {

    Activity context;
    String[] pname;
    Integer[] pimage;

    public MyGridAdapter(Activity context, String[] pname, Integer[] pimage) {
        super(context, R.layout.mygriditem,pname);
        this.context = context;
        this.pname = pname;
        this.pimage = pimage;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mygriditem,null,true);

        TextView name = rowView.findViewById(R.id.pname);
        ImageView image = rowView.findViewById(R.id.pimage);

        name.setText(pname[position]);
        image.setImageResource(pimage[position]);

        return rowView;
    }
}
