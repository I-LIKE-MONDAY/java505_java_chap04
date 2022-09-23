public class Singleton {
//    private 접근제한자 : private로 지정된 멤버는 해당 클래스 내에서만 사용이 가능함.
    private static Singleton singleton = new Singleton();

//    생성자의 접근제한자에 private를 사용하면 객체 생성 시 new 키워드를 사용할 수 없음.( = 메모리에 등록이 안됨 = 객체로 만들수 없음)
//    객체 생성이 불가능
    private Singleton() { }

//    객체로 만들지못하니까 클래스타입으로 접근
    public static Singleton getInstance() {
        return singleton;
    }
}
