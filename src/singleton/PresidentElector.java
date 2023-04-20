package singleton;

public class PresidentElector {
    public static void main(String[] args) {
        President president1=President.getInstance("Macky Sall");
        System.out.println(president1);
        President president2=President.getInstance("Ousmane Sonko");
        System.out.println(president2);
        System.out.println(president1==president2);
    }
}
