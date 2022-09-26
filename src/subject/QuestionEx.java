package subject;

import java.util.Random;
import java.util.Scanner;
// charAt() : https://colossus-java-practice.tistory.com/31
public class QuestionEx {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
//        문제 1 풀이)ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        System.out.print("알파벳 한 문자를 입력하세요 >> ");
        String str = scanner.next();
//        charAt() : String 타입의 데이터 중, 지정한 index의 문자를 char 타입으로 변환.
        char c = str.charAt(0); // 문자열의 첫 번째 문자

//        char 타입의 데이터 a는 아스키코드 문자로는 'a', 정수로는 97로 표현
        for (char a = 'a'; a <= c; a++) {    // a = 'a'; 이 아니라 a = 97로 썼어도 결과는 동일하게 나온다.
            for (char b = a; b <= c; b++) {
                System.out.print(b);
            }
            System.out.println();
        }

//        문제 2 풀이)
        int arrQuiz2[] = new int[10];

        for (int i = 0; i < arrQuiz2.length; i++) {
            System.out.println("정수를 입력해 주세요 : (현재 " + (i + 1) + "번) : " );
            arrQuiz2[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrQuiz2.length; i++) {
            if (arrQuiz2[i] % 3 == 0) {
                System.out.print(arrQuiz2[i] + " ");
            }
        }

//        문제 6 풀이)ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//        1. eng 배열을 전체 검색하여 사용자가 입력한 단어가 있는지 확인
//        2. 있으면 해당 index 번호 확인하고 검색 중지
//        3. kor 배열의 index 번호에 있는 단어 출력
//        4. 입력된 단어가 exit 이면 프로그램 종료
        String eng[] = {"student", "love", "java", "happy", "future"};
        String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};

//        무한반복 할때는 보통 while문을 많이 사용함. (count 값을 안올려주거나, 조건부분에 true를 입력하거나, 탈출조건을 만들지않거나)
        while (true) {
            System.out.println("영어 단어를 입력하세요.");
            String quiz3Str = scanner.next();

            if(quiz3Str.equals("exit")) {
                System.out.println("종료합니다...");
                break;
            }

            int index = -1;
            for (int i = 0; i < eng.length; i++) {
                if (quiz3Str.equals(eng[i])) {
                    index = 1;
                    break;
                }
            }

            if (index > -1) {
                System.out.println(kor[index]);
            }
            else {
                System.out.println("그런 영어 단어가 없습니다.");
            }
        }

//        for (int i = 0; true; i++) {  // for 문에서 무한반복 사용하는 법
//            if (){
//            }
//        }


//        Challenge 문제 풀이)ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//        1. 0 ~ 99 까지의 숫자를 컴퓨터가 랜덤으로 선택, 사용자가 키보드로 입력
//        2. 사용자 입력을 통해 얻을 데이터가 높은지 낮은지 판단 (if ~ else문), 반복 실행(무한반복)
//        3. 정답을 맞춘 후 다시 게임을 할 것인지 확인
        Random r = new Random();    // 랜덤 값 생성하기 위한 클래스
        int card;   // 컴퓨터가 랜덤으로 생성한 데이터가 저장될 변수
        int low;    // 카드에 적힌 수의 범위를 설정할 변수
        int high;

//        게임의 시작, 무한반복
        while(true) {
            int i = 1;  // 몇 번째 입력인지 확인하기 위한 변수
            low = 0;    // 게임 시작 시 초기값을 가장 작은 0으로 설정
            high = 99;  // 게임 시작 시 초기값을 가장 높은 99로 설정
            card = r.nextInt(100);  // 0 ~ 99 범위의 숫자
            System.out.println("Up & Down 게임입니다. 숨겨진 수를 맞추어 보세요");

//            사용자 입력을 반복
            while(true) {
                System.out.println(low + " - " + high);
                System.out.print( i + " >> ");

                int count = scanner.nextInt();  // 사용자 입력을 받음

                if(count > high || count < low) {
                    System.out.println("범위를 벗어났습니다.");
                }
                else {
//                    입력값이 컴퓨터의 랜덤 값과 같을 경우
                    if (count == card) {
                        System.out.println("정답 입니다.");
                        break;  // 내부 while문을 종료
                    }
//                    사용자 입력이 컴퓨터의 랜덤 값보다 클 경우
                    else if(count > card){
                        System.out.println("더 낮게");
                        high = count;   // 최대 크기의 범위를 사용자의 입력 데이터로 설정
                    }
//                    사용자 입력이 컴퓨터릐 랜덤 값보다 작은 경우
                    else {
                        System.out.println("더 높게");
                        low = count;    // 최소 크기의 범위를 사용자의 입력 데이터로 설정
                    }
                }
                i++;
            }
            System.out.println("다시 하시겠습니까? ( y/n ) >>");
//            게임이 끝나고 새 게임을 시작할 것인지 확인
            if (scanner.next().equals("n")) {
                break;  // 외부 while문을 종료
            }
        }


//        보너스 문제 풀이)ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        int intArray[][];
        intArray = new int[3][4];   // 입력부분 1

        for (int i=0; i<3; i++) {
            for (int j=0; j<4; j++) {
                // Math.random() : 랜덤 숫자를 발생시키기 위한 수학 클래스의 함수, 0.0 ~ 1.0 까지의 숫자를 랜덤하게 출력함
                // * 10 을 진행하여 정수 부분이 나올 수 잇도록 함
                // (int) 를 사용하여 소수점 뒤의 숫자를 삭제하고 정수로 강제 형변환
                intArray[i][j] = (int)(Math.random() * 10);

            }
        }

        for (int i=0; i < intArray.length; i++) {  // 입력부분 2
            for(int j=0; j < intArray[i].length; j++) { // 입력부분 3
                System.out.print(intArray[i][j] + "\t");    // 입력부분 4
            }
            System.out.println();
        }

        int i = 0;
        int sum = 0;
        while (i < 3) {
            for (int j = 0; j <intArray[i].length; j++) {
                sum = sum + intArray[i][j];
            }
            i++;
        }
        System.out.println("합은" + sum);
    }
}
