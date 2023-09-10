
public class testGeneric {
    public static void main(String[] args) throws ClassNotFoundException {
        DateInter dateInter = new DateInter();
        dateInter.setValue("123");
        String s = "123";
        String s2 = new String("123");
        System.out.println(dateInter.getValue()== s );
        System.out.println(dateInter.getValue()== s2 );
    }
    static class Pair<T> {

        private T value;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }
    static class DateInter extends Pair<String> {

        @Override
        public void setValue(String value) {
            super.setValue(value);
        }

        @Override
        public String getValue() {
            return super.getValue();
        }
    }
}
