package com.jankruk.it.camp.program.core;

import com.jankruk.it.camp.program.db.BmiRepository;
import com.jankruk.it.camp.program.gui.Gui;
import com.jankruk.it.camp.program.model.User;

public class Core {
    public void StartApp(){
        BmiRepository bmiRepository = new BmiRepository();
        Gui gui = new Gui();
        boolean run = true;
        while(run){
            switch (gui.showMenu()){
                case 1:
                    bmiRepository.addUser(new User(gui.getUserWeight(), gui.getUserHeight()));
                    System.out.println(gui.readUserParameters(bmiRepository.getLastUser().getBmiValue(),
                            bmiRepository.getLastUser().getWeightStatus(),
                            bmiRepository.getLastUser().getID()));
                    break;
                case 2:
                    System.out.println(gui.lookForYourParameters(bmiRepository.getUserArrayList(),gui.getYourParameters()));
                    break;
                case 3:
                    run = false;
                    break;
            }
        }
    }
}
