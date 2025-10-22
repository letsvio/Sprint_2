package model;

public abstract class Food  {

    // количество продукта в килограммах (целое число)
    protected int amount;

    //цена за единицу продукта (вещественное число)
    protected double price;

    //флаг, который показывает, вегетарианский ли продукт
    protected boolean isVegetarian;


    //конструктор food
    public Food (int amount, double price, boolean isVegetarian){
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }


    // Геттеры
    public int getAmount(){
        return amount;
    }

    public double getPrice(){
        return price;
    }

    public boolean isVegetarian(){
        return isVegetarian;
    }


    //не понимаю как без этого геттера узнать цвет яблока
//    public abstract String getColour();

}
