package day7;

public class Airplane {
    private String producer; //(изготовитель)
    private int year; //(год выпуска)
    private int length; //(длина)
    private int weight; //(вес)
    private int fuel; //(количество топлива в баке)

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель:" + producer + ", год выпуска:" + year + ", длина:" + length + ", вес:" + weight + ", количество топлива в баке:" + fuel);
    }

    public void fillUp(int n) {
        fuel += n;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.length > airplane2.length) {
            System.out.println("Больше первый самолет самолет " + airplane1.producer);
        } else if (airplane1.length < airplane2.length) {
            System.out.println("Больше второй самолет самолет " + airplane2.producer);
        } else {
            System.out.println("Самолеты равны");
        }
    }
}
