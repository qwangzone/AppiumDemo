public class TypeSwitch {
    public static void main(String[] args){
        //数字转换
        int a = 12;
        float b = (float) a;
        double c = (double) a;
        System.out.println(b);
        System.out.println(c);
        //自动类型转换
        char c1 = 'b';
        int i1 = c1;//char类型自动转换为int
        System.out.println(i1);
        char c2 = 'A';//定义一个char类型
        int i2 = c2+1;//char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于"+i2);
        //强制类型转换
        int q1 = 2000000;
        byte b1 = (byte)q1;
        System.out.println(b1);
        String s = "2";

    }
}
