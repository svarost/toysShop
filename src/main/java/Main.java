import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
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
            }
        }
    }

    private static void addToy() {

    }
}
