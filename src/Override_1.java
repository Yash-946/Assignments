public class Override_1 {
    public void show(){
        System.out.println("parent");
    }
}
class Child extends Override_1{
    public void show(){
        System.out.println("child");
    }
}
class Main0{
    public static void main(String[] args) {
        Override_1 obj = new Override_1();
        obj.show();
        Override_1 obj2 = new Child();
        obj2.show();
    }
}
