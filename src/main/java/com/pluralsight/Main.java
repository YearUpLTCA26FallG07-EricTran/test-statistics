package com.pluralsight;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] scores = {91, 75, 99, 77, 81, 92, 65, 40, 66, 85};

        double total = 0;
        double average = 0;
        int lowscore = scores[0];
        int highscore = scores[0];

        for (int score : scores) {
            total += score;

            if (score > highscore) {
                highscore = score;
            }
            if (score < lowscore) {
                lowscore = score;
            }

        }
        Arrays.sort(scores);
        int middle = scores.length / 2;
        double median = (scores[middle - 1] + scores[middle]) / 2;
        average = total / scores.length;

        System.out.println(average);
        System.out.println(highscore);
        System.out.println(lowscore);
        System.out.println(median);

    }

}