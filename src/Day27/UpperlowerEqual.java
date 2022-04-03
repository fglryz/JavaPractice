package Day27;

public class UpperlowerEqual {
    public static void main(String[] args) {
        String str = "JAVA java";
        int countUppercase = 0;
        int countLowercase = 0;
        for (char each : str.toCharArray()) {

            if (Character.isUpperCase(each)) {
                countUppercase++;
            }
            if (Character.isLowerCase(each)) {
                countLowercase++;
            }

        }
        boolean isEqual = countLowercase == countUppercase;
        System.out.println("isEqual = " + isEqual);
    }


}
/*
 Write program that returns true
 if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
 */