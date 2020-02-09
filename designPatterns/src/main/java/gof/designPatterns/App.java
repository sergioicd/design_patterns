package gof.designPatterns;

import javax.swing.SingleSelectionModel;

import gof.designPatterns.structure.decorator.additionals.Cream;
import gof.designPatterns.structure.decorator.additionals.Milk;
import gof.designPatterns.structure.decorator.additionals.Sugar;
import gof.designPatterns.structure.decorator.drinks.Coffee;
import gof.designPatterns.structure.decorator.drinks.Drink;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        
    	Drink drink = new Coffee();
    	drink = new Milk(drink);
    	drink = new Sugar(drink);
    	drink = new Cream(drink);
    	
    	System.out.println(drink.getDescription() + " cuesta " + drink.getPrice());
    	
    }
}
