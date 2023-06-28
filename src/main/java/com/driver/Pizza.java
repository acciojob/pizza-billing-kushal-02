package com.driver;

public class Pizza {

    private int price;
     private Boolean isVeg;
    private String bill;

    final private static int vegBasePrice = 300;
    final private static int nonVegBasePrice = 400;
    final private static int cheesePrice = 80;
    final private static int vegToppingPrice = 70;
    final private static int nonVegToppingPrice = 120;
    final private static int paperBagPrice = 20;

    private static boolean isCheeseAdded;
    private static boolean isToppingAdded;
    private static boolean isPaperBagAdded;
    public int myToppingPrice =0;
    final private int basePrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.basePrice = isVeg ? vegBasePrice : nonVegBasePrice;
        this.price = this.basePrice;
        this.bill = "";
        isCheeseAdded = false;
        isToppingAdded = false;
        isPaperBagAdded = false;
        // your code goes here
    }

    public int getPrice(){
        if(isCheeseAdded){
            this.price += cheesePrice;
        }
        if(isToppingAdded){
            this.price += this.myToppingPrice;
        }
        if(isPaperBagAdded){
            this.price += paperBagPrice;
        }
        return this.price;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded){
            isCheeseAdded = true;
        }
        // your code goes here
    }

    public void addExtraToppings(){
        if(!isToppingAdded){
            this.myToppingPrice = isVeg ? vegToppingPrice : nonVegToppingPrice;
            isToppingAdded = true;
        }
        // your code goes here
    }

        public void addTakeaway(){
        if(!isPaperBagAdded){
            isPaperBagAdded = true;
        }
        // your code goes here
    }

    public String getBill(){
        // your code goes here
        getPrice();
         bill = "Base Price Of The Pizza: " + this.basePrice + "\n";
        if(isCheeseAdded){
            bill += "Extra Cheese Added: " + cheesePrice + "\n";
        }
        if(isToppingAdded){
            bill += "Extra Toppings Added: " + myToppingPrice + "\n";
        }
        if(isPaperBagAdded){
            bill += "Paperbag Added: " + paperBagPrice + "\n";
        }
        bill += "Total Price: " + this.price + "\n";
        return this.bill;
    }
}
