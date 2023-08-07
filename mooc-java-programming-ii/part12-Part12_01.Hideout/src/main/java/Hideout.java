import java.util.ArrayList;

public class Hideout<T> {

    private ArrayList<T> toHide;

    public Hideout() {
        this.toHide = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        if (this.toHide.size() > 0) {
            this.toHide.clear();
        }

        this.toHide.add(toHide);
    }

    public T takeFromHideout() {
        if (toHide.size() == 0) return null;
        T taken = toHide.get(0);
        toHide.clear();
        return taken;
    }

    public boolean isInHideout() {

        return toHide.size() == 1;
    }
}