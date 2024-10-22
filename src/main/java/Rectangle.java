class Rectangle implements Shape {
    private final double width;
    private final double height;
    private final String fillColor;
    private final String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
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
        return  "Прямоугольник:\n" +
                "Периметр: " + perimeter() + "\n" +
                "Площадь: " + area() + "\n" +
                "Цвет фона: " + getFillColor() + "\n" +
                "Цвет границ: " + getBorderColor();
    }
}