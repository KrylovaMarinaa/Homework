class Cat extends Animal {
    private static int catCount = 0;
    private final String name;
    private boolean satiety = false;
    private int amountForSatiety = 5;

    public Cat(String name) {
        super();
        this.name = name;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl) {
        if (!satiety&& bowl.getFoodAmount() >= amountForSatiety) {
            bowl.eat(amountForSatiety);
            satiety = true;
            System.out.println(name + " поел и теперь сыт.");
        } else if (satiety) {
            System.out.println(name + " уже сыт.");
        } else {
            System.out.println(name + " не хватает еды в миске.");
        }
    }

    public void hunger() {
        satiety = false;
    }

    public static int getCatCount() {
        return catCount;
    }

    public void setAmountForSatiety(int amountForSatiety) {
        this.amountForSatiety = amountForSatiety;
    }

    public int getAmountForSatiety() {
        return amountForSatiety;
    }
}
