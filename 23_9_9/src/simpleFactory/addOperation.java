package simpleFactory;

public class addOperation extends Operation{

    @Override
    public double getResult() {
        return super.getNumberA() + super.getNumberB();
    }

}
