package ru.synergy.customgenerictypes;

public class Account implements Accountable<String> {
    private Object id;
    private int sum;

    public Account(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return (String) id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public String getID() {
        return null;
    }

    @Override
    public String setID(String id) {
        return null;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
