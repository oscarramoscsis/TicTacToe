package tictactoe;

public class Player {
    //fields
    private String name;
    private int id;
    private int score = 0;

    //constructor
    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }
    //methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void playerWin(){
        score ++;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }
}
