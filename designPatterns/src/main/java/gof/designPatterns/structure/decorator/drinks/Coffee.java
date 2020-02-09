package gof.designPatterns.structure.decorator.drinks;

public class Coffee extends Beverage{

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return 2.40;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Café";
	}

}
