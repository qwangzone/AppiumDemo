import java.util.Scanner;

public class CharacterTest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        if (s.hasNext()){
            String q = s.next();
            System.out.println(q);
        }
        Character wq = 'q';
        String g = wq.toString();
        System.out.println(g.length());
        System.out.println(Character.getType(wq));
    }
}
