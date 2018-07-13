

public class ToStringTest {
    public static void main(String[] args){
        String wq = "wwwqq";
        int a = 12;
        Integer b =12;
        String c = "12";
        String d = b.toString();
        //第一种用法
        System.out.println(b.toString());
        //第二种用法
        System.out.println(Integer.toString(a));

        System.out.println(wq.toString());
    }
}
