package Day35;

public class Creditentials {

    private String username,password;

    public Creditentials(String username, String password) {
        setUsername( username);
        setPassword( password);
    }

    public boolean isStrongPassword(String password){
        boolean result = false;
        if(password.length()>=8 && !password.contains(" ")){
            int upperCase = 0, lowerCase = 0, special = 0, digit = 0;
            for (int i = 0; i < password.length(); i++) {
                if( Character.isUpperCase(password.charAt(i)) ){
                    upperCase++;
                }
                if( Character.isLowerCase(password.charAt(i)) ){
                    lowerCase++;
                }
                if( Character.isDigit(password.charAt(i)) ){
                    digit++;
                }
                if( !Character.isLetterOrDigit(password.charAt(i)) ){
                    special++;
                }
            }
            if(upperCase>=1&&lowerCase>=1&&digit>=1&&special>=1){
                result = true;
            }else{
                result = false;
            }
        }else{
            System.out.println("Invalid password");
            System.exit(0);
        }
        return result;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if( !(isStrongPassword(password))) {
            System.out.println("It must be a strong password!");
            System.exit(0);
        }
        this.password = password;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}