package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        HashMap<String, List<Integer>> data = new HashMap<String, List<Integer>>();
        data.put("raket", new ArrayList<Integer>(){{add(11);add(12);add(13);add(14);add(15);}});
        data.put("kad",  new ArrayList<Integer>(){{add(10);add(13);add(14);}});
        data.put("arun",  new ArrayList<Integer>(){{add(11);add(12);add(13);add(14);add(15);}});
        data.put("harry",  new ArrayList<Integer>(){{add(11);add(12);}});
        data.put("adam",  new ArrayList<Integer>(){{add(10);add(13);add(14);add(15);}});
        data.put("chazza",  new ArrayList<Integer>(){{add(11);;add(13);add(14);}});
        data.put("ollie",  new ArrayList<Integer>(){{add(11);add(12);add(13);}});

	    Picker picker = new Picker();
        System.out.println(picker.pick(data));
    }
}

