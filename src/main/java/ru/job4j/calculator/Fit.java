package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short manHeight = 183;
        short womenHeight = 164;
        double man = Fit.manWeight(manHeight);
        System.out.println("Man 183 is " + man);
        double women = Fit.womanWeight(womenHeight);
        System.out.println("Women 164 is " + women);
    }
}
