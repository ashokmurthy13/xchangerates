package net.ashok.xchangerate.app.exception;

public class ComparisonException extends RuntimeException {

    private Object[] args;

    public ComparisonException() {
    }

    public ComparisonException(String message) {
        super(message);
    }

    public ComparisonException(String message, Object[] args) {
        super(message);
        this.args = args;
    }

    public ComparisonException(String message, Throwable cause) {
        super(message, cause);
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

}
