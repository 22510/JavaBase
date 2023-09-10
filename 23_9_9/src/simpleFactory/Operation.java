package simpleFactory;

public class Operation {
    private double numberA = 0;
    private double numberB = 0;

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getNumberA() {
        return numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public double getResult() {
        return 0;
    }


}
