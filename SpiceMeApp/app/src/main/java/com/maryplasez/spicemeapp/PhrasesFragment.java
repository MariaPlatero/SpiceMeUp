package com.maryplasez.spicemeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by platerosanchezm on 03/12/2016.
 */

public class PhrasesFragment extends Fragment {
    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    private RecyclerView rv;
    private int type;

    public PhrasesFragment(int type) {
        this.type = type;
    }

    public static PhrasesFragment newInstance(int type) {
        return new PhrasesFragment(type);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_spice_selection, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        rv = (RecyclerView) rootView.findViewById(R.id.recycler);
        LinearLayoutManager lm = new LinearLayoutManager(getContext());
        rv.setLayoutManager(lm);

        initAdapter();
        return rootView;
    }

    private void initAdapter() {

    rv.setAdapter(new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                LayoutInflater inflater = LayoutInflater.from(parent.getContext());

                View v = inflater.inflate(R.layout.item, parent, false);
                return new PhrasesViewHolder(v);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                ArrayList<String> phrases = type == 0 ? (ArrayList<String>) Sentences.returnWords()
                        :(ArrayList<String>) Sentences.returnWords();
                ((PhrasesViewHolder) holder).setText(phrases.get(position));
            }

            @Override
                public int getItemCount() {
                    return Sentences.returnWords().size();
                }
            });
    }
}
