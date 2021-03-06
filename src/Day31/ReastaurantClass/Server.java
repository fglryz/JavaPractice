package Day31.ReastaurantClass;

public class Server {
    public String name;
    public int employeeId;
    public double hourlyRate;
    public boolean isFullTime;


    public Server(String name, int employeeId, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", hourlyRate=" + hourlyRate +
                ", isfullTime=" + (isFullTime?"full-time":"part-time")+
                '}';
    }
    public void takeOrder(){
        System.out.println(name+" is taking order");
    }
    public void cleanTable(){
        System.out.println(name+" is cleaning table");
    }

}
/*
6. Restaurant Task:
6.1  Create a class called Server
        Attributes:
                name (String), employeeID (int),
hourlyRate (double), fullTime (boolean)
Add A constructor that can set all the fields
        Actions: (all void methods)
            takeOrder(): server's name + "is taking an
order"
            cleanTable(): server's name + "is cleaning
the table"
            toString(): Returns (String) all the
information of a Server
                -> Extra: For fullTime status,
instead of printing a boolean value, print "full-time" or "part-time
 */