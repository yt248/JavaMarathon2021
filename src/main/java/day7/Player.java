package day7;

public class Player {

    public static int MAX_STAMINA = 100; // “максимальная выносливость”
    public static int MIN_STAMINA = 0;   // “минимальная выносливость”

    private int stamina;                  //“выносливость”

    public static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == 0)
            return;

        stamina--;

        if (stamina == 0) {
            System.out.println("Игроку нужен отдых, он уходит");
            countPlayers--;
        }
    }

    static public void info() {
        if (countPlayers <= 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}