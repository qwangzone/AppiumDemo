import java.io.OutputStream;

public class fileStreamTest {
    public static void main(String[] args){
        try {
            byte bwrite[] = {11,21,3,40,5};
            OutputStream os = new fileOutputStream("test.txt");
        }
    }
}
