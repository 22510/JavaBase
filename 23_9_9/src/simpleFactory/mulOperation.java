package simpleFactory;

public class mulOperation extends Operation {

    @Override
    public double getResult() {
        return super.getNumberA() * super.getNumberB();
    }
}
