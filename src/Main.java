public class Main {
    public static void main(String[] args) {
//        Circle 클래스 타입의 변수 pizza 생성
        Circle pizza;
//        Circle 클래스 타입의 변수 pizza에 Circle 클래스 객체의 주소를 저장
//        new : 힙 메모리 영역에 지정한 클래스의 객체 메모리 공간을 할당
//        Circle() : Circle 클래스 타입의 객체를 생성
        pizza = new Circle();

        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle();
//        Circle 클래스는 설계도이기때문에 혼자서는 어떠한 행동도 할 수 없음..
//        객체를 생성함으로써 Circle클래스의 실체가 생성됨
//        객체가 생성되면 해당 클래스에 포함된 멤버들을 사용할 수 있음
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);

//        Car car1 = new Car();
//        car1.stop();
//        System.out.println(car1.gas);
//        System.out.println(car1.name);

        Car car2 = new Car("토레스","SUV","가솔린", "준중형");
        System.out.println(car2.name);
        System.out.println(car2.type);
        System.out.println(car2.gas);
        System.out.println(car2.size);









    }


}