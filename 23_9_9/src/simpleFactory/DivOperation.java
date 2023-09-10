package simpleFactory;

public class DivOperation extends Operation{

    @Override
    public double getResult() {
        if (super.getNumberB() != 0){
            return super.getNumberA() / super.getNumberB();
        }else{
            throw new RuntimeException("被除数应非0");
        }
    }
}
