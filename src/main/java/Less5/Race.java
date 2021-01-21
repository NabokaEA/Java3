package Less5;

import java.util.ArrayList;
import java.util.Arrays;

public class Race {
    public Car getWinner() {
        return winner;
    }

    public void setWinner(Car winner) {
        this.winner = winner;
    }

    private Car winner=null;
    private ArrayList<Stage> stages;
    public ArrayList<Stage> getStages() { return stages; }
    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }
}

