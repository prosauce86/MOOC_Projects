public class Item {
    private String id, name;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) return true;

        if (compared instanceof Item) {
            Item itemCompared = (Item) compared;
            return id.equals(itemCompared.id);
        }

        return false;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
}