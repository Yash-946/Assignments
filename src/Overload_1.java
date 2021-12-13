public class Overload_1 {
    public void show(int x){
        System.out.println(x);
    }
    public void show (String s){
        System.out.println(s);
    }
}
class Main123{
    public static void main(String[] args) {
        Overload_1 obj = new Overload_1();
        obj.show("hello");
        obj.show(100);

    }
}
