package com.musiy.comps;

public class Juggler implements Performer {

    private int cnt = 3;

    public Juggler() {

    }

    public Juggler(int cnt) {
        this.cnt = cnt;
    }

    public void perform() {
        System.out.println("Jiggling for " + cnt + " times!");
    }
}
