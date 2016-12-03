package com.maryplasez.spicemeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by platerosanchezm on 03/12/2016.
 */

public class SentencesFragment extends Fragment {
     /**
         * Returns a new instance of this fragment for the given section
         * number.
      * @param sectionNumber
      */
        public static SentencesFragment newInstance(List<String> sectionNumber) {
            SentencesFragment fragment = new SentencesFragment();
            Bundle args = new Bundle();
            args.putString("TITLE", "Choose a Sentence");
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
            return rootView;
        }
}
