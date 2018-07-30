import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args){
        File f = new File("./test1");
        File[] s = f.listFiles();
        for(File l:s){
            System.out.println(l);
        }
        DeleteFileDemo de = new DeleteFileDemo();
        de.deleteFolder(f);

    }
    //删除文件及目录
    public void deleteFolder(File folder){
        File[] file = folder.listFiles();
        //判断文件是否为空，
        if(file !=null){
            for (File f:file){
                if (f.isDirectory()){
                    //如果文件夹不为空则再次遍历文件夹，在函数中调用函数（递归），
                    deleteFolder(f);
                }
                else {
                    f.delete();
                }
            }
        }
        //如果为空则直接删除
        folder.delete();

    }
}
