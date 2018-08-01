package interfacedemo;

public class MammalInt implements Animal,Cat {
    public void eat(){
        System.out.println("Mammal eats");
    }

    public void travel(){
        System.out.println("Mammal travels");
    }

    public String wq(){
        System.out.println("w");
        return "w";
    }

    public void miao(){
        System.out.println("miaomao jiao");
    }

    public void sleep(){
        System.out.println("mao mi is sleeping");
    }

    public static void test(){
        System.out.println("what is this?");
    }

    public static void main(String[] args){
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
        m.wq();
        m.miao();
        m.sleep();
        test();
        System.out.println();

    }
}
