package com.example.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class GridAdapter extends BaseAdapter {
    Context context;
    String[] number_of_bus;
    int image;

    public GridAdapter(Context context, String[] number_of_bus, int image) {
        this.context = context;
        this.number_of_bus = number_of_bus;
        this.image = image;
    }

    @Override
    public int getCount() {
        return number_of_bus.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
