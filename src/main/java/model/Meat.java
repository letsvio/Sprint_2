package model;

public class Meat extends Food implements Discountable{

    //конструктор класса meat, принимает в аргументы количество продукта и цену за единицу продукта
    public Meat (int amount, double price){
        super(amount,price,false);
    }

    @Override
    public double getDiscount(){
        return 0;
    }

//    public String getColour(){
//        return "";
//    }
}
