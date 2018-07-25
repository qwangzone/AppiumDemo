import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCase {
    public static void main(String[] args){
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E D yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println(ft.format(date));
        long a = date.getTime();
        System.out.println(a);
        System.out.printf("%tR",date);

        Calendar c1 = Calendar.getInstance();
        System.out.println();
        System.out.println(c1.get(Calendar.YEAR));
        System.out.println(c1.get(Calendar.MONTH)+1);
        System.out.println(c1.get(Calendar.DATE));
    }
}
