package access;

public class Client {

    static final int MINIMUN_AGE = 18;

    String firstName;
    int age;

    boolean restrictedAccess(int age){
        if(age < MINIMUN_AGE){
            System.out.printf("Restricted Access!");
            return false;
        }
        else {
            System.out.printf("allowed Access ");
            return true;
        }
    }


}
