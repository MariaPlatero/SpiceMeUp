package com.maryplasez.spicemeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by platerosanchezm on 03/12/2016.
 */

public class PhrasesFragment extends Fragment {
    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    private RecyclerView rv;

    public static PhrasesFragment newInstance(int sectionNumber) {
        PhrasesFragment fragment = new PhrasesFragment();
        Bundle args = new Bundle();
        args.putString("TITLE", "Create a Phrase");
//            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_spice_selection, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText(getArguments().getString("TITLE"));
        rv = (RecyclerView) rootView.findViewById(R.id.recycler);

        initAdapter();
        return rootView;
    }

    private void initAdapter() {


    rv.setAdapter(new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                return null;
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

            }

            @Override
            public int getItemCount() {
                return 0;
            }
        });
    }
}
