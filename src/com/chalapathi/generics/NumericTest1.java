package com.chalapathi.generics;

public class NumericTest1<T extends Number> {
    private T number;
    public NumericTest1(T number) {
        this.number = number;
    }
    public T getNumber() {
        return number;
    }
    public void setNumber(T number) {
        this.number = number;
    }
    public double square() {
        return number.doubleValue() * number.doubleValue();
    }

    boolean absEqual(NumericTest1<?> num){
        return Math.abs(number.doubleValue()) == Math.abs(num.number.doubleValue());
    }

}

class NumericTest1Test {
    public static void main(String[] args) {
        NumericTest1<Integer> numericTest1 = new NumericTest1<>(5);
        System.out.println(numericTest1.square());

        NumericTest1<Double> numericTest2 = new NumericTest1<>(5.5);
        System.out.println(numericTest2.square());

        System.out.println(numericTest1.absEqual(numericTest2));
    }
}