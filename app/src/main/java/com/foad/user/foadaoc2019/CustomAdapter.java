package com.foad.user.foadaoc2019;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Machine> {
    private int resourceLayout;
    private Context mContext;

    public CustomAdapter(Context context, int resource, List<Machine> items) {
        super(context, resource, items);
        this.resourceLayout = resource;
        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if(v == null)
            v = LayoutInflater.from(mContext).inflate(resourceLayout,parent,false);


        Machine p = getItem(position);

        if (p != null) {


        }

        return v;
    }

}