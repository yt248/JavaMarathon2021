package day11.task1;

public class Picker implements Worker {


    private int salary; // Заработная плата
    private boolean isPayed; //был выплачен бонус или нет

    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;

    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
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
        warehouse.addCountPickedOrders();
        salary += 80;
        if (warehouse.getCountPickedOrders() == 10000) {
            this.isPayed = true;
            warehouse.setCountPickedOrders(0);
        }
    }

    @Override
    public void bonus() {
        if (this.isPayed) {
            salary += 70000;
            this.isPayed = false;
        } else if (!this.isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else {
            System.out.println("Бонус пока не доступен");
        }

    }
}
