package com.maryplasez.spicemeapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by platerosanchezm on 03/12/2016.
 */

public class Words {

    private List<String> availableDeterminers = new ArrayList<>();
    private List<String> availablePronouns = new ArrayList<>();
    private List<String> availableVerbs = new ArrayList<>();
    private List<String> availableTimes = new ArrayList<>();
    private List<String> availableEndearments = new ArrayList<>();
    private List<String> availablePlaces = new ArrayList<>();
    private List<String> availableNouns = new ArrayList<>();
    private List<String> availableAdjectives = new ArrayList<>();
    private List<String> availableAdverbs = new ArrayList<>();
    private List<String> availablePrepositions = new ArrayList<>();
    private List<String> availableConjunctions = new ArrayList<>();
    private List<String> availableInterjections = new ArrayList<>();
    private List<String> availablePunctuations = new ArrayList<>();


    public List<String> returnDeterminers(){

        availableDeterminers.add("a");
        availableDeterminers.add("an");
        availableDeterminers.add("it");
        availableDeterminers.add("many");
        availableDeterminers.add("my");
        availableDeterminers.add("one");
        availableDeterminers.add("that");
        availableDeterminers.add("the");
        availableDeterminers.add("this");
        availableDeterminers.add("two");
        availableDeterminers.add("what");
        availableDeterminers.add("where");
        availableDeterminers.add("which");
        availableDeterminers.add("your");

        return availableDeterminers;
    }


    public List<String> returnPronouns(){

        availablePronouns.add("I");
        availablePronouns.add("me");
        availablePronouns.add("us");
        availablePronouns.add("we");
        availablePronouns.add("you");

        return availablePronouns;
    }

    public List<String> returnVerbs(){

        availableVerbs.add("am");
        availableVerbs.add("are");
        availableVerbs.add("bang");
        availableVerbs.add("be");
        availableVerbs.add("can");
        availableVerbs.add("come");
        availableVerbs.add("cuddle");
        availableVerbs.add("cuddling");
        availableVerbs.add("do");
        availableVerbs.add("flirt");
        availableVerbs.add("go down");
        availableVerbs.add("going");
        availableVerbs.add("got");
        availableVerbs.add("have");
        availableVerbs.add("imagine");
        availableVerbs.add("is");
        availableVerbs.add("kiss");
        availableVerbs.add("let");
        availableVerbs.add("look");
        availableVerbs.add("love");
        availableVerbs.add("make");
        availableVerbs.add("masturbate");
        availableVerbs.add("ride");
        availableVerbs.add("saddle");
        availableVerbs.add("sleep");
        availableVerbs.add("sleeping");
        availableVerbs.add("tease");
        availableVerbs.add("to");
        availableVerbs.add("touch");
        availableVerbs.add("want");
        availableVerbs.add("was");
        availableVerbs.add("were");
        availableVerbs.add("will");

        return availableVerbs;
    }

    public List<String> returnTimes(){

        availableTimes.add("afternoon");
        availableTimes.add("bedtime");
        availableTimes.add("evening");
        availableTimes.add("later");
        availableTimes.add("morning");
        availableTimes.add("night");
        availableTimes.add("now");
        availableTimes.add("time");
        availableTimes.add("today");
        availableTimes.add("tomorrow");
        availableTimes.add("tonight");
        availableTimes.add("weekend");

        return availableTimes;
    }

    public List<String> returnEndearments(){

        availableEndearments.add("babe");
        availableEndearments.add("baby");
        availableEndearments.add("dear");
        availableEndearments.add("honey");
        availableEndearments.add("hun");
        availableEndearments.add("love");
        availableEndearments.add("sweetheart");

        return availableEndearments;
    }

    public List<String> returnPlaces(){

        availablePlaces.add("anywhere");
        availablePlaces.add("bed");
        availablePlaces.add("everywhere");
        availablePlaces.add("floor");
        availablePlaces.add("here");
        availablePlaces.add("home");
        availablePlaces.add("kitchen");
        availablePlaces.add("shower");
        availablePlaces.add("table");

        return availablePlaces;
    }

    public List<String> returnNouns(){

        availableNouns.add("69");
        availableNouns.add("anal");
        availableNouns.add("anything");
        availableNouns.add("clothes");
        availableNouns.add("cowgirl");
        availableNouns.add("dance");
        availableNouns.add("doggy");
        availableNouns.add("hair");
        availableNouns.add("intercouse");
        availableNouns.add("lap");
        availableNouns.add("life");
        availableNouns.add("missionary");
        availableNouns.add("mouth");
        availableNouns.add("oral");
        availableNouns.add("orgasm");
        availableNouns.add("position");
        availableNouns.add("quickie");
        availableNouns.add("sex");
        availableNouns.add("spooning");
        availableNouns.add("style");
        availableNouns.add("suprise");

        return availableNouns;
    }

    public List<String> returnAdjectives(){

        availableAdjectives.add("beautiful");
        availableAdjectives.add("cuddly");
        availableAdjectives.add("cute");
        availableAdjectives.add("erotic");
        availableAdjectives.add("favorite");
        availableAdjectives.add("first");
        availableAdjectives.add("good");
        availableAdjectives.add("handsome");
        availableAdjectives.add("hard");
        availableAdjectives.add("hot");
        availableAdjectives.add("intimate");
        availableAdjectives.add("last");
        availableAdjectives.add("pretty");
        availableAdjectives.add("right");
        availableAdjectives.add("rough");
        availableAdjectives.add("second");
        availableAdjectives.add("sensual");
        availableAdjectives.add("sexy");
        availableAdjectives.add("soft");
        availableAdjectives.add("spicy");
        availableAdjectives.add("steamy");
        availableAdjectives.add("wet");

        return availableAdjectives;
    }

    public List<String> returnAdverbs(){

        availableAdverbs.add("always");
        availableAdverbs.add("especially");
        availableAdverbs.add("really");
        availableAdverbs.add("still");
        availableAdverbs.add("together");
        availableAdverbs.add("very");

        return availableAdverbs;
    }

    public List<String> returnPrepositions(){

        availablePrepositions.add("at");
        availablePrepositions.add("for");
        availablePrepositions.add("in");
        availablePrepositions.add("into");
        availablePrepositions.add("of");
        availablePrepositions.add("off");
        availablePrepositions.add("on");
        availablePrepositions.add("through");
        availablePrepositions.add("to");
        availablePrepositions.add("top");
        availablePrepositions.add("with");

        return availablePrepositions;
    }

    public List<String> returnConjunctions(){

        availableConjunctions.add("and");
        availableConjunctions.add("but");
        availableConjunctions.add("however");
        availableConjunctions.add("nonetheless");
        availableConjunctions.add("or");
        availableConjunctions.add("then");
        availableConjunctions.add("therefore");

        return availableConjunctions;
    }

    public List<String> returnInterjections(){

        availableInterjections.add("bye");
        availableInterjections.add("ciao");
        availableInterjections.add("hello");
        availableInterjections.add("hey");
        availableInterjections.add("hi");
        availableInterjections.add("no");
        availableInterjections.add("oh");
        availableInterjections.add("wow");
        availableInterjections.add("yes");

        return availableInterjections;
    }

    public List<String> returnPunctuations(){

        availablePunctuations.add(",");
        availablePunctuations.add("!");
        availablePunctuations.add("?");
        availablePunctuations.add(".");
        availablePunctuations.add("¯\_(ツ)_/¯");

        return availablePunctuations;
    }


}
