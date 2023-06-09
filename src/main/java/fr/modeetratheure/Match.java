package fr.modeetratheure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * A class to represent a match between two or more players.
 */
public class Match {

    protected List<Player> players;
    protected int numberOfWinner;
    protected boolean isFinished;

    public Match(List<Player> players){
        this.players = new ArrayList<>(players);
        numberOfWinner = 1;
    }

    public Match(int numberOfWinner, List<Player> players){
        this(players);
        this.numberOfWinner = numberOfWinner;
    }

    /**
     * @return an optional of a list of players with a number of winners determined by the value passed to the method
     * {@link #setNumberOfWinner(int)} or to the constructor {@link #Match(int, List)}. The optional is empty if the
     * match is not finished, according to {@link #isFinished()}.
     */
    public Optional<List<Player>> getWinners(){
        players.sort(Comparator.reverseOrder());
        return isFinished ? Optional.of(players.subList(0, numberOfWinner - 1)) : Optional.empty();
    }

    public int getNumberOfWinner() {
        return numberOfWinner;
    }

    public void setNumberOfWinner(int numberOfWinner) {
        this.numberOfWinner = numberOfWinner;
    }

    public void setFinished(boolean isFinished){
        this.isFinished = isFinished;
    }

    public boolean isFinished(){
        return isFinished;
    }

    public List<Player> getPlayers(){
        return players;
    }

}
