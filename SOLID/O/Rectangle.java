class Rectangle implements Shape{

    private int length;
    private int height;

    Rectangle(int length, int height){
        this.length = length;
        this.height = height;
    }

    public double calculateArea(){
        System.out.print("Area of Rectangle is: ");
        System.out.println(this.length*this.height);
        return 0.0;
    }

}