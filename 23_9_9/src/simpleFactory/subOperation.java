package simpleFactory;

public class subOperation extends Operation{

    @Override
    public double getResult(){
        return super.getNumberA() - super.getNumberB();
    }

}

