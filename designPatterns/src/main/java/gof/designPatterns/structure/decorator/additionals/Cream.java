package gof.designPatterns.structure.decorator.additionals;

import gof.designPatterns.structure.decorator.drinks.Beverage;

public class Cream extends CondimentDecorator{

	public Cream(Beverage drink) {
		this.drink = drink;
	}
	
	@Override
	public Double getPrice() {
		return drink.getPrice() + 1.25;
	}

	@Override
	public String getDescription() {
		return drink.getDescription() + " con crema";
	}

}
