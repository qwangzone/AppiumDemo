import java.util.List;

public class ListLianxi {
    public static void main(String[] args){
        int[] a = new int[5];
        a[0] = 0;
        a[1] = 8;
        a[2] = 2;
        a[3] = 4;
        a[4] = 1;

        // 打印所有元素
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        // 打印数组长度
        System.out.println("数组长度为:" + a.length);
        // 打印所有元素总和
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum = sum + a[i];
        }
        System.out.println("元素之和为:"+ sum);

          // 查找最大元素
                    int max = a[0];
                    for(int i=0;i<a.length;i++){
                        if (a[i]>max){
                            max=a[i];
                        }

                    }
                    System.out.println("最大元素是:"+ max);
                    // 冒泡排序
                    for (int i=0;i<a.length;i++){
                        for (int j=0;j<a.length-1-i;j++){
                            if (a[j]<a[j+1]){
                                int wq = a[j];
                                a[j] = a[j+1];
                                a[j+1] = wq;
                }
            }
        }
        System.out.println("排序后:");
        for (int i=0;i<a.length;i++){

            System.out.print( a[i] + "  ");
        }
        // foreach 循环用法,不使用下标的情况下遍历数组
        System.out.println();
        for(int wq:a){
            System.out.print(wq+" ");
        }

        //System.out.println(a);
        //System.out.println(b);
    }
}
