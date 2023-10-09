import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ToyStore {
    public PriorityQueue<Toy> toyQueue = new PriorityQueue<>();
    public List<Toy> prizes = new ArrayList<>();

    public void putToy(Toy toy) {
        toyQueue.add(toy);
    }

    public Toy getToy() {
        Toy toy = toyQueue.poll();
        prizes.add(toy);
        saveToFile(toy);
        return toy;
    }

    public void saveToFile(Toy toy) {
        try (FileWriter writer = new FileWriter("src/main/java/storage/", true)) {
            writer.write(toy.toString() + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
