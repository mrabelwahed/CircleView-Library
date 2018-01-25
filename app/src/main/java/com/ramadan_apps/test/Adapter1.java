package com.ramadan_apps.test;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.ramadan_apps.recyclerviewanimations.GplusAdapter;

import java.util.List;

/**
 * Created by Mahmoud Ramadan on 1/24/18.
 */

public class Adapter1 extends GplusAdapter {

    public Adapter1(Context context, List data) {
        super(context, data);
    }

    @Override
    public RecyclerView.ViewHolder getViewHolder(ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void bindData(RecyclerView.ViewHolder viewHolder, Object o) {

    }
}
