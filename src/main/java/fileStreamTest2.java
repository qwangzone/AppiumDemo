import java.io.*;

public class fileStreamTest2 {
    public static void main(String[] args) throws IOException {
        File f = new File("a.txt");

        FileOutputStream fop = new FileOutputStream("a.txt");

        OutputStreamWriter writer = new OutputStreamWriter(fop,"utf-8");
        writer.append("中文输入");
        writer.append("\r\n");
        writer.append("English");
        writer.close();
        fop.close();

        FileInputStream fip = new FileInputStream("a.txt");
        InputStreamReader reader = new InputStreamReader(fip,"utf-8");
        StringBuffer sb = new StringBuffer();
        while (reader.ready()){
            sb.append((char)reader.read());
        }
        System.out.println(sb.toString());
        reader.close();
        fip.close();

    }
}
