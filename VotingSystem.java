
import java.util.ArrayList;

public class VotingSystem {

    private ArrayList<Voting> votinglist;

    public VotingSystem() {

        votinglist = new ArrayList<>();
    }

    public void createVoting(String question, boolean isAnonymous, int type, ArrayList<String> choices) {

        votinglist.add(new Voting(type, question, isAnonymous, choices));

    }

    private Voting getVoting(int index) {

        return votinglist.get(index);

    }

    public ArrayList<Voting> getVotinglist() {

        return votinglist;

    }

    public void printResults(int index) {
        System.out.println("\n\n");
        System.out.println("Voting " + index + "\nResult:" );
        votinglist.get(index).printResults();

    }

    public void printVoters(int index) {
        System.out.println("\n\n");
        System.out.println("Voting " + index+"\nVoters:" );
        votinglist.get(index).printVoters();

    }

    public void printVoting(int index) {

        System.out.println("\n\n");

        System.out.println("Voting " + index+"\nVoting info:");

        votinglist.get(index).printVotingInfo();

    }

    public void privateVote(int index, Person voter) {

        getVoting(index).Vote(voter);

    }

    public void publicVoteType1(int index, Person voter, String choice) {

        getVoting(index).vote(voter, choice);

    }

    public void publicVoteType2(int index, Person voter, ArrayList<String> choices) {

        getVoting(index).vote(voter, choices);

    }


}
