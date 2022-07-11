package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BOOK> books = new ArrayList<>();

        Car myCar = new Car();
        Truck myTruck = new Truck();
        myTruck.drive();
        myCar.drive();

        ChildBook childBook = new ChildBook(33);
        childBook.loan();
        childBook.setTitle("AbcBook");
        ReferenceBook refBook = new ReferenceBook();
        refBook.setTitle("History");

        books.add(childBook);
        books.add(refBook);
        for(BOOK b : books){
            if(b instanceof Loanable )
                System.out.println("Loanable: " +  b.getTitle());
            if(!(b instanceof Loanable))
                System.out.println("Not Loanable: " + b.getTitle());
            if(b.category == Category.CHILD)
                System.out.println("The category is: " +  b.category);
        }

        System.out.println("Dice random: " + Dice.D100.roll(Dice.D100.getValue()));

    }
}
