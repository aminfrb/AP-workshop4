
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        VotingSystem votingSystem = new VotingSystem();

        ArrayList<String> choicesList1 = new ArrayList<>();

        choicesList1.add("Perspolis");
        choicesList1.add("Esteghlal");
        choicesList1.add("Sepahan");

        String question1 = "What is your favorite team?";

        votingSystem.createVoting(question1, false, 0, choicesList1);

        Person p1 = new Person("Amin", "Sadr");

        votingSystem.privateVote(0, p1);

        votingSystem.printVoting(0);

        Person p2 = new Person("ali", "Shahi");

        votingSystem.privateVote(0, p2);

        votingSystem.printResults(0);

        ArrayList<String> choiceslist2 = new ArrayList<>();

        choiceslist2.add("Blue");
        choiceslist2.add("Red");
        choiceslist2.add("White");
        choiceslist2.add("Black");

        String question2 = "What is your favorite color?";

        votingSystem.createVoting(question2, true, 1, choiceslist2);

        Person p3 = new Person("Hasan", "Fahimi");

        ArrayList<String> targetchoices = new ArrayList<>();

        targetchoices.add("Blue");
        targetchoices.add("Black");

        votingSystem.publicVoteType2(1, p3, targetchoices);

        Person p4 = new Person("Mohsen", "Madadi");

        votingSystem.publicVoteType1(1, p4, "Blue");
        votingSystem.printVoting(1);
        votingSystem.printResults(1);
        votingSystem.printVoters(1);

    }
}