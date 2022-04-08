package Day36.sport;

public class Sport {
    public String name;
    public int numberOfPlayers;
    public int numberOfReferee;

    public Sport(String name, int numberOfPlayers, int numberOfReferee) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferee = numberOfReferee;
    }
    public void play(){
        System.out.println(name+" is interested in sport");
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                '}';
    }
}
