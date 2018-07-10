//引用构造方法
public class ThisCaseTest2 {
    int a;
    public ThisCaseTest2(){
        this(0);//这里在不带参数的构造方法内部，使用this调用了另外一个构造方法，其中0是根据需要传递的参数的值
    }
    public ThisCaseTest2(int a){
        this.a = a;
    }
}
