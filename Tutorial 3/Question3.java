package Tutorial3;

public class Question3 {
    public static void main(String[] args){
        var votingMachine = new VotingMachine();
        votingMachine.voteConservative();
        votingMachine.voteLabour();
        System.out.println("\nLabour Party Votes: " + votingMachine.getLabourVotes());
        System.out.println("Conservative Party Votes: " + votingMachine.getConservativeVotes());
    }
}
