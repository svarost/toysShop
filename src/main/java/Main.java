import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static ToyStore toyStore = new ToyStore();

    public static void main(String[] args) {

        toyStore.putToy(new Toy(1, "конструктор", 2));
        toyStore.putToy(new Toy(1, "робот", 2));
        toyStore.putToy(new Toy(1, "кукла", 6));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить новую игрушку.");
            System.out.println("2. Разыграть игрушку.");
            System.out.println("3. Выход.");
            if (!scanner.hasNextInt()) {
                System.out.println("Введено некорректное значение, пожалуйста, попробуйте еще раз.");
            }
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: addToy();
                case 2: raffle();
                case 3: break;
            }
        }
    }

    private static void raffle() {
        Toy toy = toyStore.getToy();
        System.out.printf("Разыграна игрушка \"%s\".\n", toy.getName());
    }

    public static void addToy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID игрушки:");
        while (!scanner.hasNextInt()) {
            System.out.println("Введено некорректное значение ID. Попробуйте еще раз.");
        }
        int id = scanner.nextInt();
        System.out.println("Введите название игрушки: ");
        String name = scanner.next();
        System.out.println("Введите вес игрушки: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Введено некорректное значение. Попробуйте еще раз.");
        }
        int weight = scanner.nextInt();

        toyStore.putToy(new Toy(id, name, weight));
    }
}
