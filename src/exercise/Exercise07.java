import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {

//        7. 다음은 사용자로부터 배열의 개수를 얻어서 배열을 생성하여 리턴하는 alloArray() 메소드를 작성하고자 한다.
/*        __________ alloArray() {
            Scanner scanner = new Scanner(System.in);
            double n[] = new double[Scanner.nextInt()];     // 입력된 정수 크기의 배열 생성
            ___________________ // 배열 리턴
        }
*/
//    1번 테스트
        alloArray();
        alloArray2();

//        7-2. alloArray()를 호출하여 배열을 전달받는 한 줄의 코드를 작성하라.

        double d[] = alloArray2();




    }

    //        7-1. 빈 칸을 적절한 코드로 채워라.
    public static void alloArray() {
        Scanner scanner = new Scanner(System.in);
        double n[] = new double[scanner.nextInt()];// 입력된 정수 크기의 배열 생성
        for(int i=0; i<n.length; i++) {
            System.out.println(n[i]);
        }
    }

//    정답
    static double[] alloArray2() {
        Scanner scanner = new Scanner(System.in);
        double n2[] = new double[scanner.nextInt()];// 입력된 정수 크기의 배열 생성
        return n2;
    }

}
