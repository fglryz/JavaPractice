package Day11;

public class CappuccinoBuyer {
    public static void main(String[] args) {

       String size="tall";
       String result=" ";
        boolean validSize=size=="tall"||size=="grande"|| size=="venti";

        if(validSize){
           if(size=="tall"){
           result="price is $3.69\n" +
                   "90 calories";
           }
       else if(size=="grande"){
           result="price is $3.69\n" +
               "90 calories";
       }
       else{
           result="price is $4.29\n" +
                   "150 calories";
           }
        }
       else{
           result="Invalid";

       }
    System.out.println(result);
        System.out.println("***************************************");

       switch (size){
           case "tall":
               result="price is $3.69\\n\" +\n" +
                       "\"90 calories";
               break;
           case"grande":
               result="price is $3.69\n"+"90 calories";
               break;
           case"vendi":
               result="price is $4.29\n" +
                       "150 calories";
               break;

               default:
                   result="Invalid";

       }
        System.out.println(result);
        System.out.println("************************");





}
}

/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display
the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:"price is $3.69n"
                               90 calories"

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */
