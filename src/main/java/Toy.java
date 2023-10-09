public class Toy implements Comparable<Toy> {
    private int id;
    private String name;
    private int weight;

    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "ID:" + id + ", Название: " + name + ", Вес: " + weight;
    }

    @Override
    public int compareTo(Toy o) {
        if (this.weight > o.getWeight())
            return -1;
        else if (this.weight < o.getWeight())
            return 1;
        else
            return 0;
    }
}

