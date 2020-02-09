package gof.designPatterns.structure.decorator.additionals;

import gof.designPatterns.structure.decorator.drinks.Beverage;

public class Sugar extends AdditionalDecorator{

	public Sugar(Beverage drink) {
		this.drink = drink;
	}
	
	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return drink.getPrice() + 0.34;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return drink.getDescription() + " con azúcar";
	}

}
