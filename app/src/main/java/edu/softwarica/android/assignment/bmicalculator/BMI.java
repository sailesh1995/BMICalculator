package edu.softwarica.android.assignment.bmicalculator;

public class BMI {
    private float weight, height, bmi;

    public BMI(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }


    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "BMI{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    public float bmiCalulate(){
        cmConverter(height);
        bmi = weight/ (height * height);
        return bmi;
    }

    public void cmConverter(float centimeter){
        height = centimeter / 100;
    }
}
