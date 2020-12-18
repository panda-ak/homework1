package com.company;

public final class Cat extends Pet  {
    private HomePet homePet;

    public Cat(String vid, Color color, HomePet homePet) {
        super(vid, color);
        this.homePet = homePet;
    }

    public HomePet getHomePet() {
        return homePet;
    }

    @Override
    public void lomat(String mebel, int colichestvo) {
        System.out.println("кошка сломала"+colichestvo+mebel);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("homePet"+homePet.getName());
    }
}
