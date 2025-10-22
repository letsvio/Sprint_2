package service;

import model.Discountable;
import model.Food;
import model.constants.Colour;
import model.constants.Discount;


public class ShoppingCart {


    //переменная для массива foods
    private Food [] foods;

    //Конструктор корзины, который принимает массив объектов Food
    public ShoppingCart (Food [] foods){
        this.foods = foods;
    }

    // Метод, который помогает получить общую сумму товаров в корзине без скидки
    public double getTotalPriceWithoutDiscount(){

        double totalPrice = 0;

        double price = 0;

        for(Food food : foods){
            price = food.getAmount() * food.getPrice();
            totalPrice += price;

        }
        return totalPrice;
    }


    // Метод, который помогает получить общую сумму вегетарианских товаров в корзине без скидки
    public double getTotalPriceForVegetarianFood(){

        double totalPrice = 0;

        double price = 0;

        for(Food food : foods){
            if(food.isVegetarian()){
                price = food.getAmount() * food.getPrice();
                totalPrice += price;
            }
        }

        return totalPrice;

    }

    // Метод, который помогает получить общую сумму товаров в корзине со скидкой
    public double getPriceWithDiscount(){

        double totalPriceWithoutDiscount = 0;

        double price = 0;

        double priceWithDiscount = 0;

        double discount = 0;

        for(Food food : foods){
            price = food.getAmount() * food.getPrice();
            totalPriceWithoutDiscount += price;
        }

        for(Food food : foods) {
            if (food instanceof Discountable) {
                discount = ((Discountable) food).getDiscount();
                if (discount != 0){
                    priceWithDiscount =  ((food.getAmount() * food.getPrice())/100) * discount;
                    break;
                }
            }
        }

        return totalPriceWithoutDiscount - priceWithDiscount;
    }

}
