package subject;

import package2_1.C;

class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    
    public int getRadius() {
        return this.radius;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
class CircleManager{    // static 메소드만 가짐
    static void copy(Circle src, Circle dest) {    // src를 dest에 복사
        dest.setRadius(src.getRadius());    // src의 반지름을 dest에 복사
    }
    public boolean equals(Circle a, Circle b) {    // a와 b의 반지름이 같으면 true 리턴
        if(a == b) {
            return true;
        }
        else {
            return false;
        }
    }
}

