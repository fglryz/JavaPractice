package Day15;

public class reverseString {
    public static void main(String[] args) {
        String str = "Java";
        String strRev = "";

        for (int i = str.length()-1; i >= 0; i--) {
            strRev += "" + str.charAt(i);
        }
        System.out.println("strRev = " + strRev);
    }
}
