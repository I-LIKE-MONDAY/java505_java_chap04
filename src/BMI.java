public class BMI {
    public String name;
    public double height;
    public int weight;
    public double bmi;

    public double getBmi() {
        return bmi;
    }

    public void setMyInfo(double height, int weight) {
        this.height = height / 100.0;
        this.weight = weight;
        calcBmi(this.height, this.weight);
    }

    private void calcBmi(double height, int weight) {
//        BMI = 몸무게 / (신장 X 신장)
        this.bmi = (double)weight / (height * height);
    }




}
