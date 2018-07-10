import org.testng.annotations.Test;

//代表自身对象
public class ThisCaseTest3 {
    ThisCaseTest3 instance;
    public ThisCaseTest3(){
        instance = this;
        //在构造方法内部，将对象this的值赋值给instance，
        // 在test方法内部，输出对象this的内容，这里的this都代表自身类型的对象
    }
    @Test
    public void test(){
        System.out.println(instance);
    }
}
// 引用成员方法
//
//在一个类的内部，成员方法之间的互相调用时也可以使用“this.方法名(参数)”来进行引用，
// 只是所有这样的引用中this都可以省略，所以这里就不详细介绍了。