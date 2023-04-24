
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class Voting {

    private int type;

    private String question;

    private HashMap<String, HashSet<Vote>> choices;

    private boolean isAnonymous;

    private ArrayList<Person> voters;




    public Voting(int type, String question, boolean isAnonymous,ArrayList<String> choiceslList) {
        this.type = type;
        this.question = question;
        this.isAnonymous = isAnonymous;
        this.choices = new HashMap<>();
        for (String choice : choiceslList) {

            createChoices(choice);

        }

        voters = new ArrayList<>();
    }


    public ArrayList<String> getchoices() {

        ArrayList<String> list = new ArrayList<>();

        for (String choice : choices.keySet()) {

            list.add(choice);

        }

        return list;

    }


    public boolean getIsAnonymous(){

        return isAnonymous;

    }

    public int getType(){

        return type ;

    }

    public void createChoices(String c) {

        choices.put(c, new HashSet<>());

    }

    public void vote(Person voter,String choice){

        voters.add(voter);

        Vote vote = new Vote(voter);

        choices.get(choice).add(vote);



    }

    public void vote(Person voter, ArrayList<String> voter_choices) {

        voters.add(voter);

        Iterator<String> it = voter_choices.iterator();

        while (it.hasNext()) {

            String key = it.next();

            Vote vote = new Vote(voter);

            choices.get(key).add(vote);

        }
    }


    public void Vote(Person voter){

        ArrayList<String> choicesList = getchoices();

        Random randomGenerator = new Random();

        int randomChoice= randomGenerator.nextInt(choicesList.size());

        voters.add(voter);

        Vote vote = new Vote(voter);

        choices.get(choicesList.get(randomChoice)).add(vote);


    }

    public void printResults(){

        for (String key : choices.keySet()) {

            System.out.println(key+": "+choices.get(key).size());

        }

    }

    public void printVoters(){

        for (String key : choices.keySet()) {

            System.out.print(key+":");

            for (Vote vote : choices.get(key)) {

                System.out.print("["+vote.getVoter().getFirstName()+" "+ vote.getVoter().getLastName()+"  "+vote.getDate()+"]  ");

            }

            System.out.println();

        }

    }

    public void printVotingInfo(){

        System.out.println(question);

        for (String choice : choices.keySet()) {

            System.out.println(choice);

        }

    }

}

