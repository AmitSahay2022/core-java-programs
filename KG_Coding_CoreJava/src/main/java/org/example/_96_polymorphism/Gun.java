package org.example._96_polymorphism;

public class Gun implements Weapon{
    @Override
    public void attack() {
        System.out.println("Shoot the target");
    }
    public void getName(){
        System.out.println("...AK47...");
    }
}
