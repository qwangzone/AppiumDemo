import java.io.*;

public class fileStreamTest {
    public static void main(String[] args) throws IOException {
        byte bwrite[] = {11,21,3,40,5};
        String a[] = {"wq","w"};
        FileOutputStream os = new FileOutputStream("test.txt");
//        for (int x=0;x<bwrite.length;x++){
//            os.write(bwrite[x]);
//
//        }
        os.write(bwrite);
        os.close();
        InputStream is = new FileInputStream("test.txt");
        int size = is.available();
        for (int i=0;i<size;i++){
            System.out.println((char) is.read());
        }
        is.close();

        }
        }
