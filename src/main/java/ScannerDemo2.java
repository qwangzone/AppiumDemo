import java.util.Scanner;

    public class ScannerDemo2 {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            double sum = 0;
            int m = 0;
            System.out.println("请输入数字：");
            while (scan.hasNextDouble()){
                double x = scan.nextDouble();
                m = m+1;
                sum = sum + x;
            }
            System.out.println(m + "个数的和为" + sum);
            System.out.println(m + "个数的平均值是" + (sum / m));
            scan.close();
        }
}
