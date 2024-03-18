package org.example._96_polymorphism;

public class Test {
    public static void fight(Weapon weapon){
        weapon.attack();
        if(weapon instanceof Gun){
            Gun gun=(Gun) weapon;
            gun.getName();
        }
        if(weapon.getClass().equals(Bomb.class)){
            Bomb bomb=(Bomb) weapon;
            bomb.power();
        }
    }

    public static void main(String[] args) {
        Weapon w1=new Gun();
        Weapon w2=new Bomb();
        fight(w1);
    }
}
