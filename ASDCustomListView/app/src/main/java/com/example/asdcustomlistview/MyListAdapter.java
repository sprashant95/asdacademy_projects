package com.example.asdcustomlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyListAdapter extends ArrayAdapter<String> {

    Activity context;
    String[] pname;
    String[] pprice;
    Integer[] pimage;

    public MyListAdapter(Activity context, String[] pname, String[] pprice, Integer[] pimage) {
        super(context,R.layout.mylistitem,pname);
        this.context = context;
        this.pname = pname;
        this.pprice = pprice;
        this.pimage = pimage;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mylistitem,null,true);

        TextView name = rowView.findViewById(R.id.pname);
        TextView price = rowView.findViewById(R.id.pprice);
        ImageView img = rowView.findViewById(R.id.pimage);

        name.setText(pname[position]);
        price.setText(pprice[position]);
        img.setImageResource(pimage[position]);

        return rowView;
    }
}
