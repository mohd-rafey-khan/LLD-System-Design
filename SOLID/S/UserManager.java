// Single Responsibility Principle (SRP)
public class UserManager{

    // public void authenticateUser(String username, String password) {
    //     // Authentication logic
    // }

    // public void createUser(UserData userData) {
    //     // User creation logic
    // }

    // public void updateUser(int userId, UserData userData) {
    //     // User update logic
    // }

    public static void main(String[] args){

        // Authenticate the user
        AuthenticationService authUser = new AuthenticationService();
        authUser.authenticateUser("name","pass");

        // User Management
        UserService user = new UserService();
        user.createUser();
        user.updateUser();

    }
}