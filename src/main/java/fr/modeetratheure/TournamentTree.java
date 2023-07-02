package fr.modeetratheure;

import java.util.ArrayList;
import java.util.List;

public abstract class TournamentTree {

    protected List<Player> players;
    protected List<Match[]> tree;

    /**
     * Creates a tree according to depth.
     * @param depth represents the first phase of the tree. A depth of two means the first phase is semi-final, a depth
     *             of three means the first phase is quarter-final, etc... (the depth needs to be higher than 1)
     */
    public TournamentTree(int depth){
        tree = new ArrayList<>();
        if(depth < 2){
            throw new IllegalArgumentException("Depth of the tree needs to be higher than 1.");
        }
        for(int i = depth - 1; i >= 0; i--){
            tree.add(new Match[2^i]);
        }
    }

    /**
     * Dispatch players in the matches of the first phase.
     */
    public abstract void dispatchPlayers();

}
