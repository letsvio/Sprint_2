package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable{


    //Цвет яблок
    private String colour;


    //конструктор класса Apple, принимает в аргументы количество продукта, цену за единицу продукта и цвет
    public Apple (int amount, double price, String colour){
        super(amount,price,true);
        this.colour = colour;
    }


    public String getColour(){
        return colour;
    }

    @Override
    public double getDiscount(){
        if(colour.equals(Colour.COLOUR_RED)){
            return Discount.RED_APPLE_DISCOUNT;
        } else return 0;
    }
}
