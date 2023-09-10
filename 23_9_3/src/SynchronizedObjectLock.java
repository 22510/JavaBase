public class SynchronizedObjectLock implements Runnable{

    static SynchronizedObjectLock instance = new SynchronizedObjectLock();;

    @Override
    public void run() {
        // ͬ���������ʽ������Ϊthis,�����߳�ʹ�õ�����һ����,�߳�1����Ҫ�ȵ��߳�0�ͷ��˸����󣬲���ִ��
        synchronized (this) {
            System.out.println("�����߳�" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "����");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
    }

}
