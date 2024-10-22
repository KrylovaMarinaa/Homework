public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void eat(int amountForSatiety) {
        if (foodAmount > 0) {
            foodAmount= foodAmount - amountForSatiety;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Добавлено еды в миску: " + amount);
        } else {
            System.out.println("Количество еды не может быть отрицательным или нулевым.");
        }
    }
}