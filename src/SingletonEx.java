public class SingletonEx {
    public static void main(String[] args) {
//        (1) 싱글톤은 new 사용할수없음
//        Singleton singleton1 = new Singleton();   // <<-- 오류, private Singleton() { } 삭제하면 생성 가능
//        Singleton singleton2 = new Singleton();   // <<-- 오류, private Singleton() { } 삭제하면 생성 가능


//        (2) 싱글톤 디자인패턴 방식을 사용하여 객체를 생성
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // (1) 방식 -> singleton1, singleton2 메모리주소 다름
        // (2) 방식 -> singleton1, singleton2 메모리주소 같음
        System.out.println(singleton1);
        System.out.println(singleton2);

        if (singleton1 == singleton2) {

            System.out.println("두 객체가 같다.");
        } else {
            System.out.println("두 객체가 다르다");
        }

    }
}
