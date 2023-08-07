import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable m : herd) {
            m.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (Movable m : herd) {
            string.append(m).append("\n");
        }
        return string.toString();
    }
}