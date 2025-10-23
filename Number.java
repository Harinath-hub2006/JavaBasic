class MultiThreading {
    public static void main(String[] args) {
        Thread1 T1=new Thread1();
        Thread2 T2=new Thread2();
        T1.start();
        T2.start();
    }    
}
public class Number{
    synchronized static void odd(int n){
        for(int i=1;i<n;i+=2){
            System.out.println(i+"\n");
        }
    }
    synchronized static void even(int n){
        for(int i=2;i<n;i+=2){
            System.out.println(i+"\n");
        }
    }
} 
class Thread1 extends Thread{
    public void run(){
        Number.odd(10);
    }
}
class Thread2 extends Thread{
    public void run(){
        Number.even(10);
    }
}