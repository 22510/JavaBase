import java.util.regex.Pattern;

public class RegulerTest {
    public static void main(String[] args) {
//        String content = "I am noob " +
//                "from runoob.com.";
//
//        String pattern = ".*runoob.*";
//
//        boolean isMatch = Pattern.matches(pattern, content);
//        System.out.println("×Ö·û´®ÖÐÊÇ·ñ°üº¬ÁË 'runoob' ×Ó×Ö·û´®? " + isMatch);
//        String pattern = "nam.";
//
//        Pattern regex = Pattern.compile(pattern);
//        System.out.println(regex.matcher("name").find());
//        System.out.println(regex.matcher("nam").find());

        String pattern  = "[0-9]";
        Pattern regex = Pattern.compile(pattern);
        System.out.println(regex.matcher("name").find());
        System.out.println(regex.matcher("n1me").find());
        String patter2 = "[^0-9]";
        Pattern regex2 = Pattern.compile(patter2);
        System.out.println(regex2.matcher("name").find());
        System.out.println(regex2.matcher("0123").find());
        String patter3 = "abc[^0-9]";
        Pattern regex3 = Pattern.compile(patter3);
        System.out.println(regex3.matcher("abce").find());
        System.out.println(regex3.matcher("abc1").find());

    }
}
