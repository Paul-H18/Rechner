package de.paul.math;

public class Operation {

    public Operation() {

    }


    private double a, b;

    public enum op {
        PLUS, MINUS, MULTIPLICATION, DIVISION, FACULTY;
    }

    op operation;

    public double getResult() {
        double result;
        switch(this.operation) {
            case PLUS:
                result = this.a + this.b;
                break;
            case MINUS:
                result = this.a - this.b;
                break;
            case MULTIPLICATION:
                result = this.a * this.b;
                break;
            case DIVISION:
                result = this.a / this.b;
                break;
            default:
                result = 0;
                break;
        }

        return result;
    }



    public void setOperation(op operation) {
        this.operation = operation;
        System.out.println("Operation set: " + this.operation);
    }

    public void setA(double a) {
        this.a = a;
    }


    public void setB(double b) {
        this.b = b;
    }


    public double getA() {
        return this.a;
    }


    public double getB() {
        return this.b;
    }

    public op getOperation() {
        return this.operation;
    }


}
