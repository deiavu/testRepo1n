package sk.itsovy.studnicka.vehicle;

import javax.swing.*;

public class Calculator {
    private String name;
    private boolean power;

    public Calculator() {
    }

    public Calculator(String name) {
        this.name = name;
        power = false;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPower() {
        return power;
    }

    public void turnOn() {
        power = true;
    }

    public void turnOff() {
        power = false;
    }

    public int add(int a, int b) {
        int result = a + b;
        if (isPower()) {
            return result;
        } else
            return 0;
    }

    public int calculateSquareArea(int a) {
        if (isPower())
            return a * a;
        else
            return 0;
    }

    public double convertCmtoInch(double value) {
        if (isPower())
            return value * 0.393;
        else
            return 0;

    }

    public double convertInchoCm(double value) {
        if (isPower())
            return value / 0.393;
        else
            return 0;
    }

    public void toggleCalculator() {
        if (isPower())
            turnOff();
        else
            turnOn(); // alebo power=!power
    }

    public String convertDecimaltoHexadecimal(int value) {
        if (isPower())
            return Integer.toBinaryString(value);
        else
            return null;
    }
//rozmer intiger
        //prepona double
    public double calculateDiagonalRectangle(int a, int b){ //c2=a2+b2
        if (isPower()) {
            double c = Math.sqrt((a*a) + (b*b)); //alebo, return Match.sqrt(Math.pow(a,2)+Math.pow(b,2))
            return c;
        }
        else {
            return 0;
        }


    }
    //obsah kruhu
    public double calculateCircleArea(double r) { // S=PI*r2
        if (isPower()) {
            return Math.PI * Math.pow(r, 2); //Math.pow namiesto (r*r) ..... Math-matematicka kniznica
        }
     else
        return 0;
    }

    public double calculateRectangleArea(double a, double b) {
        if (isPower()) {
            double s= a*b;
            return s;
        }
        else
            return 0;
    }

    public double calculateRectangleRadiusOfCircle(double u, int a, int b) { //polomer opisanej kruznice obdlznika
        if (isPower()) {
            double r =Math.sqrt(Math.pow(a, 2) * Math.pow(b, 2)) / 2;
            return r;
        }
        else
            return 0;
        }

        public double calculateConeVolume(double h, double r) { // objem kuzela
        if (isPower()) {
            double v = Math.PI * Math.pow(r, 2) * h / 3;
            return v;
        }
        else
            return 0;
        }


    public int calculateGetRoundNumber(double number) {
        if (isPower()) {
            double v = number % 2 + Math.round(number);
            int i = (int) v;
            return i;
        }
        else
            return 0;
    }
    // 3 cisla intiger, aritmeticky priemer 3 cisel
    public double getArithmeticallyAverage(int number1, int number2, int number3) {
        if (isPower()) {
            double v = (double) (number1+number2+number3) / 3; // explicitna typova konverzia ine riesenie / 3.0
            return v;
        }
        else
            return 0;
    }

    //

    public double calculateRectangularSurface(double number1, double number2, double number3) {
        if (isPower()) {
            double s = (2 * ((number1*number2)+(number1*number3)+(number2*number3)));
            return s;
        }
        else
            return 0;
    }

    public double calculateCircleVolume( double r) { // objem gule          zly vysledok opravit
        if (isPower()) {
            double v = (4.0 / 3 * Math.PI) * Math.pow(r, 3);
            return v;
        }
        else
            return 0;
    }

    //pozicka int mesiac int urok int suma, vystup mesacna splatka            opravit
    public double calcMonthInterestRate(int m, double u, double p){
        if (isPower()) {
            double v = p * ( 1 + p / 100) * Math.pow(m,m);
            return v;
        }
        else
            return 0;

    }

    // 5.) objem kvadra
    public double calcQuadSurface(double a, double b,double c){
        if (isPower()) {
            double s = 2 * ((a*b)+(a*c)+(b*c));
            return s;
        }
        else
            return 0;

    }


    // 5.) obsah kvadra
    public double calcQuadVolume(double a, double b, double c) {
        if (isPower()) {
            double v = a*b*c;
            return v;
        }
        else
            return 0;
    }

}

