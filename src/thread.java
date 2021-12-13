class  MyThread1 extends Thread{
public void run(){
        Thread obj2 = Thread.currentThread();
        obj2.setName("xyz");
        System.out.println(10/0);
        for (int i = 0; i < 10; i++) {
        System.out.println("MyThread1"+i);
        }
        }
        }
public class thread {
    public static void main(String[] args) {
        MyThread1 obj = new MyThread1();
        Thread obj1 = Thread.currentThread();
        obj1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj1.getPriority());
        obj.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread "+i);
        }
    }
}
