package com.maryplasez.spicemeapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by platerosanchezm on 03/12/2016.
 */

public class Sentences {

    private List<String> availableSentences = new ArrayList<>();

    public List<String> returnWords(){

        availableSentences.add("Hello beautiful");
        availableSentences.add("Hello beautiful");
        availableSentences.add("Hello beautiful");
        availableSentences.add("Hello beautiful");


        return availableSentences;
    }
}
