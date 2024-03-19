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

    public static class Factorial {     //вложенный класс Factorial
        private int value ;

        public Factorial() {
            value = 1;
        }

        public Factorial(int value) throws CreateFactorialException {
            try {
                if(value<0) throw new NegativeFactorialValueException(value);
                this.value = value;
            } catch (NegativeFactorialValueException e) {
                throw new CreateFactorialException(e);
            }
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) throws NegativeFactorialValueException {
            if(value<0) throw new NegativeFactorialValueException(value);
            this.value = value;
        }

        public long getFactorial(){
            long res = 1;
            for(int i =2; i<=value; i++){
                res = res * i;
            }
            return res;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("model.MyMath.Factorial{");
            sb.append("value=").append(value);
            sb.append(", factorial=").append(getFactorial());
            sb.append('}');
            return sb.toString();
        }
    }


}
