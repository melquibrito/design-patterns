
public class MainScreenSpaceAdapter extends MainScreen {

	private MainScreenSpace mainScreenSpace;
	
	public MainScreenSpaceAdapter(MainScreenSpace mainScreenSpace) {
		this.mainScreenSpace = mainScreenSpace;
	}
	
	@Override
	public void showDolarValue() {
		String[] coinsValues = mainScreenSpace.getCoinsValuesString().split(",");
		System.out.println(coinsValues[0].trim());
	}

	@Override
	public void showEuroValue() {
		String[] coinsValues = mainScreenSpace.getCoinsValuesString().split(",");
		System.out.println(coinsValues[1].trim());
	}

	@Override
	public void showPoundSterlingValue() {
		String[] coinsValues = mainScreenSpace.getCoinsValuesString().split(",");
		System.out.println(coinsValues[2].trim());
	}

}
