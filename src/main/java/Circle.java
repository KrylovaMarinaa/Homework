class Circle implements Shape {
    private final double radius;
    private final String fillColor;
    private final String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public String getSpecifications() {
        return  "Круг:\n" +
                "Периметр: " + perimeter() + "\n" +
                "Площадь: " + area() + "\n" +
                "Цвет фона: " + getFillColor() + "\n" +
                "Цвет границ: " + getBorderColor();
    }


}