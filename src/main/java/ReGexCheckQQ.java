import java.text.SimpleDateFormat;
import java.util.Formatter;

public class ReGexCheckQQ {

    public static void main(String[] args) {
        checkQQ2("0123134");
        String wq = "思考思考";
        Formatter f = new Formatter(System.out);
        f.format("格式化输出%s %d","wq",12343);
        System.out.println();
        System.out.printf("我是个大%s","帅比");
    }

    public static void checkQQ2(String qq) {
        String reg = "[1-9][0-9]{4,14}";
        System.out.println(qq.matches(reg) ? "合法qq" : "非法qq");
    }
}

