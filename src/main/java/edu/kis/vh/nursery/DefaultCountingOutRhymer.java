package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int TOT = -1;
    public static final int EMPTY = -1;
    final private int[] numbers = new int[MAX_SIZE];

    public int total = TOT;


    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    final public boolean callCheck() {
        return total == TOT;
    }

    final public boolean isFull() {
        return total == MAX_SIZE - 1;
    }

    final protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}
