package edu.kis.vh.nursery;

/**
 * The {@code FIFORhymer} class extends {@code DefaultCountingOutRhymer} and
 * implements a first-in-first-out (FIFO) counting out mechanism.
 *
 * This class overrides the {@code countOut} method to ensure that the first
 * element counted in is the first one to be counted out.
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Overrides the {@code countOut} method to implement the FIFO counting out mechanism.
     *
     * @return the first element that was counted in
     */
    @Override
    protected int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());
        int ret = temp.countOut();
        while (!temp.callCheck())
            countIn(temp.countOut());
        return ret;
    }
}
