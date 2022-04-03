package Day14;

public class Email2_1 {
    public static void main(String[] args) {



        String email="Cydeo.School@gmail.com";


        String emailfirst=email.substring(0,email.indexOf(".")+1);
        System.out.println(emailfirst);
        String emaillast=email.substring(email.indexOf(".")+1,email.lastIndexOf("@"));
        System.out.println(emaillast);

        String email1=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println(email1);




    }
}
 /*
        Write a program that can gte the domain of the email. ( Assume that a
valid email is given)
Ex:
email = Cydeo.School@gmail.com
output:
gmail
email = "School.Cydeo@yahoo.com
output:
yahoo
         */