public class Main {
    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();
        toyShop.putToy(new Toy(1, "конструктор", 2));
        toyShop.putToy(new Toy(1, "робот", 2));
        toyShop.putToy(new Toy(1, "кукла", 6));

        System.out.println(toyShop.getToy());
    }
}
