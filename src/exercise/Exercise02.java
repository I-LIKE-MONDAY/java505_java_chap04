public class Exercise02 {
    public static void main(String[] args) {

//        2-2 : length 이용
        double sum = 0.0;
        double d[] = {1.0, 2.3, 3.4, 5.5};
        for(int i=0; i<d.length; i++) {
            sum += d[i];
        }
        System.out.println(sum);

//        2-3 : while
        int i = 0;
        sum = 0.0;
        while(i < d.length){
            sum += d[i];
            i++;
        }
        System.out.println(sum);

//        2-4 : do-while
        i = 0;
        sum = 0.0;
        do {
            sum += d[i];
            i++;
        }while(i<d.length);
        System.out.println(sum);

//        2-5 : for-each
        sum = 0;

        for(double s : d) {
            sum += s;
        } System.out.println(sum);

    }
}
