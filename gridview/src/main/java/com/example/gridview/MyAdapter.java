package com.example.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by intel on 30/12/2017.
 */

public class MyAdapter extends BaseAdapter {
    private final Context context;
    private final ArrayList<MyItem> dataSet;

    public MyAdapter(Context context, ArrayList<MyItem> dataSet) {
        this.context = context;
        this.dataSet=dataSet;
    }
    @Override
    public int getCount() {
        return 0;
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
