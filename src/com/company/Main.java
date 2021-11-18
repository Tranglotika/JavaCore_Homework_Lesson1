package com.company;

public class Main {

    public static void main(String[] args) {
//        --> Câu 1
        Calculator cal = new Calculator();
        cal.display(50, 28);

//        --> Câu 2
        BMI cau2a = new BMI();
        cau2a.bmivoid(1,45);

        Main m = new Main();
        double bmi = m.bmi(40,15);
        System.out.println("Chỉ số BMI có kiểu trả về là double có truyền tham số: " + bmi);

        System.out.println("Chỉ số BMI có kiểu trả về là double: "+cau2b());

    }

    public static double bmi(double weight, double height){
        return weight/(height*height);
    }
    public static double cau2b(){
        double weight2b = 25;
        double height2b = 35;
        double bmi2b = weight2b/(height2b*height2b);
        return bmi2b;
    }
}
