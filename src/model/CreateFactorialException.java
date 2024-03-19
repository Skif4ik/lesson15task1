package model;

public class CreateFactorialException extends Exception {

    public CreateFactorialException() {
    }

    public CreateFactorialException(String message) {
        super(message);
    }

    public CreateFactorialException(Throwable cause) {
        super(cause);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("model.CreateFactorialException{");
        sb.append("message='").append(getMessage()).append('\'');
        sb.append(", cause=").append(getCause());
        sb.append('}');
        return sb.toString();
    }
}
