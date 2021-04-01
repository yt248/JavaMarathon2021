package day11.task1;

public class Courier implements Worker {
    private int salary; // Заработная плата
    private boolean isPayed; //был выплачен бонус или нет

    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }


    @Override
    public void doWork() {
        warehouse.addCountDeliveredOrders();
        salary += 100;
        if (warehouse.getCountDeliveredOrders() == 10000) {
            this.isPayed = true;
            warehouse.setCountDeliveredOrders(0);
        }
    }

    @Override
    public void bonus() {
        if (this.isPayed) {
            salary += 50000;
            this.isPayed = false;
        } else if (!isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else {
            System.out.println("Бонус пока не доступен");
        }


    }
}
