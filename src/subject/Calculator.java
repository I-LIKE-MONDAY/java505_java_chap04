package subject;

public class Calculator {
    public static int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static int sub(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }
    public static int multi(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }
    public static int div(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }

//    풀이
//    private int num1;
//    private int num2;
//    private int result;
//
//    public Calculator(int num1, int num2) {
//        this.num1 = num1;
//        this.num2 = num2;
//        this.result = 0;
//    }
//    public void sum() {
//        this.result = this.num1 + this.num2;
//    }




}
