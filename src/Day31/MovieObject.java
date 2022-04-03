package Day31;

public class MovieObject {
    public static void main(String[] args) {

       String[] casts={"Asiay","Adam","Muhtar","Akbar"};
        MovieTask movie1=new MovieTask("USA","Journey","Adventure","2021","Alan");
         movie1.addCAst(casts);
        System.out.println(movie1);
}}
