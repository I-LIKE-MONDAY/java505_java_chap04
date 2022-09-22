public class Exercise01 {
    public static void main(String[] args) {
        int i = 0, sum = 0;
        while (i < 10) {
            i = i + 2;
            sum += i;
        }
        System.out.println(sum);

        i = 0;
        sum = 0;
        while (true) {
            i = i + 2;
            sum += i;
            if (i > 10) {
                break;
            }System.out.println(sum);
        }

        i = 0;
        sum = 0;

        do {
            i = i + 2;
            if(i>10) continue;
            sum += i;
        } while(i<10);
        System.out.println(sum);

    }
}
