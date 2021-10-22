public class Main {
    public static void main(String[] args) throws InterruptedException {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener badListener = System.out::println;

        Worker worker = new Worker(listener);
        Worker badWorker = new Worker(badListener);

        worker.start();
        System.out.println();
        Thread.sleep(3000);
        badWorker.badStart();
    }
}
