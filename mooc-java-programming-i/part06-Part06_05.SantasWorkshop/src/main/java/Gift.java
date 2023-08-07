public class Gift {
    private String name;
    private int weight;

    public Gift(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " (" + weight + " kg)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Gift)) return false;

        Gift o = (Gift) obj;
        return (name.equals(o.name) && weight == o.weight);
    }
}