package extendDemo;

public class Animal {
    private String name;
    private int id;
    public Animal(String Myname,int myid){
        this.name = Myname;
        this.id = myid;
    }
    public void eat(){
        System.out.println(this.name + "正在吃");
    }

    public void sleep(){
        System.out.println(this.name + "正在睡");
    }

    public void introdution(){
        System.out.println("我是: "+ id + name + ".");
    }
}

