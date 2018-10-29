
public class Main {
	
	public static void main(String[] args) {
		MainScreen mainScreen = new MainScreen();
		
		showCoins(mainScreen);
	}
	
	public static void showCoins(MainScreen mainScreen) {
		mainScreen.showDolarValue();
		mainScreen.showEuroValue();
		mainScreen.showPoundSterlingValue();
	}

}
