package com.musiy.comps;

public class PoeticJuggler extends Juggler {

    private Poem poem;

    public PoeticJuggler(Poem poem) {
        this.poem = poem;
    }

    public PoeticJuggler(int cnt, Poem poem) {
        super(cnt);
        this.poem = poem;
    }

    @Override
    public void perform() {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}
