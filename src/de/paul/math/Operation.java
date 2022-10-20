package de.paul.math;

public class Operation {

    public Operation() {

    }


    private int a, b;

    public enum op {
        PLUS, MINUS, MULTIPLICATION, DIVISION;
    }

    op operation;

    public int getResult() {
        int result;
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

    public void setA(int a) {
        this.a = a;
    }


    public void setB(int b) {
        this.b = b;
    }


    public int getA() {
        return this.a;
    }


    public int getB() {
        return this.b;
    }

    public op getOperation() {
        return this.operation;
    }


}
