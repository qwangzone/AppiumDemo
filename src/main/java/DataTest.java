import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest {
    public static void main(String[] args){
        Date da = new Date();
        long w = da.getTime();
        System.out.println(da.getTime());
        System.out.println(da.toString());
        System.out.println(da.hashCode());
        da.setTime(w);
        System.out.println(da.getTime());
        //日期格式化
        SimpleDateFormat st = new SimpleDateFormat("E yyyy.mm.dd hh:mm:ss a zzz");
        System.out.println(st.format(w));
    }
}
