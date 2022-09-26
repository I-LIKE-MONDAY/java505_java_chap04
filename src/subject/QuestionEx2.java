package subject;

import chap04_excercise.Song;

import java.util.Scanner;

// 184 페이지
public class QuestionEx2 {
    public static void main(String[] args) {
//        실습문제 1) ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        Song1 mySong = new Song1("Nesson Dorma");
        Song1 yourSong = new Song1("공주는 잠 못 이루고");
        System.out.println("내 노래는 " + mySong.getTitle());
        System.out.println("너 노래는 " + yourSong.getTitle());

//        문제 2) ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        Scanner scanner = new Scanner(System.in);
        Phone phone1;
        Phone phone2;


//        for ( int i = 0; i < 2; i++) {}   : for 문을 이용할수도 있고 두번밖에 안되니까 아래처럼 할수도있음

        System.out.println("이름과 전화번호 입력 >>");
        phone1 = new Phone(scanner.next(), scanner.next());
        System.out.println("이름과 전화번호 입력 >>");
        phone2 = new Phone(scanner.next(), scanner.next());

        System.out.println(phone1.getName() + "의 번호" + phone1.getTel());
        System.out.println(phone1.getName() + "의 번호" + phone2.getTel());


//        문제 3) ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//        1. Rect 클래스의 배열 생성
//        2. 반복문으로 4번 데이터 입력 받기
//        3. 넓이의 전체 합을 출력(반복문)
        Rect rectArray[] = new Rect[4];

        for (int i=0; i<rectArray.length; i++) {
            System.out.println((i+1) + " :너비와 높이 >>");
            int width = scanner.nextInt();
            int heigh = scanner.nextInt();
            rectArray[i] = new Rect(width, heigh);
        }
        System.out.println("저장 하였습니다...");

        int total = 0;
        for(int i=0; i< rectArray.length; i++) {
            total += rectArray[i].getArea();
        }
        System.out.println("사각형의 전체 합은" + total);


//        문제 4) ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//        1. 사용자 입력을 통해서 전화번호를 저장할 배열 크기를 입력받음
//        2. 지정한 크기 만큼의 사용자 정보 입력받음
//        3. 사용자가 입력한 사용자 이름이 있는지 반복문을 통해서 배열 안의 내용과 비교
//        4. 있으면 정보 출력, 없으면 "없습니다." 출력
//        5, exit 를 입력 받으면 프로그램 종료

        System.out.println();
        System.out.print("인원 수 >> ");
        int size = scanner.nextInt();

//        Phone2 클래스 타입의 배열 생성, 사용자가 입력한 크기 만큼
        Phone2 phoneBook[] = new Phone2[size];

        for (int i=0; i<phoneBook.length; i++) {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력) >> ");

            phoneBook[i] = new Phone2(scanner.next(), scanner.next());
        }
        System.out.println("저장되었습니다.");

//        사용자 이름 검색 (무한반복)
        while (true) {
            System.out.print("검색할 이름 >> ");
            String searchName = scanner.next();
            int index = -1; // 배열의 index 번호를 저장할 변수 (-1 을 넣은 이유 -> 검색 불가 : -1, 검색 완료 : 검색된 index 번호)

//            입력된 문자열이 exit와 같으면 프로그램 종료
            if (searchName.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            for (int i=0; i<phoneBook.length; i++) {
//                검색어로 입력한 이름과 전화번호부에 저장된 이름이 같은지 확인
                if (searchName.equals(phoneBook[i].getName())) {
                    index = 1;  // 해당 index 번호를 변수 index에 저장
                    break;
                }
            }

            if (index > -1) {
//                저장된 index 번호를 기반으로 전화번호부에 있는 정보를 출력
                System.out.println(phoneBook[index].getName() + "의 번호" + phoneBook[index].getTel());
            }
            else  {
//                없을 경우 없다고 출력
                System.out.println(searchName + "이 없습니다.");
            }
        }



    }
}
