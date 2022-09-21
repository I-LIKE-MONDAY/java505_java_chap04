import java.util.Scanner;
public class method02 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        문제 1) 사칙연산을 하기 위한 메서드를 메서드의 4가지 형태로 각각 생성하여 실행하는 프로그램을 작성하세요.
//        1. 더하기, 빼기, 곱하기, 나누기 를 각각 4가지 형태로 생성
//        2. 1번 타입의 함수 이름 : sum1, sub1, multi1, div1
//           2번 타입의 함수 이름 : sum2, sub2, multi2, div2
//           3번 타입의 함수 이름 : sum3, sub3, multi3, div3
//           3번 타입의 함수 이름 : sum4, sub4, multi4, div4
//        3. 각각의 함수를 모두 실행하여 결과를 확인



//        문제 2) 사용자 입력을 통해서 2~9 숫자를 입력받아 해당하는 단수의 구구단을 출력하는 프로그램을 작성하세요.
//        1. 구구단을 출력하는 부분을 함수로 구현(함수명 : gugudan)
//        2. 사용자 입력 부분은 함수로 구현해도 되고 안해도 됨


//        문제 3) 사용자 입력을 통해서 국어, 영어, 수학의 점수 3개를 입력받고, 총점과 평균, 등급을 출력하는 프로그램을 작성하세요.
//        1. 등급 계산 부분을 함수로 구현(함수명 : scores)
//        2. 총점과 평균 계산부분을 함수로 구현(average)

//        1번 실행
        sum1();
        sub1();
        multi1();
        div1();

        System.out.println();

        sum2(10, 20);
        sub2(10, 20);
        multi2(10, 20);
        div2(10, 20);

        System.out.println();

        System.out.println("두 수의 덧셈은 : " + sum3());
        System.out.println("두 수의 뺄셈은 : " + sub3());
        System.out.println("두 수의 곱셈은 : " + multi3());
        System.out.println("두 수의 나눗셈은 : " + div3());

        System.out.println();

        System.out.println("두 수의 덧셈은 : " + sum4(10, 20));
        System.out.println("두 수의 덧셈은 : " + sub4(10, 20));
        System.out.println("두 수의 덧셈은 : " + multi4(10, 20));
        System.out.println("두 수의 덧셈은 : " + div4(10, 20));


//        2번 실행
        gugudan();


//        3번 실행
        System.out.print("국어 점수는 몇점인가요 >> ");
        int score1 = scanner.nextInt();
        System.out.print("영어 점수는 몇점인가요 >> ");
        int score2 = scanner.nextInt();
        System.out.print("수학 점수는 몇점인가요 >> ");
        int score3 = scanner.nextInt();

        scores(score1, score2, score3);
        average(score1, score2, score3);

    }

//        1. 매개변수와 반환값이 모두 없는 형태
    public static void sum1() {
        int a = 10;
        int b = 20;
        System.out.println("두 수의 덧셈은 : " + (a + b));
    }
    public static void sub1() {
        int a = 10;
        int b = 20;
        System.out.println("두 수의 뺄셈은 : " + (a - b));
    }
    public static void multi1() {
        int a = 10;
        int b = 20;
        System.out.println("두 수의 곱셈은 : " + (a * b));
    }
    public static void div1() {
        int a = 10;
        int b = 20;
        System.out.println("두 수의 나눗셈은 : " + (a / b));
    }
//        2. 매개변수는 존재하고, 반환값은 없는 형태
    public static void sum2(int a, int b) {
        int result = a + b;
        System.out.println("두 수의 덧셈은 : " + result);
    }
    public static void sub2(int a, int b) {
        int result = a - b;
        System.out.println("두 수의 뺄셈은 : " + result);
    }
    public static void multi2(int a, int b) {
        int result = a * b;
        System.out.println("두 수의 곱셈은 : " + result);
    }
    public static void div2(int a, int b) {
        int result = a / b;
        System.out.println("두 수의 나눗셈은 : " + result);
    }
//        3. 매개변수는 없고, 반환값은 존재하는 형태
    public static int sum3() {
        int a = 10;
        int b = 20;
        int result = a + b;
        return result;
    }
    public static int sub3() {
        int a = 10;
        int b = 20;
        int result = a - b;
        return result;
    }
    public static int multi3() {
        int a = 10;
        int b = 20;
        int result = a * b;
        return result;
    }
    public static int div3() {
        int a = 10;
        int b = 20;
        int result = a / b;
        return result;
    }
//        4. 매개변수와 반환값이 모두 존재하는 형태
    public static double sum4(int a, int b) {
        double result = a + b;
        return result;
    }
    public static double sub4(int a, int b) {
        double result = a - b;
        return result;
    }
    public static double multi4(int a, int b) {
        double result = a * b;
        return result;
    }
    public static double div4(int a, int b) {
        double result = a / b;
        return result;
    }

//    문제 2 메서드
    public static void gugudan(){
        System.out.print(" 2 ~ 9 숫자를 입력하세요. >> ");
        int guguNum = scanner.nextInt();
        for(int i=1; i<10; i++) {
            System.out.println(guguNum + "*" + i + "=" + (guguNum * i));
        }
    }


//      문제 3 메서드
//        1. 등급 계산 부분을 함수로 구현(함수명 : scores)

    public static void scores(int score1, int score2, int score3) {
        int scoreAvr = (score1 + score2 + score3) / 3;

        if(scoreAvr > 80) {
            System.out.println("당신의 등급은 A입니다.");
        } else if (scoreAvr > 70) {
            System.out.println("당신의 등급은 B입니다.");
        } else if (scoreAvr > 60) {
            System.out.println("당신의 등급은 C입니다.");
        } else {
            System.out.println("당신의 등급은 F입니다.");
        }

    }
    //        2. 총점과 평균 계산부분을 함수로 구현(average)
    public static void average(int score1, int score2, int score3){
        int scoreSum = score1 + score2 + score3;
        System.out.println("총점 : " + scoreSum);
        System.out.println("평균 : " + (scoreSum / 3));
    }
}
