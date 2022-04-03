package Day33;

public class PersonTest {
    public static void main(String[] args) {
        Person person1=new Person("Metin",32,'M');
        Person person2=new Person("Kerim",23,'M');

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person1.numberOfHead);
        System.out.println(person2.numberOfHead);


        System.out.println(person1.numberOfEyes);
        System.out.println(person2.numberOfEyes);


    }
}
