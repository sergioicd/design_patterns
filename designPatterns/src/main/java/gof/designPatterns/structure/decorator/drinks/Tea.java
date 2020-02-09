package gof.designPatterns.structure.decorator.drinks;

public class Tea extends Drink{

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return 0.75;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Té";
	}

}
