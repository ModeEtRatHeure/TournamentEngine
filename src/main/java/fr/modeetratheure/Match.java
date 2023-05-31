package fr.modeetratheure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Match {

    protected List<Player> players;
    protected int numberOfWinner;

    public Match(List<Player> players){
        this.players = new ArrayList<>(players);
        numberOfWinner = 1;
    }

    public Match(int numberOfWinner, List<Player> players){
        this(players);
        this.numberOfWinner = numberOfWinner;
    }

    public List<Player> getWinners(){
        players.sort(Comparator.reverseOrder());
        return players.subList(0, numberOfWinner - 1);
    }

    public int getNumberOfWinner() {
        return numberOfWinner;
    }

    public void setNumberOfWinner(int numberOfWinner) {
        this.numberOfWinner = numberOfWinner;
    }

    public List<Player> getPlayers(){
        return players;
    }

}
