package exercise;

public class Exercise08 {
    public static void main(String[] args) {
        String s = "123";
        try{
            int n = Integer.parseInt(s);    // s가 정수 문자열이 아니면 NumberFormatException 발생
            n++;
            System.out.println(n);
        }
        catch (NumberFormatException e) {
            System.out.println(s + "를 정수로 변환할 수 없습니다.");
        }
        finally {
            System.out.println("계산을 끝냅니다.");
        }

//        8. Integer.parseInt(String s)는 문자열 s를 정수로 변환하여 리턴하는 메소드이다.
//        만약 s가 정수로 변환할 수 없는 문자열이면 NumberFormatException 예외가 발생한다.

//        8-1. 코드를 실행한 결과 출력되는 내용은?
//        답 : 124
//             계산을 끝냅니다.

//        8-2. s가 "23.5"일때 앞의 코드를 실행한 결과 출력되는 내용은?
//        답 : 23.5를 정수로 변환할 수 없습니다.
//             계산을 끝냅니다.

    }
}
