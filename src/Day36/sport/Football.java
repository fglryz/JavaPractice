package Day36.sport;

public class Football extends Sport{
    public String rules;

    public Football(String name, int numberOfPlayers, int numberOfReferee, String rules) {
        super(name, numberOfPlayers, numberOfReferee);
        this.rules = rules;
    }
    public void dailyTrainig(){
        System.out.println(name+" participate training every morning.");
    }

    }

