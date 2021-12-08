package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List names = new ArrayList();
        names.add("raket");
        names.add("kad");
        names.add("arun");
        names.add("harry");
        names.add("adam");

        List<List<Integer>> dayList = new ArrayList<>();

        List<Integer> raket = new ArrayList<Integer>();
        raket.add(11);
        raket.add(12);
        raket.add(13);
        raket.add(14);

        List<Integer> kad = new ArrayList<Integer>();
        kad.add(11);
        kad.add(10);
        kad.add(12);
        kad.add(13);

        List<Integer> arun = new ArrayList<Integer>();
        arun.add(9);
        arun.add(10);
        arun.add(11);

        List<Integer> harry = new ArrayList<Integer>();
        harry.add(11);
        harry.add(14);

        List<Integer> adam = new ArrayList<Integer>();
        adam.add(11);
        adam.add(15);
        adam.add(13);
        adam.add(14);

        dayList.add(raket);
        dayList.add(kad);
        dayList.add(arun);
        dayList.add(harry);
        dayList.add(adam);

        HashMap<String, List<Integer>> data = new HashMap<String, List<Integer>>();
        data.put("raket", raket);
        data.put("kad", kad);
        data.put("arun", arun);
        data.put("harry", harry);
        data.put("adam", adam);


	    Picker picker = new Picker();
        System.out.println(picker.pick(data));
    }
}

