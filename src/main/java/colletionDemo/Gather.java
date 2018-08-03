package colletionDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gather {
    public static void main(String[] args){
        List<String> ls = new ArrayList<>();
        ls.add("a");
        ls.add("b");
        ls.add("c");
        int i = (int)(Math.random()*ls.size()); //获得0-2之间的随机数
        Random random = new Random();
        int k = random.nextInt(2); //java生成随机数

        System.out.println("随机获取数组中的元素："+ ls.get(i));
        ls.remove(2); //删除指定位置的元素
        System.out.println("删除后数组元素为");
        for(int j=0;j<ls.size();j++){
            System.out.println(ls.get(j));
        }
    }
}
