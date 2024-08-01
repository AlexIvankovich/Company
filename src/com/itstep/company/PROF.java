package com.itstep.company;

public enum PROF {
    WORKER(1),
    DIRECTOR(2);

    private int koef;

    PROF(int koef) {
        this.koef = koef;
    }

    public int getKoef() {
        return koef;
    }
}
