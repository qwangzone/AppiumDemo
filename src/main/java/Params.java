public class Params {
    public static void pringMax(double... numbers){
        if (numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]>result){
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }
    public static void main(String[] args){
        //调用可变参数方法
        pringMax(12,3,4,23,212,43.4);
        pringMax(new double[] {12,3,4,53.4});
    }
}
