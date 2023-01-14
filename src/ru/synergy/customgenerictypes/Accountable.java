package ru.synergy.customgenerictypes;

public interface Accountable<T> {
    T getID();
    T setID(T id);
    void setSum(int sum);
    int getSum();
}
