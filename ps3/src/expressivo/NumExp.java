package expressivo;

public class NumExp implements Expression {
    // The constant value of the numeric expression
    private final double value;

    /**
     * Constructs a NumExp with the specified constant value.
     *
     * @param value the constant value of the numeric expression
     */
    public NumExp(double value) {
        this.value = value;
    }

    /**
     * Returns a string representation of the numeric expression.
     *
     * @return a string representation of the numeric expression
     */
    @Override
    public String toString() {
        return Double.toString(value);
    }

    /**
     * Checks if the numeric expression is equal to another object.
     * Two NumExps are considered equal if they have the same constant value.
     *
     * @param thatObject the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object thatObject) {
        if (this == thatObject) return true;
        if (thatObject == null || getClass() != thatObject.getClass()) return false;
        NumExp that = (NumExp) thatObject;
        return Double.compare(that.value, value) == 0;
    }

    /**
     * Computes a hash code for the numeric expression.
     *
     * @return the hash code value for the numeric expression
     */
    @Override
    public int hashCode() {
        return Double.hashCode(value);
    }
}
