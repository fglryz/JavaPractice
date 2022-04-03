package Day11;

public class Http {
    public static void main(String[] args) {
        String statusCode="OK";

        String result="";
        switch (statusCode){
            case "OK":
                result="200";
                break;
            case "Created":
                result="201";
                break;
            case "Accepted" :
                result="202";
                break;
            case "Moved Permanently ":
                result="301";
                break;
            case "See Others":
                result="303";
                break;
            case "Not Modified":
                result="304";
                break;
            case "Temporary Redirect" :
                result="307";
                break;
            case "Bad Request" :
                result="400";
                break;
            case "Unauthorized":
                result="402";
                break;
                case "Forbidden":
                result="403";
                break;
            case "Not Found" :
                result="404";
                break;
            case "Gona" :
                result="410";
                break;
            case"Internal Server Error"  :
                result="500Internal Server Error";
                break;
            default:
                result="Service Unavailable";

        }
        System.out.println("If status code= "+result);

    }
}
/*
TTP is the protocol that governs communications between web-servers
and web clients. Part of the protocol includes a status code returned
by the server to tell the browser the status of its most recent page
request.
Some of the codes and their meanings are listed below:
status codes and their meanings:
                200, OK
                201, Created
                202, Accepted
                301, Moved Permanently
                303, See Other
                304, Not Modified
                307, Temporary Redirect
                400, Bad Request
                401, Unauthorized
                403, Forbidden
                404, Not Found
                410, Gone
                500, Internal Server Error
                503, Service Unavailable
declare an int variable called statusCode, and a valid status
code is already given
write a program that prints out, on a line by itself, the
appropriate label from the above list based on status.
Example:
if status code = 200
output:
ok
 */
