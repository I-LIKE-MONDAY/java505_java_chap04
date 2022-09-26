package subject;

import package2_1.C;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionEx3 {
    public static void main(String[] args) {

//        과제 1) 사칙 연산을 할 수 있는 클래스 Calculator을 생성하고 정수를 2개 입력받아 계산하는 프로그램을 작성하세요.
//        멤버변수 : int num1, num2, result (결과저장)
//        멤버메서드 : sum, sub, multi, div
//        모든 결과는 int 데이터 타입으로 사용, 메서드의 4가지 형태 중 아무거나 사용
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("덧셈 : " + Calculator.sum(num1, num2));
        System.out.println("뺄셈 : " + Calculator.sub(num1, num2));
        System.out.println("곱셈 : " + Calculator.multi(num1, num2));
        System.out.println("나눗셈 : " + Calculator.div(num1, num2));


//        과제 2) 로또 번호 생성 프로그램 : 1 ~ 45 까지의 임의의 숫자 6개를 생성하여 그 결과를 출력하는 프로그램을 작성하세요.
//        배열을 사용하여 랜덤으로 생성된 데이터를 저장
//        Math.random() 사용

        int rArray[] = new int[7];

        for (int i = 0; i < rArray.length; i++) {
            rArray[i] = (int) ((Math.random() * 45) + 1);
            System.out.print(rArray[i] + " ");
        }
        System.out.println();

//        과제 2 풀이
//        로또 번호 생성
        int lotto2[] = new int[7];
//        랜덤 숫자 생성, 1~45
        for (int i = 0; i < lotto2.length;i++) {
            int rnd = (int)((Math.random() * 45) + 1);

//        중복 제거
            for (int j = 0; j < i; j++) {
                if (rnd == lotto2[j]) {
//                    동일한 값이 있을 경우 현재 루프를 다시 한번 더 실행함
                    i--;    // 나중에 자동으로 1 증가할 카운트 변수를 먼저 1 감소시켜서 동일한 값이 나올 있도록 변경함,
                            // 동일한 번호의 루프를 돌 수 있게 됨.
                    break;
                }
//                동일한 값이 아니면 배열에 저장
                lotto2[i] = rnd;
            }
//        첫 번째 루프의 경우 중복 제거 루틴으로 빠지지 않기 떄문에 데이터가 저장되는 부분이 없으므로
//        0번 루프때만 동작되는 if문을 실행함
            if (i == 0) {
                lotto2[i] = rnd;
            }
        }

        Arrays.sort(lotto2);
        for (int i = 0; i < lotto2.length; i++) {
            System.out.print(lotto2[i] + " ");
        }



//        과제 3) 과제 2를 여러 번 실행 시, 배열에 저장되는 숫자가 중복되는 상황이 발생됨,
//        중복되는 숫자를 제외하고 총 6개의 숫자를 저장하고 출력하는 프로그램을 작성하세요.
/*        int rArray2[] = new int[6];
        int i = 0;

        for (i = 0; i < 6; i++) {

            rArray2[i] = (int) (Math.random() * 45);
            System.out.print(rArray2[i] + " ");
            for (int j=0;j<i;j++) {
                if (rArray2[i] == rArray2[j]) {
                    System.out.print(" ");
                }else {
                    System.out.println(rArray2[j] + " ");
                }
            }
        }*/
    }
}



