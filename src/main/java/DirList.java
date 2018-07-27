import java.io.File;
import java.io.IOException;

public class DirList {
    public static void main(String[] args) throws IOException {
        String dirname = ".";
        //创建File对象，用这个实例化对象来操作目录
        File f1 = new File(dirname);
//        System.out.println(f1.getAbsolutePath());
//        System.out.println(f1.getCanonicalPath());
//        System.out.println(f1.getPath());
        System.out.println(f1.list());
//        for (String l:f1.list()){
//            System.out.println(l);
//        }
        //判断f1是否是目录
        if (f1.isDirectory()){
            System.out.println("目录:"+ dirname);
            //定义目录列表
            String[] s = f1.list();

            for (int i = 0;i<s.length;i++){
                //创建f对象来判断目录
                File f  = new File(s[i]);
                if (f.isFile()){
                    System.out.println(s[i]+ "是一个文件");
                }
                else if (f.isDirectory()){
                    System.out.println(s[i]+ "是一个目录");
                }
                else if (f.isHidden()){
                    System.out.println(s[i] + "是hiddern");
                }
                else{
                    System.out.println(s[i] + "是absolute");
                }
            }
        }
        else{
            System.out.println(dirname + " 不是一个目录");
        }

    }
}
