package com.stankevich.lab2;

public class Ticket {
    private int win;
    private int num;
    private boolean canGambleNext;

    Ticket(int win, int num, boolean doGambleNext) {
        this.win = win;
        this.num = num;
        this.canGambleNext = doGambleNext;
    }

    public int getWin() {
        return win;
    }

    public int getNum() {
        return num;
    }

    public boolean isCanGambleNext() {
        return canGambleNext;
    }

    @Override
    public String toString() {
        return "num: " + num + "\n" +
                "win: " + win + "\n" +
                "doGambleNext" + canGambleNext;
    }
}
