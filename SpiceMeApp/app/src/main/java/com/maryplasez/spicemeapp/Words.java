package com.maryplasez.spicemeapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by platerosanchezm on 03/12/2016.
 */

public class Words {

    private List<String> availableDeterminants = new ArrayList<>();
    private List<String> availableVerbs = new ArrayList<>();

    public List<String> returnDeterminants(){

        availableDeterminants.add("Sexy");
        availableDeterminants.add("Sexy");
        availableDeterminants.add("Sexy");

        return availableDeterminants;
    }

    public List<String> returnVerbs(){

        availableVerbs.add("Sexy");


        return availableVerbs;
    }



}
