// 실행용 클래스
public class Method05 {

    public static void incall() {
        System.out.println("Method05 클래스의 멤버 메서드");
    }
//    프로그램을 실행하기 위한 main 메서드가 존재
    public static void main(String[] args) {
//        메소드 호출하기
//        1. 클래스 내부 호출 : 동일한 클래스의 멤버끼리 호출하는 것
//        2. 클래스 외부 호출 : 다른 클래스의 객체를 생성하고 해당 객체의 멤버를 호출하는 것

        incall();   // <-- 클래스 내부호출

//        Car2 클래스 타입의 변수 avante를 선언;
//        new : 메모리 공간에 생성자를 통해 생성된 객체를 등록하고, 등록된 메모리 주소를 반환한다.
//        생성자 : 지정한 클래스를 기반으로 객체를 생성
        Car2 avante = new Car2();    // <-- 클래스 외부호출 : [Car2.~] 로 불러올수없으므로 객체를 새로 생성해줘야 함
//                                          Car2 클래스 객체가 생성되고 Car2 클래스 타입의 변수 avante에 대입되어 사용 준비가 완료됨.
//        클래스 외부 호출, `객체`의 멤버 호출
//        avante라는 객체를 생성하고나서 .run() 등의 `클래스`의 멤버를 호출하면 클래스의 멤버가 아니라 객체의 멤버가 됨
        avante.name = "아반떼";
        avante.run();
        avante.stop();
        avante.sound();

//        Car2 클래스 타입의 객체 생성
        Car2 sonata = new Car2();
        sonata.name = "소나타";
        sonata.run();
        sonata.stop();
        sonata.sound();


//        Car3 클래스 이용
        Car3 car = new Car3();
        car.info();

//        Car4 클래스 이용
        Car4 toress = new Car4("토레스", "SUV");
        toress.info();

        Car4 santafe = new Car4("싼타페", "SUV");
        santafe.info();

//        생성자 오버로딩(동일한 이름의 생성자를 여러개 사용)
        Car4 canival = new Car4();
        canival.name = "카니발";
        canival.type = "SUV";
        canival.info();

        Car5 grander1 = new Car5();
        grander1.getInfo();

        Car5 grander2 = new Car5("K7", "세단");


//        메소드 오버로딩(동일한 이름의 메소드를 여러개 사용)
        Car5 k7 = new Car5("k7", "세단", "준대형");
        k7.getInfo();
        k7.getInfo("전기");
        k7.getInfo("가솔린", 4000);
        k7.getInfo("가솔린", "4000");
        k7.getInfo(4000, "경유");

        sum(10, 20);
        sum(3.14, 5.28);


    }

    public static void sum(int a, int b) {
        int result = a + b;
        System.out.println("두 수의 덧셈은 : " + result + "입니다.");
    }
    public static void sum(double a, double b) {
        double result = a + b;
        System.out.println("두 수의 덧셈은 : " + result + "입니다.");
    }

    public static void sum(int a, double b) {
        double result = a + b;
        System.out.println("두 수의 덧셈은 : " + result + "입니다.");
    }

    public static void sum(double a, int b) {
        double result = a + b;
        System.out.println("두 수의 덧셈은 : " + result + "입니다.");
    }
}
