/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Scientist {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void changeThese(int subjectA, GuineaPig subjectB){
        subjectA = subjectA + 1;
        subjectB.setName(subjectB.getName() + "y");
    }
}
