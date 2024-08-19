package access;

public class Main2 {

    public static void main(String[] args) {
        Client newClient = new Client();

        newClient.firstName = "Willian";
        newClient.age = 19;

        newClient.restrictedAccess(newClient.age);
    }

}
