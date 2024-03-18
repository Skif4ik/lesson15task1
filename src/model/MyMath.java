package model;

public class MyMath {
    public static double avgDoubleArrayExm1(double[] arr){
        double avg = 0.0;
        if(arr==null) throw new NullPointerException("Пришел null массив");
        if(arr.length==0) throw new ArithmeticException("Пришел пустой массив");
        for (double elem : arr) {
            avg += elem;
        }
        return avg /= arr.length;
    }
}
