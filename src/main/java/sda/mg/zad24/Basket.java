package sda.mg.zad24;

public class Basket {
    private final int maxBasketSize;
    private int actualSize;

    public Basket(int maxBasketSize) {
        this.maxBasketSize = maxBasketSize;
    }

    public void addToBasket() throws BasketFullException {
        if (actualSize >= maxBasketSize) {
            throw new BasketFullException("W koszyku jest juz " + actualSize + " produktow. Nie mozna dodac kolejnego!");
        }
        actualSize++;
    }

    public void removeFromBasket() throws BasketEmptyException {
        if (actualSize <= 0) {
            throw new BasketEmptyException("Koszyk jest pusty. Nie mozemy usuanac elementu!");
        }

        actualSize--;
    }
}
