package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE = 12;
    public static final int TOT = -1;
    final private int[] numbers = new int[SIZE];

    public int total = TOT;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    final public boolean callCheck() {
        return total == -1;
    }

    final public boolean isFull() {
        return total == 11;
    }

    final protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
