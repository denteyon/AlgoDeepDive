public class Sleepsort {
    public static void sleepsort(int[] arr) {

        MyThread temp = new MyThread(0);

        for (int i = 0; i < arr.length; i++) {
            // Create Thread class
            temp = new MyThread(arr[i]);
            temp.start();
        }
        
        try {
            temp.join(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        sleepsort(new int[] { 4, 5, 2, 1 });
    }
}

class MyThread extends Thread {
    int num;

    public MyThread(int i) {
        num = i * 1000;
    }

    @Override
    public void run() {
        // Your Code
        try {
            Thread.sleep(num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread no. "+ num);

    }
}