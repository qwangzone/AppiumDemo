

public class DefJava {
    public static int max(int num1, int num2) {
        int result = 0;
        if (num1 > num2) {
            result = num1;
        }
        if (num1 < num2) {
            result = num2;
        }
        return result;


    }

    // 方法的重载，就是说一个类的两个方法拥有相同的名字，但是有不同的参数列表。
    //Java编译器根据方法签名判断哪个方法应该被调用。
    public static double max(double num1, double num2) {
        double result = 0;
        if (num1 > num2) {
            result = num1;
        }
        if (num1 < num2) {
            result = num2;
        }
        return result;
    }

    public static void printGrade(double score) {
        if (score >= 90.0) System.out.println('A');
        else if (score >= 80.0) System.out.println('B');
        else if (score >= 70.0) System.out.println('C');
        else if (score >= 60.0) System.out.println('D');
        else System.out.println('D');


    }

    public static void nPrintln(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        System.out.println(max(1, 3.2));
        System.out.println(max(1, 22));
        printGrade(90);
        nPrintln("xiaomi", 3);
    }
}
