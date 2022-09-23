public class StaticMember {
    public static void main(String[] args) {
//        객체 생성 후 객체의 멤버를 사용
        StaticClass sc1 = new StaticClass();
        sc1.getInfo();
        System.out.println("나이 : " + sc1.age);
        System.out.println("이름 : " + sc1.name);

//        StaticClass.name = "유인나"    <<--- 바로 접근 불가능!, 이것을 가능하게 해주는 것이 static.

        StaticClass.job = "가수"; // <--- 이건 되는 이유?(static)
        System.out.println("static 직업 : " + StaticClass.job);
        StaticClass.getJob();

        System.out.println("\n------ ------\n");

//        Calc 클래스의 멤버 메서드인 abs, max, min 이 모두 정적 멤버이기 때문에 객체 생성 없이 클래스 이름으로 직접 접근이 가능함
//        정적 멤버는 해당 클래스를 객체화하여 사용 시 객체화된 모든 객체들과 함께 메모리 공간을 공유함
        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(10, 8));
        System.out.println(Calc.min(-3, -4));

//        객체를 생성해서 접근 해도 접근 자체는 가능함(정적 멤버도 객체 생성 후 사용이 가능함.
        Calc c = new Calc();
        System.out.println(c.abs(-5));
        System.out.println(c.max(10, 8));
        System.out.println(c.min(10, 8));


        Calc c1 = new Calc();
        Calc c2 = new Calc();

//        일반 멤버를 사용한 연산
        c1.iNum1 = 10;
        c1.iNum2 = 20;
        c1.iResult = c1.iNum1 + c1.iNum2;
        System.out.println("객체 c1의 iResult : " + c1.iResult);
        c2.iNum2 = 100;
        c2.iNum1 = 200;
        c2.iResult = c2.iNum1 + c2.iNum2;
        System.out.println("객체 c2의 Result : " + c2.iResult);
        System.out.println("객체 c1의 iResult : " + c1.iResult);   // 서로 영향받지 않음
        System.out.println();

//        정적 멤버를 사용한 연산
        c1.sNum1 = 10;
        c1.sNum2 = 20;
        c1.sResult = c1.sNum1 + c1.sNum2;
        System.out.println("객체 c1의 sResult : " + c1.sResult);

        c2.sNum1 = 100;
        c2.sNum2 = 200;
        c2.sResult = c2.sNum1 + c2.sNum2;
        System.out.println("객체 c2의 sResult : " + c2.sResult);
        System.out.println("객체 c1의 sResult : " + c1.sResult);   // 값이 30에서 300으로 바뀜
//        클래스에 붙어있기때문에 빌려와서 100, 200 입력하고 다시 제자리로 돌려놓는 느낌(공유)
        System.out.println("클래스의 sResult : " + Calc.sResult);

        System.out.println();

        // Tv.info = Tv.company + Tv.model;    <--- 원래는 이렇게 해야하지만

        System.out.println(Tv.info);    // <-- 정적 초기화블록으로 인해 info만 불러와도 됨

    }
}
