package org.example.inheritance;

public class Dancer extends Person{
    private String dancingGroup;
    public Dancer(String aadhar,String name,String gender,String dancingGroup){
        super(aadhar,name,gender);
        this.dancingGroup=dancingGroup;
    }
    public String getDancingGroup() {
        return dancingGroup;
    }

    public void setDancingGroup(String dancingGroup) {
        this.dancingGroup = dancingGroup;
    }

    @Override
    public String learn(String subect) {
        return "learning new dance "+subect;
    }

    @Override
    public String sleep() {
        return "sleeping with girls naked";
    }

    @Override
    public void walk() {
        System.out.println("walking on the roof");
    }
    public void dancing(){
        System.out.println("I am dancing in party");
    }
}
