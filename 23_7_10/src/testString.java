public class testString {
    public static void main(String[] args) {
        String test1 = new String("hello"); // 堆
        String test2 = new String("hello");
        System.out.println(test1 == test2);
        String test3 = "hello"; // 内存池
        String test4 = "hello";
        System.out.println(test1.equals(test2));
        System.out.println(test3 == test1); // 内存池与堆
        System.out.println(test3 == test4);
        String test5 = test1.intern();
        System.out.println(test3 == test5); // 对象存储区域转移
    }
}
