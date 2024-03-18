package org.example._96_polymorphism;

public class Bomb implements Weapon{
    @Override
    public void attack() {
        System.out.println("Blast the target");
    }
    public void power(){
        System.out.println("5TNT Nuclear Blast enough for City");
    }
}
