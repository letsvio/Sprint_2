package model;

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
        if(colour.equals("red")){
            return 60;
        } else return 0;
    }
}
