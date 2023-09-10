import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class differ {
    static class ThreadUnSaferExample{
        private  int cnt = 0;
        public void add(){
            cnt++;
        }

        public void get(){
            System.out.println(cnt);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        final int size = 100;
        ThreadUnSaferExample example = new ThreadUnSaferExample();
        final CountDownLatch latch = new CountDownLatch(size);
        ExecutorService executor = Executors.newCachedThreadPool();
        for(int i = 0; i < size; i++){
            executor.execute(() -> {
                example.add();
                latch.countDown();
            });
        }
        latch.await(10, TimeUnit.SECONDS);
        executor.shutdown();
        example.get();
    }
}
