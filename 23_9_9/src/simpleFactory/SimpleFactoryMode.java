package simpleFactory;

public class SimpleFactoryMode {
    public static Operation createOperation(char sign){
        Operation operation = null;
        switch (sign) {
            case '+':
                operation = new addOperation();
                break;
            case '-':
                operation = new subOperation();
                break;
            case '*':
                operation = new mulOperation();
                break;
            case '/':
                operation = new DivOperation();
                break;
        }
        return operation;
    }
}
