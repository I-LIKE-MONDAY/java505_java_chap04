package exercise;

public class Exercise03 {
    public static void main(String[] args) {
//        3-1. 10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라.

        char c[] = new char[10];

//        3-2. 0에서 5까지 정수 값으로 초기화된 정수 배열 n을 선언하라.
        int n[] = new int[6];
        for(int i=0; i<6; i++) {
            n[i] = i;
            System.out.print(n[i] + "\t");
        }

//        3-2 정답
        int n1[] = { 0, 1, 2, 3, 4, 5 };

//        3-3. '일', '월', '화', '수', '목', '금', '토'로 초기화된 배열 day를 선언하라.
        char day[] = {'일', '월', '화', '수', '목', '금', '토'};

//        3-4. 5행 4열 크기의 실수 배열 d를 선언하라.
        double d[][] = new double[5][4];

//        3-5. 1에서 12까지 순서대로 정수로 초기화되는 3행 4열의 이차원 배열 val을 선언하라.
        int val[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    }
}
