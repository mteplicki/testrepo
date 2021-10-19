package zad10;

public class App {
	public static void main(String[] args){
        System.out.println( "Hello World!" );
        Class1 class1 = new Class1(Integer.parseInt(args[0]));
        Class2 class2 = new Class2(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        System.out.println(class1.geta1()+class2.geta1()+2*class2.geta2());
    }
}