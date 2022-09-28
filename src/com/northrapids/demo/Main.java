package com.northrapids.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*  TODO
         *   - Create new ArrayList
         *   - Add
         *   - Get
         *   - Remove
         *   - Set
         * */

        List<Integer> scoreList = new ArrayList<>();

        // ADD
        System.out.println("Current ScoreList " + scoreList);
        scoreList.add(25);
        scoreList.add(50);
        scoreList.add(150);
        System.out.println("Current ScoreList " + scoreList);

        // REMOVE
        scoreList.remove(0);
        System.out.println("Current ScoreList " + scoreList);

        //System.out.println(scoreList.get(0));       // Prints index

        // GET
        for (int i = 0; i < scoreList.size(); i++) {
            System.out.println("index is: " + scoreList.get(i));
        }

        // SET
        scoreList.set(0, 25); // param #1 = index, param #2 = value
        System.out.println("Current ScoreList: " + scoreList);

        int x = Collections.max(scoreList);

        for (int i = 0; i < scoreList.size(); i++) {

            System.out.println("Checking value: " + scoreList.get(i));
            if (scoreList.get(i) == x) {
                System.out.println("Max value: " + scoreList.get(i) + " on index: " + i);
            }
        }

    }

}
