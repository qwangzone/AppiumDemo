import java.util.Arrays;

public class ListTest {
    public static void output(int[] array) {
        if (array != null) {
            for (int i : array) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void output(String[] array){
        if (array !=null){
            for(String i:array){
                System.out.print(i + " ");
            }
        }
        System.out.println();
}
    public static void main(String[] args){
        String[] wq = {"www","baidu","com"};
        int[] ww = new int[5];
        int[] ww1 = {2,3,1,8,6,4,9,10};
        //填充数组
        Arrays.fill(ww,5);
        Arrays.fill(wq,"p");
        output(wq);
        output(ww);
        //对数组的第1个到第3个进行排序进行排序
        Arrays.sort(ww1,0,4);
        // 对整个数组进行排序
        Arrays.sort(ww1);
        output(ww1);
        // 比较数组元素是否相等
        System.out.println(Arrays.equals(ww,ww1));
        System.out.println(Arrays.binarySearch(ww1,7));
    }


}