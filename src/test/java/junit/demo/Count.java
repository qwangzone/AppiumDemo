package junit.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Count {
    /**
     * 计算并返回两个参数的和
     */
    public int add(int x,int y){
        return x+y;
    }

    public int division(int a ,int b){
        return a/b;
    }
//    public static void main(String[] args){
//        Count count = new Count();
//        int result = count.division(4,3);
//        System.out.println(result);
//    }
    @Test
    public void testadd(){
        assertEquals(add(2,3),5);
    }
}
