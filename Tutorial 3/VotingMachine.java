package Tutorial3;
import java.util.Random;

public class VotingMachine {
    int labourVotes = 0;
    int conservativeVotes = 0;

    public void voteLabour(){
        Random random = new Random();
        int offset = random.nextInt(20);
        labourVotes = 1 + offset;
    }

    public void voteConservative(){
        conservativeVotes++;
    }

    public int getLabourVotes() {
        return labourVotes;
    }

    public int getConservativeVotes() {
        return conservativeVotes;
    }
}
