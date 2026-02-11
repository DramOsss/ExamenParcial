public class PrintQueue {

    private SimpleQueue<PrintJob> hQueue;
    private SimpleQueue<PrintJob> mQueue;
    private SimpleQueue<PrintJob> lQueue;

    public PrintQueue() {
        hQueue = new SimpleQueue<>();
        mQueue = new SimpleQueue<>();
        lQueue = new SimpleQueue<>();

    }

    public void enqueue(PrintJob printJob) {
        switch (printJob.getPriority()){
            case 'H':hQueue.enqueue(printJob);break;
            case 'M':mQueue.enqueue(printJob);break;
            case 'L':lQueue.enqueue(printJob);break;
            default: mQueue.enqueue(printJob);

        }
    }

    public PrintJob dequeue() {
        if(!hQueue.isEmpty()) return hQueue.dequeue();
        if(!mQueue.isEmpty()) return mQueue.dequeue();
        if(!lQueue.isEmpty()) return lQueue.dequeue();
        return null;
    }

    public boolean isEmpty() {
        return hQueue.isEmpty() && mQueue.isEmpty() && lQueue.isEmpty();
    }

}
