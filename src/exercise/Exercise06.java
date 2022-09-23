package exercise;

public class Exercise06 {
    public static void main(String[] args) {

//        6. for - each 문을 이용하여 배열 b를 모두 출력하는 코드를 완성하라.
        boolean b[] = {true, false, true, true};
        for(int i=0; i<b.length; i++) {
            System.out.println(b[i]);
        }

//        정답 = for문이 아니라 for-each문임!!! 문제를 잘 읽자!!
        boolean b1[] = {true, false, true, true};
        for(boolean boo : b1) {
            System.out.println(boo);
        }

    }
}
