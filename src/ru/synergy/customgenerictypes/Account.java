package ru.synergy.customgenerictypes;

public class Account<T> implements Accountable<T> {
    private Object id;
    private int sum;

    public Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return (T) id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public T getID() {
        return null;
    }

    @Override
    public T setID(T id) {
        return null;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
