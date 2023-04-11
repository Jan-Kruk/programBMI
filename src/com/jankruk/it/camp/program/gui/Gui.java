package com.jankruk.it.camp.program.gui;

import com.jankruk.it.camp.program.model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Gui {
    Scanner scanner =new Scanner(System.in);
    public int showMenu () {
        System.out.println("1. Calculate BMI");
        System.out.println("2. Remind me my BMI");
        System.out.println("3. Exit");
        return scanner.nextInt();
    }
    public int getUserWeight(){
        System.out.print("Please enter your weight (in kilos): ");
        return scanner.nextInt();
    }
    public int getUserHeight(){
        System.out.print("Please enter your height (in centimeters): ");
        return scanner.nextInt();
    }
    public String readUserParameters(double bmiValue,String weightStatus,int ID){
        return "Your Bmi value is : " + bmiValue +
                ", your weight status is: " + weightStatus + " and your id is: "+ ID;
    }
    public int getYourParameters(){
        System.out.print("Enter your ID: ");
        return scanner.nextInt();
    }
    public String lookForYourParameters(ArrayList<User> arrayList, int id){
        for (User user: arrayList){
            if (user.getID() == id){
                return readUserParameters(user.getBmiValue(),
                        user.getWeightStatus(),
                        user.getID());
            }
        }
        return "If there is no result, your id is wrong";
    }
}
