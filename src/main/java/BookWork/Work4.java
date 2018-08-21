package BookWork;

public class Work4 {

    //先计算阶乘
    public long fat(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fat(n - 1);
    }

    public static void main(String[] args) {
        Work4 wq = new Work4();
        //System.out.println(wq.fat(20));
        int i = 1;
        double tmp = 0.000;
        while (i <= 20) {
            tmp = tmp + (double)1 / (wq.fat(i));

            //System.out.println(wq.fat(i));
            i++;
        }
        System.out.println(tmp);

    }
}
