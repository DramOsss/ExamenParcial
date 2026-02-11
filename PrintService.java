public class PrintService{
    private PrintQueue queue;


    public PrintService(){
        this.queue = new PrintQueue();
    }

    public void submitJob(PrintJob printJob){
        queue.enqueue(printJob);
        System.out.println(" ENVIADO POR : " + printJob.getUser() + " CON PRIORIDAD: " + printJob.getPriority());
    }


    public PrintJob processNext(){
        PrintJob printJob = queue.dequeue();
        if(printJob != null){
            System.out.println(" IMPRIMIENDO : " + printJob.getUser() +"(" + printJob.getPages() + " PAGINAS, PRIORIDAD " + printJob.getPriority()+") ");
        }
        else {
            System.out.println(" NO HAY TRABAJOS EN COLA.");
        }

        return printJob;
    }


    public void ProcessAll(){
        System.out.println("\n PROCESANDO TODOS LOS TRABAJOS: ");
        while (!queue.isEmpty()){
            processNext();
        }
    }
}
