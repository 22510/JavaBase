import java.util.concurrent.Callable;

public class CallableTest {
    public static class MyCallable implements Callable<Integer> {
        @Override
        public Integer call(){
            return 123;
        }
    }
}
