import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.io.*;

public class fileStreamTest3 {
    public static void main(String[] args) throws IOException {
        //写入文件
        FileOutputStream fop = new FileOutputStream("test2.txt");
        //按字节方式写入，主要用来处理音频，视频文件
        fop.write('w');
        //按字符方式写入，
        OutputStreamWriter writer = new OutputStreamWriter(fop,"utf-8");
        writer.append("ww");
        writer.close();
        fop.close();

        //读取文件
        FileInputStream fip = new FileInputStream("test2.txt");
        //按字节方式读取，主要用来处理音频，视频文件
        int size = fip.available();
        StringBuilder sm = new StringBuilder();
        for (int i=0;i<size;i++){
           // System.out.println((char)fip.read());
            sm.append((char)fip.read());
        }
        System.out.println(sm.toString());

        //按字符方式读取
        InputStreamReader reader = new InputStreamReader(fip,"utf-8");
        StringBuilder sb = new StringBuilder();
        while (reader.ready()){
            sb.append((char)reader.read());
        }
//        int size = fip.available();
//        for (int i=0;i<size;i++){
//            sb.append((char)reader.read());
//        }

        System.out.println(sb.toString());
        reader.close();
        fip.close();



    }
}
