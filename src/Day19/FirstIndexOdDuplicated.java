package Day19;

public class FirstIndexOdDuplicated {
    public static void main(String[] args) {

        String str="aabbccdef";
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                char each=str.charAt(j);

                if(ch==each){
                    count++;
                }
            }
            if(count>1) {

                System.out.println(i-1);
                System.exit(0);
            }
        }

    }

    }

    /*
    for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    result = "First duplicated character's index numbers and the character: " + i + ", " + j + ", " + str.charAt(j);
                    i = str.length();
                    break;
                }
            }
        }
        System.out.println(result);;
            }
        }
     */
/*
2. Write a program that cna return the index number of the first duplicated character from a string
 */