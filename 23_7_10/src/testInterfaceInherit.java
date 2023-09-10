/*
测试接口继承的性质
 */

public class testInterfaceInherit {
    interface test1{
        void speack1();
    }

    interface test2{
        void speack2();
    }

    interface test3 extends test1, test2{
        void speack3();
    }

    static class testInstatiation implements test3{
        @Override
        public void speack1() {
            System.out.println("test speack1");
        }

        @Override
        public void speack2(){
            System.out.println("test speack2");
        }

        @Override
        public void speack3() {
            System.out.println("test speack3");
        }
    }

    public static void main(String[] args) {
        testInstatiation testInstatiation = new testInstatiation();
        testInstatiation.speack1();
    }
}
