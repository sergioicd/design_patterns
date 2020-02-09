package gof.designPatterns.structure.decorator.drinks;

public class Tea extends Beverage{

	@Override
	public Double getPrice() {
		return 0.75;
	}

	@Override
	public String getDescription() {
		return "Té";
	}

}
