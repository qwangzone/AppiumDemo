package extendDemo;

public class Mouse extends Animal {
    public Mouse(String Myname, int myid) {
        super(Myname, myid);
    }
    public void wq(){
        this.eat();
        this.sleep();
        super.introdution();
    }

    public static void main(String[] args){
        Mouse mouse = new Mouse("老鼠", 1);
//        mouse.eat();
//        mouse.sleep();
//        mouse.introdution();
        mouse.wq();
    }
}
