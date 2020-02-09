package gof.designPatterns.structure.decorator.additionals;

import gof.designPatterns.structure.decorator.drinks.Beverage;

public class Cream extends AdditionalDecorator{

	public Cream(Beverage drink) {
		this.drink = drink;
	}
	
	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return drink.getPrice() + 1.25;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return drink.getDescription() + " con crema";
	}

}
