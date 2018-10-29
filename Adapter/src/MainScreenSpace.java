
public class MainScreenSpace {
	
	protected double euroValue = 4.13;
	protected double dolarValue = 3.63;
	protected double poundSterlingValue = 4.65;
	
	public void showCoinsValues() {
		System.out.println(getCoinsValuesString());
	}
	
	public String getCoinsValuesString() {
		return "Dolar: " + dolarValue + ", Euro: " + euroValue + " , Pound Sterling: " + poundSterlingValue;
	}

}