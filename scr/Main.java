package scr;

public class Main {
    public static void main(String[] args) {

        printThreeWords();
        compareNumbers();
        test1();

        }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void compareNumbers() {
        int a = 10;
        int b = 10;
        if (a>=b){
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
    public static void test1() {
        System.out.println("Test1");
    }



}
