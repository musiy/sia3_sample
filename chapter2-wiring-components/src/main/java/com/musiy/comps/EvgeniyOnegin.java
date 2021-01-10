package com.musiy.comps;

public class EvgeniyOnegin implements Poem {

    private static final String[] LINES = {
            "Мой дядя самых честных правил",
            "Когда не в шутку занемог",
            "Он уважать себя заставил",
            "И лучше выдумать не мог"};

    public void recite() {
        for (String line : LINES) {
            System.out.println(line);
        }
    }
}
