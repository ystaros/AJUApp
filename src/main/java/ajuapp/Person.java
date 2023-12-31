package ajuapp;

public class Person {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private static int userNameID = 103;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = String.valueOf(userNameID);
        generateUsername(firstName, lastName);
        userNameID ++;
    }

    private void generateUsername(String firstName, String lastName) {
        this.userName = firstName.trim().charAt(0) + lastName.trim() + userNameID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

}
