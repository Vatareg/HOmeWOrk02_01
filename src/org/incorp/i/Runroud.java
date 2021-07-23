package org.incorp.i;

public class Runroud implements Stop {
    private int dist;

    public Runroud(int dist) {
        this.dist = dist;
    }

    @Override
    public boolean goGo(Compit i) {
        return i.run(dist);
    }
}
