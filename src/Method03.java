import java.util.Scanner;

public class Method03 {

    public static int input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 구구단 단수를 입력하세요 : ");
        int dansu = scanner.nextInt();
        return dansu;
    }

    public static void output(int dansu) {
        for (int i = 1; i < 10; i++) {
            System.out.println(dansu + " * " + i + " = " + dansu * i);
        }
    }

    public static int inputScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력해주세요 : ");
        int score = scanner.nextInt();
        String level = "F";
        return score;
    }

    public static String calLevel(int score) {
        String level = "F";
        if (score >= 90) {
            level = "A";
        } else if (score >= 80) {
            level = "B";
        } else if (score >= 70) {
            level = "C";
        } else if (score >= 60) {
            level = "D";
        }
        System.out.println("level : " + level);
        return level;
    }

    public static void printResult(int score, String level) {
        System.out.println("당신의 점수는 " + score + "점이고, 등급은 " + level + "입니다.");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("출력할 구구단 단수를 입력하세요 : ");
//        int dansu = scanner.nextInt();
//
//        for (int i = 1; i < 10; i++) {
//            System.out.println(dansu + " * " + i + " = " + dansu * i);
//        }

        int dansu = input();
        output(dansu);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("점수를 입력해주세요 : ");
//        int score = scanner.nextInt();
//        String level = "F";
//
//        if (score >= 90) {
//            level = "A";
//        } else if ( score >= 80) {
//            level = "B";
//        } else if ( score >= 70) {
//            level = "C";
//        } else if ( score >= 60) {
//            level = "D";
//        }
//
//        System.out.println("당신의 점수는 " + score + "점이고, 등급은 " + level + "입니다.");
        int score = inputScore();
        String level = calLevel(score);
        printResult(score, level);



//        Scanner scanner = new Scanner(System.in);

//        데이터 저장부분
        int kor = 0;
        int eng = 0;
        int math = 0;
        int total = 0;
        double avg = 0.0;
        String level2 = "F";

        kor = scoreinput("국어");
        eng = scoreinput("영어");
        math = scoreinput("수학");

        total = totalCal(kor, eng, math);
        System.out.println("총합 : " + total);
        avg = avgCal(total);
        System.out.println("평균 : " + avg);

        level2 = levelCal(avg);
        System.out.println("등급 : " + level2);

        printResult(total, avg, level2);

//        데이터 입력부분
//        System.out.print("국어 점수를 입력해주세요 : ");
//        kor = scanner.nextInt();
//        System.out.print("영어 점수를 입력해주세요 : ");
//        eng = scanner.nextInt();
//        System.out.print("수학 점수를 입력해주세요 : ");
//        math = scanner.nextInt();

//        총점 계산부분
//        total = kor + eng + math;
        
//        평균 계산부분
//        avg = (double)total / 3;

//        등급 계산부분
//        if (avg >= 90) {
//            level2 = "A";
//        } else if ( avg >= 80) {
//            level2 = "B";
//        } else if ( avg >= 70) {
//            level2 = "C";
//        } else if ( avg >= 60) {
//            level2 = "D";
//        }
//        출력 부분
//        System.out.println("당신의 총점은 " + total + "이고, 당신의 평균은 " + avg + ", 등급은 " + level2 + "입니다.");



    }

    public static int scoreinput(String course) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(course + "점수를 입력해주세요 : ");
        int score = scanner.nextInt();

        return score;

    }

    public static int totalCal(int kor, int eng, int math) {
        return kor + eng + math;
    }

    public static double avgCal(int total) {
        return (double)total / 3;
    }

    public static String levelCal(double avg) {
        String level2 = "F";
        if (avg >= 90) {
            level2 = "A";
        } else if ( avg >= 80) {
            level2 = "B";
        } else if ( avg >= 70) {
            level2 = "C";
        } else if ( avg >= 60) {
            level2 = "D";
        }
        return level2;
    }

    public static void printResult(int total, double avg, String level2) {
        System.out.println("당신의 총점은 " + total + "이고, 당신의 평균은 " + avg + ", 등급은 " + level2 + "입니다.");
    }
}