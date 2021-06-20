package cn.lihongjie.algs4;

public class Counter implements Comparable<Counter> {

    private final String name;     // counter name
    private int count = 0;         // current value

    /**
     * Initializes a new counter starting at 0, with the given id.
     *
     * @param name the name of the counter
     */
    public Counter(String name) {
        this.name = name;
    }

    /**
     * Increments the counter by 1.
     */
    public void increment() {
        count++;
    }

    /**
     * Returns the current value of this counter.
     *
     * @return the current value of this counter
     */
    public int tally() {
        return count;
    }

    /**
     * Returns a string representation of this counter.
     *
     * @return a string representation of this counter
     */
    public String toString() {
        return count + " " + name;
    }

    /**
     * Compares this counter to the specified counter.
     *
     * @param that the other counter
     * @return {@code 0} if the value of this counter equals
     * the value of that counter; a negative integer if
     * the value of this counter is less than the value of
     * that counter; and a positive integer if the value
     * of this counter is greater than the value of that
     * counter
     */
    @Override
    public int compareTo(Counter that) {

        return Integer.compare(this.count, that.count);
    }


}