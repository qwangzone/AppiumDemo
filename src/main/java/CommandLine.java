// 命令行参数的使用
public class CommandLine {
    public static void main(String[] args) {
        for (String wq : args) {
            System.out.println(wq);
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}
