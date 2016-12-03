package com.maryplasez.spicemeapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by seitzs on 12/3/16.
 */
public class PhrasesViewHolder extends RecyclerView.ViewHolder{


    TextView tv;

    public PhrasesViewHolder(View itemView) {
        super(itemView);
        this.tv = (TextView) itemView.findViewById(R.id.tview);
    }

    public void setText(String text) {
        this.tv.setText(text);
    }
}
