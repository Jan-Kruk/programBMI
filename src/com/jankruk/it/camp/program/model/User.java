package com.jankruk.it.camp.program.model;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class User {
    private static Set<Integer> set = new HashSet<>();
    private int ID;
    private String weightStatus;
    private double bmiValue;
    private int weight;
    private int height;
    Random random = new Random();

    public User(int weight, int height) {
        this.weight = weight;
        this.height = height;
        this.bmiValue = calculateBmiValue(this.weight,this.height);
        this.weightStatus = determineWeightStatus(this.bmiValue);
        newID();
    }
    private double calculateBmiValue(int weight, int height){
        return (weight/Math.pow((double)(height/100),2));
    }
    private String determineWeightStatus(double bmiValue){
        if (bmiValue < 18.5){
            return "Underweight";
        }else if (bmiValue >= 18.5 && bmiValue <= 24.9){
            return "Healthy Weight";
        }else if ( bmiValue >= 25.0 && bmiValue <= 29.9){
            return "Overweight";
        }
        return "Obesity";
    }
    private void newID (){
        boolean run = true;
        while(run){
            this.ID = random.nextInt(501);
            if (!set.contains(this.ID)){
                set.add(this.ID);
                run=false;
            }
        }
    }

    public int getID() {
        return ID;
    }

    public String getWeightStatus() {
        return weightStatus;
    }

    public double getBmiValue() {
        return bmiValue;
    }
}
