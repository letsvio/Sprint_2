import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        //Создаю объект meat
        Meat meat = new Meat(5, 100);


        //Создаю объект redApple
        Apple redApple = new Apple(10, 50 , Colour.COLOUR_RED);


        //Создаю объект greenApple
        Apple greenApple = new Apple(10, 50 , Colour.COLOUR_GREEN);


        //Создаю массив объектов food
        Food [] foods = {meat,redApple,greenApple};

        //Создаю объект корзины
        ShoppingCart shoppingCart = new ShoppingCart(foods);

        //Записываю в переменную общую стоимость товаров без скидки
        double totalPriceWithoutDiscount = shoppingCart.getTotalPriceWithoutDiscount();

        //Печатаю общую стоимость товаров без скидки
        System.out.println(totalPriceWithoutDiscount);

        //Записываю в переменную общую стоимость вегетарианских товаров без скидки
        double totalPriceForVegetarianFood = shoppingCart.getTotalPriceForVegetarianFood();

        //Печатаю общую стоимость вегетарианских товаров без скидки
        System.out.println(totalPriceForVegetarianFood);

        //Записываю в переменную общую стоимость товаров со скидкой
        double totalPriceWithDiscount = shoppingCart.getPriceWithDiscount();

        //Печатаю общую стоимость товаров без скидки
        System.out.println(totalPriceWithDiscount);

    }
}
