package Entidades;

public class ParDeNumeros {
    
    private double num1;
    private double num2;

    public ParDeNumeros(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public ParDeNumeros() {
        num1=Math.random();
        num2=Math.random();
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
        

}
