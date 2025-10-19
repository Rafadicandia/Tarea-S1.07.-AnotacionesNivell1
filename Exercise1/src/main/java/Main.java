public class Main {
    public static void main(String[] args) {

        Worker w1 = new Worker("Jhon", "Jhonson", 40.6);
        OnlineWorker w2 = new OnlineWorker("Samuel", "L. Jackson", 78.3);
        PresentWorker w3 = new PresentWorker("Diego", "De la Vega", 100);

        System.out.println(w1.name + w1.calculateSalary(100));
        w2.calculateSalary(100);
        w3.calculateSalary(100);



    }
}
