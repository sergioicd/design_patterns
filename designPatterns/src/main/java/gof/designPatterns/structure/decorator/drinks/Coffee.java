package gof.designPatterns.structure.decorator.drinks;

public class Coffee extends Beverage{

	@Override
	public Double getPrice() {
		return 2.40;
	}

	@Override
	public String getDescription() {
		return "Café";
	}

}
