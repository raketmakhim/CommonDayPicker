package com.company;

import java.util.*;

public class Picker {

    //adding comment for feature

    public int pick(HashMap<String, List<Integer>> data){

        List<Integer> allDays = new ArrayList<>();

        for (Map.Entry<String, List<Integer>> daylist : data.entrySet()) {
            allDays.addAll(daylist.getValue());
        }

        return getMode(allDays);
    }

    private int getMode(List<Integer> list){

        Collections.sort(list);
        int mostFrequentNumber = 0;

        int mostFrequentNumberCounter = 0;

        int numberCounter ;

        for(int i = 0; i < list.size(); i+=numberCounter){

            numberCounter = 1;

            String currentNumber = list.get(i).toString();

            for(int j = i; j<list.size(); j++){

                if (i + 1 != list.size()
                        && list.get(i).equals(list.get(j+1))) {
                    numberCounter++;
                }
                else {
                    j = list.size();
                }

            }
            if (mostFrequentNumberCounter < numberCounter){
                mostFrequentNumberCounter = numberCounter;
                mostFrequentNumber = Integer.valueOf(currentNumber);
            }
        }
        return mostFrequentNumber;
    }

}
