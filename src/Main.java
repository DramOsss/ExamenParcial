//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PrintService service = new PrintService();



        PrintJob job1 = new PrintJob("Jose",10,'L');
        PrintJob job2 = new PrintJob("Jose",10,'H');
        PrintJob job3 = new PrintJob("Jose",10,'M');
        PrintJob job4 = new PrintJob("Jose",10,'H');
        PrintJob job5 = new PrintJob("Jose",10,'L');
        PrintJob job6 = new PrintJob("Jose",10,'L');


        service.submitJob(job1);
        service.submitJob(job2);
        service.submitJob(job3);
        service.submitJob(job4);
        service.submitJob(job5);
        service.submitJob(job6);


        service.ProcessAll();




    }
}