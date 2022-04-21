package tictactoe;

public class Player {
    //fields
    private String name;
    private int id;

    //constructor


    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    //methods

    @Override
    public String toString() {
        return "Player{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }
}
