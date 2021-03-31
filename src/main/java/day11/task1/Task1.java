package day11.task1;

public class Task1 {
    public static void main(String[] args) {

        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);

        System.out.println("--------businessProcess-picker1---------");
        businessProcess(picker1);
        System.out.println("--------businessProcess-courier1---------");
        businessProcess(courier1);

        System.out.println("--------getCountDeliveredOrders----------");
        System.out.println(warehouse1.getCountDeliveredOrders());
        System.out.println("--------getCountPickedOrders----------");
        System.out.println(warehouse1.getCountPickedOrders());
        System.out.println("--------picker1.getSalary()----------");
        System.out.println(picker1.getSalary());
        System.out.println("--------courier1.getSalary()----------");
        System.out.println(courier1.getSalary());

        System.out.println("------------------");
        System.out.println(warehouse1.toString());
        courier2.doWork();
        picker2.doWork();
        System.out.println(warehouse1.toString());
        System.out.println(courier1.toString());
        System.out.println(picker1.toString());
        System.out.println(warehouse2.toString());
        System.out.println(picker2.toString());
        System.out.println(courier2.toString());



    }
    static void businessProcess(Worker worker){
        for (int i = 0; i < 10000; i ++){
            worker.doWork();
        }
        worker.bonus();
    }
}
