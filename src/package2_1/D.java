package package2_1;

public class D {

//    public
    public String model;
    public String type;
    public String fuel;
//    private
    private String color;
    private String size;

    public void getMyCarInfo() {    // 클래스 내부에서만 클래스의 멤버끼리만 사용가능(private)
        System.out.println("색상 : " + this.color + "\n크기 : " + this.size);
    }
    private void setCarInfo(String color, String size) {
        this.color = color;
        this.size = size;
    }
}
