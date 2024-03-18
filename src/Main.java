import model.MyMath;

public class Main {
    public static void main(String[] args) {
        double[] arr1 = {2, 7, 9, 3};
        double[] arr2 = {};
        double[] arr3 = null;

        try {
            System.out.println("avg arr1: " + MyMath.avgDoubleArrayExm1(arr1));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("avg arr2: " + MyMath.avgDoubleArrayExm1(arr2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("avg arr3: " + MyMath.avgDoubleArrayExm1(arr3));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
