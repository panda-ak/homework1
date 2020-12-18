package com.company;

public class Pet extends Animal {
    private Color color;

    public Pet(String vid, Color color) {
        super(vid);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void lomat(String mebel, int colichestvo) {

        System.out.println(mebel + " сломана" + colichestvo + " количество");
    }

    public final void lomat(int colichestvo) {
        System.out.println("количество"+colichestvo);
    }

    public void print(){
        System.out.println("vid"+getVid()+"color"+color);
    }

}