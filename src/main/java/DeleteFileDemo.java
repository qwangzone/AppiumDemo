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
        if(file !=null){
            for (File f:file){
                if (f.isDirectory()){
                    deleteFolder(f);
                }
                else {
                    f.delete();
                }
            }
        }
        folder.delete();
    }
}
