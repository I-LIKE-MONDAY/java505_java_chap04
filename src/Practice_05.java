import java.util.Arrays;
import java.util.Scanner;

public class Practice_05 {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int intArray[];
//        intArray = new int[10];
//        System.out.print("숫자 10개를 입력하세요 >>");
//        for (int i=0; i<10; i++){
//            intArray[i] = scanner.nextInt();
//            for(int j=0; j<10; j++) {
//                if (intArray[i] < intArray[j]) {
//                    System.out.println(intArray[j]);
//                } else if (intArray[i] > intArray[j]) {
//                    System.out.println(intArray[i]);
//                }
//            }
//        }

//        sort 사용법
//        int nums[] = {10, 50, 80, 70, 20};
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }
//        System.out.println();
//
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }

//        5문제 : 정수를 10개 입력받아 배열에 저장하고 (<-- 메서드로 구현)
//                증가 순으로 정렬하여 출력하라 (<-- 메서드로 구현)

//        int intArray[];
//        intArray = new int[10];
//        입력 부분
//        System.out.print("숫자 10개를 입력하세요 >>");
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = scanner.nextInt();
//        }
//
//        정렬부분
//        Arrays.sort(intArray);
//        출력부분
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.print(intArray[i] + " ");
//        }
//        inputArray();

        printArray(inputArray());

//        sort 알고리즘

//        for(int i=0; i<intArray.length; i++) {
//            for (int j=1; j<intArray.length; j++) {
//                int tmp = intArray[i];
//                intArray[i] = intArray[j]
//                intArray[j] = tmp;
//            }
//        }
    }

    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        int intArray[];
        intArray = new int[10];
        System.out.print("숫자 10개를 입력하세요 >>");
        for (int i = 0; i < 10; i++) {
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    public static void printArray(int intArray[]) {
        Arrays.sort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}

