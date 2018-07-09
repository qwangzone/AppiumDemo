public class StringCase {
    public static void main(String[] args) {
        String a = "wangqi";
        String b = new String("wangqi");
        StringBuilder c = new StringBuilder("wangqi");
//        System.out.println(a.length());
//        System.out.println(a.charAt(3));
        System.out.println(a.equals(b));  //true
        System.out.println(a.contentEquals(b)); //true
        System.out.println(a.equals(c)); //false
        System.out.println(a.contentEquals(c)); //true
        c.append("aa");
        System.out.println(c);
        c.insert(0,"l");
        System.out.println(c);
        System.out.println(c.reverse());
        System.out.println(c);
    }
}
