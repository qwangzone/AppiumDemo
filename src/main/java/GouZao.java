public class GouZao {
    int x;int y;
    static int a;
    public  GouZao(int i){
        x = i;
        this.y = 12;
        this.a = 12;
    }
    public void wq(){

        this.y=22;
        System.out.println(y+a);
        System.out.println(this.y+13);
    }
    public static void wq1(){
        System.out.println(a);
        int wq = GouZao.a;
        GouZao t1 = new GouZao(3);
        System.out.println(t1.x);
    }
    public static void main(String[] args){
        GouZao t1 = new GouZao(20);
        GouZao t2 = new GouZao(30);
        System.out.println(t1.x + "  "+ t2.x);
        wq1();
        System.out.println(GouZao.a);
        t1.wq();
    }
}
