import java.util.regex.Pattern;

public class ZhengZeCase1 {
    public static void main(String[] args){
        String content = "I am noob" + "from runoob.com.";
        String pattern = ".*runoob.*";
        boolean isMatch = Pattern.matches(pattern,content);
        System.out.println(isMatch);
        String a = "您好";
        String b = "您好，王大帅用户";
        System.out.println(b.contains(a));
    }
}
