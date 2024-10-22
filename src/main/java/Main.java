public class Main {
    public static void main (String [] args) {
        System.out.println("\n----------------------1 Задание --------------------\n");


        Dog dog1 = new Dog("Бобик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");

        dog1.run(150);
        dog1.swim(5);

        cat1.run(150);
        cat1.swim(5);

        Bowl bowl = new Bowl(2);

        cat1.eat(bowl);
        cat2.eat(bowl);


        bowl.addFood(3);

        cat2.eat(bowl);
        cat1.eat(bowl);

        System.out.println("Количество еды в миске: " + bowl.getFoodAmount());

        System.out.println("Количество созданных животных: " + Animal.getAnimalCount());
        System.out.println("Количество созданных собак: " + Dog.getDogCount());
        System.out.println("Количество созданных котов: " + Cat.getCatCount());



        System.out.println("\n----------------------2 Задание --------------------\n");


        Shape circle = new Circle(5, "Синий", "Черный");
        Shape rectangle = new Rectangle(4, 6, "Красный", "Голубой");
        Shape triangle = new Triangle(3, 4, 5, "Фиолетовый", "Зеленый");

        System.out.println(circle.getSpecifications()+'\n');
        System.out.println(rectangle.getSpecifications()+'\n');
        System.out.println(triangle.getSpecifications()+'\n');



    }


}
