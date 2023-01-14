package ru.synergy.genericmethods;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        String[] strings = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] integers = {23,1,123,5,76,123};
        printer.<String>print(strings);
        printer.<Integer>print(integers);

    }
}
