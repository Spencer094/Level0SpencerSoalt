
public class badgers {
	public static void main(String[] args) {
		for (int s = 0; s < 2; s++) {

			for (int i = 0; i < 12; i++) {
				speak("Badgers");
			}
			for (int i = 0; i < 2; i++) {
				speak("Mushroom");
			}
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
