# Single Responsibility Principle (SRP)

The Single Responsibility Principle (SRP) states that "A class should have only one reason to change." This means every class should have a single responsibility or job within a software system. In simpler terms, a class should focus on only one task or purpose.

## Importance of SRP

The SRP is a fundamental principle in modern software development, especially within the SOLID principles framework. Adhering to SRP offers several advantages:

1. **Simplifies Maintenance**: By ensuring each class has a single responsibility, changes to the class are localized and specific. This makes the system easier to maintain and understand.

2. **Enhances Reusability**: Classes with a single responsibility can be reused in different parts of the system or in different projects without introducing dependencies or side effects.

3. **Reduces Complexity**: SRP helps developers break down complex problems into smaller, manageable pieces. This leads to simpler, more understandable code.

4. **Improves Testability**: Classes with a single responsibility are easier to test because they have a clear, focused behavior. This makes writing unit tests more straightforward and reliable.

5. **Encourages Loose Coupling**: By focusing on a single responsibility, classes are less likely to be tightly coupled with other classes. This promotes a more flexible and maintainable codebase.

## Example

Consider a class that handles both user authentication and user data management:

```java
public class UserManager {
    public void authenticateUser(String username, String password) {
        // Authentication logic
    }

    public void createUser(UserData userData) {
        // User creation logic
    }

    public void updateUser(int userId, UserData userData) {
        // User update logic
    }
}
```

## To adhere to the SRP, we should split this into two separate classes:

Now, each class has a single responsibility: AuthenticationService handles authentication, and UserDataService manages user data.

```java
public class AuthenticationService {
    public void authenticateUser(String username, String password) {
        // Authentication logic
    }
}

public class UserDataService {
    public void createUser(UserData userData) {
        // User creation logic
    }

    public void updateUser(int userId, UserData userData) {
        // User update logic
    }
}
