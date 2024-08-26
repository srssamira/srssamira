public enum ContentSlotMachine {
    BANANA("BANANA", 10),
    STRAWBERRY("STRAWBERRY", 20),
    STAR("STAR", 40);

    private String name;
    private int score;

    ContentSlotMachine(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "SystemSlotMachine{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
