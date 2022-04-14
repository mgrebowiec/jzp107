package sda.mg.zad24;

public class BasketMain {
    public static void main(String[] args) {
        Basket basket = new Basket(3);
        try {
            basket.addToBasket();
            basket.removeFromBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
        } catch (BasketFullException | BasketEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}
