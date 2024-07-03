class ocp{
    public static void main(String[] args){
        // Create an Rectangle Shape

        Shape rectangle = new Rectangle(40,2);


        // calculate it's Area
        CalculateArea areaCalculator = new CalculateArea();
        areaCalculator.calculateArea(rectangle);

    }
}