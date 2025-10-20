package service;

import model.Food;
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
                if(!food.isVegetarian()  || food.getColour().equals("green")) {
                    price = food.getAmount() * food.getPrice();
                    totalPrice += price;
                }
        }
        return totalPrice;
    }


    // Метод, который помогает получить общую сумму вегетарианских товаров в корзине без скидки
    public double getTotalPriceForVegetarianFood(){

        double totalPrice = 0;

        double price = 0;

        for(Food food : foods){
            if(food.isVegetarian() && food.getColour().equals("green")){
                price = food.getAmount() * food.getPrice();
                totalPrice += price;
            }
        }

        return totalPrice;

    }

    // Метод, который помогает получить общую сумму товаров в корзине со скидкой
    public double getPriceWithDiscount(){

        double totalPrice = 0;

        double price = 0;

        for(Food food : foods){
            if(food.getColour().equals("red")){
                price = food.getAmount() * food.getPrice() ;
                totalPrice += price;
            }
        }

        return (totalPrice/100) * Discount.RED_APPLE_DISCOUNT;
    }


}
