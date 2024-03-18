package model;

public class MyMath {
    public static double avgDoubleArrayExm1(double[] arr) {
        double avg = 0.0;
        if (arr == null) throw new NullPointerException("Пришел null массив");
        if (arr.length == 0) throw new ArithmeticException("Пришел пустой массив");
        for (double elem : arr) {
            avg += elem;
        }
        return avg /= arr.length;
    }

    //checked исключения должны быть обязательно обработаны (проброшены в место вызова метода
    // или обработаны на месте try catch
    public static double avgDoubleArrayExm2(double[] arr) throws NullDoubleArrayException, DivideByZeroException {
        double avg = 0.0;
        if (arr == null) throw new NullDoubleArrayException();
        if (arr.length == 0) throw new DivideByZeroException("array is empty");
        for (double elem : arr) {
            avg += elem;
        }
        return avg /= arr.length;
    }

}
