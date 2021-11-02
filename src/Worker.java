public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;



    public Worker(OnTaskDoneListener listener, OnTaskErrorListener badListener) {
        this.errorCallback = badListener;
        this.callback = listener;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            callback.onDone("Task " + i + " is done");
        }
    }

    public void badStart() {
        for (int i = 0; i < 100; i++) {
            errorCallback.onError("Task " + i + " is done");
            if(i == 33) {
                errorCallback.onError("Task" + i + "is not completed");
            }
        }
    }
}