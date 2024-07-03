# Open/Closed Principle (OCP)

The Open/Closed Principle (OCP) states that "Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification." This means you should be able to extend a class's behavior without modifying its existing code.

## Importance of OCP

The OCP is a core principle in modern software development and is one of the SOLID principles. Adhering to OCP offers several advantages:

1. **Promotes Maintainability**: By keeping existing code unchanged, you reduce the risk of introducing new bugs. This makes the system easier to maintain.

2. **Encourages Reusability**: OCP allows developers to add new functionality by extending existing components. This promotes code reuse and reduces duplication.

3. **Enhances Flexibility**: Extending behavior without modifying existing code allows for more flexible and adaptable systems. This is particularly useful when requirements change frequently.

4. **Supports Scalability**: As new features are added, the system remains scalable because new functionality is added through extensions rather than modifications.

## Example

Consider a class that calculates the area of different shapes. Initially, it handles only rectangles:

### Non-OCP Compliant Code

```java
public class AreaCalculator {
    public double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }
}
```

If we need to add support for calculating the area of a circle, we might modify the AreaCalculator class:

```java
public class AreaCalculator {
    public double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }

    public double calculateCircleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }
}
```

This approach violates the OCP because we are modifying the AreaCalculator class to add new functionality. Instead, we should extend the behavior without modifying the existing code.