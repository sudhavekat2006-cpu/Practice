class MyThread extends  Thread{
    public void run(){
        System.out.println("This is a thread");
    }
    public  void start(){
        System.out.println("This is a start  thread");

    }



}




public abstract class Thread{
    public static void main(String[] args){
        MyThread mythread=new MyThread();
        mythread.start();
        System.out.println("This is main class");
    }

    public void start() {
    }

    public void join() {
    }

    public abstract void run();
}