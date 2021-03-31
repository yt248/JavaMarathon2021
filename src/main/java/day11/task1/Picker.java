package day11.task1;

public class Picker implements Worker {


    private int salary; // Заработная плата
    private int isPayed; //был выплачен бонус или нет

    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;

    }

    public int getSalary() {
        return salary;
    }

    public int getIsPayed() {
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
        int counter = warehouse.getCountPickedOrders();
        salary += 80;
        counter++;
        warehouse.setCountPickedOrders(counter);
        if (counter == 10000) {
            this.isPayed = 1;
            warehouse.setCountPickedOrders(0);
        }
    }

    @Override
    public void bonus() {
        if (this.isPayed == 1) {
            salary += 70000;
            this.isPayed = 2;
        } else if (this.isPayed == 2) {
            System.out.println("Бонус уже был выплачен");
        } else {
            System.out.println("Бонус пока не доступен");
        }

    }
}
