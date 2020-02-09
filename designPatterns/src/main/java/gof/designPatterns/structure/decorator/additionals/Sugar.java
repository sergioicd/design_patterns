package gof.designPatterns.structure.decorator.additionals;

import gof.designPatterns.structure.decorator.drinks.Beverage;

public class Sugar extends CondimentDecorator{

	public Sugar(Beverage drink) {
		this.drink = drink;
	}
	
	@Override
	public Double getPrice() {
		return drink.getPrice() + 0.34;
	}

	@Override
	public String getDescription() {
		return drink.getDescription() + " con azúcar";
	}

}
