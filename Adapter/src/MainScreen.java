public class MainScreen {
	
	protected double euroValue = 4.13;
	protected double dolarValue = 3.63;
	protected double poundSterlingValue = 4.65;

	public void showDolarValue() {
		System.out.println(getDolarValueString());
	}

	public void showEuroValue() {
		System.out.println(getEuroValueString());
	}

	public void showPoundSterlingValue() {
		System.out.println(getPoundSterlingValueString());
	}
	
	public String getDolarValueString() {
		return "Dolar: " + dolarValue;
	}
	
	public String getEuroValueString() {
		return "Euro: " + euroValue;
	}
	
	public String getPoundSterlingValueString() {
		return "Pound Sterling: " + poundSterlingValue;
	}

}
