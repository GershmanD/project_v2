package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class GridAdapter extends ArrayAdapter<Bus> {

    public GridAdapter(@NonNull Context context, ArrayList<Bus> buses) {
        super(context, 0, buses);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.grid_element, parent, false);
        }

        Bus tmp_bus = getItem(position);
        TextView tv_busnum_grid = listitemView.findViewById(R.id.tv_busnum_grid);
        ImageView iv_bus_grid = listitemView.findViewById(R.id.iv_bus_grid);

        tv_busnum_grid.setText("bus #"+String.valueOf(tmp_bus.getBus_number()));
        iv_bus_grid.setImageResource(R.drawable.bus);
        return listitemView;
    }
}
