package com.company;

public class Main {

    public static void main(String[] args) {
        Pet pet = new Pet("сухопутная ",Color.ORANGE);
        pet.lomat(2);
        Cat cat = new Cat("ухопутный ",Color.ORANGE,new HomePet(" милый дом"));
        cat.lomat("диван",1);
        Cat cat1 = new Cat("ухопутный ",Color.RED,new HomePet(" сильный дом"));
        cat1.lomat("диван",1);
        pet.print();
        cat.print();
        cat1.print();
    }

}
