//引用成员变量
public class ThisCaseTest {
    private int a;
    public ThisCaseTest(int a){
        this.a = a;//因为类变量与方法变量重名（都叫a），所以this关键字不能省略
    }
    public int getA(){
        return a;
    }
    public void setA(int a){
        this.a = a;
    }
}
