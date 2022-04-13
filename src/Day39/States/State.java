package Day39.States;

public class State {

    private String name,abbreviation,politicalParty,governor,senator;
    private int population;
    private double stateTax;

    public State(String name, String abbreviation, String politicalParty, String governor,
                 String senator, int population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null||name.isEmpty()){
            System.out.println("Invalid name"+name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation==null||abbreviation.isEmpty()){
            System.out.println("Invalid abbr "+abbreviation);
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty==null||politicalParty.isEmpty()){
            System.out.println("Invalid Political P "+politicalParty);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if(governor==null||governor.isEmpty()){
            System.out.println("Invalid governor "+governor);
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if(senator==null||senator.isEmpty()){
            System.out.println("Invalid senator "+senator);
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if(population<=0){
            System.out.println("Invalid number :"+population);
            System.exit(1);

        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if(stateTax<=0){
            System.out.println("Invalid TAx: "+stateTax);
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
/*


1. Create a class named States:
        variables:
        name, abbreviation, politicalParty,
        Governor, senator, population, stateTax
        Encapsulate all the fields
        Add a constructor that can set all the fields
        Conditions:
        1. name,
        abbreviation, politicalParty, Governor, and senator can not be null
        2. name,
        abbreviation, politicalParty, Governor, and senator can not be empty
        3. taxRate
        can not be negative
        4.
        Population can not be set to zero or negative
        Methods:
        toString()*/