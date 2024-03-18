package model;

public class NegativeFactorialValueException extends Exception {
    private int negValue;

    public NegativeFactorialValueException() {
    }

    public NegativeFactorialValueException(int negValue) {
        this.negValue = negValue;
    }

    public NegativeFactorialValueException(String message) {
        super(message);
    }

    public NegativeFactorialValueException(String message, int negValue) {
        super(message);
        this.negValue = negValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("model.NegativeFactorialValueException{");
        sb.append("negValue=").append(negValue);
        sb.append(", message='").append(getMessage()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
