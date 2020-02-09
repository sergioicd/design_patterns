package gof.designPatterns.structure.decorator.additionals;

import gof.designPatterns.structure.decorator.drinks.Beverage;

public class Milk extends CondimentDecorator {

	public Milk(Beverage drink) {
		this.drink = drink;
	}
	
	@Override
	public Double getPrice() {
		return drink.getPrice() + 0.25;
	}

	@Override
	public String getDescription() {
		return drink.getDescription() + " con leche";
	}

}
