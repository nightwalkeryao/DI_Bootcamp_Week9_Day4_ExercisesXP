package exercise2;

public class MyRunnable implements Runnable {
    
    @Override
    public void run() {
        System.out.println("Le thread a démarré");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Le thread a été interrompu");
        }
        System.out.println("Le thread a terminé");
    }
}