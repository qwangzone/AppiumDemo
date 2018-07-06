public class GouZao {
    int x;
    public  GouZao(int i){
        x = i;
    }
    public static void main(String[] args){
        GouZao t1 = new GouZao(20);
        GouZao t2 = new GouZao(30);
        System.out.println(t1.x + "  "+ t2.x);
    }
}
