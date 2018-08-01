package abstractdemo;

public class AbstractDemo {
    public static void main(String[] args){
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();

        System.out.println(s.getName());
        System.out.println(e.getName());
    }
}
