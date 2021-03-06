import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What mood are you in?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Happy7", "The Hype", "Sad" }, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.
System.out.println(userMood);
		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
if (userMood == 2) {playVideo("https://www.youtube.com/watch?v=FTIwtC6Jw3M");
	
}
		// 4. Play different songs for other moods.
else if (userMood == 1) {playVideo("https://www.youtube.com/watch?v=2HQaBWziYvY");
	
}
		// If you are seeing ads at the beginning of your videos, install Adblock.
else if (userMood == 3) {playVideo("https://www.youtube.com/watch?v=qF4RCOcz9ow");
	}
	}
	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}




/**
* If you can’t think of any, here are some you can use...
*	bit.ly/video-for-happy
*	bit.ly/video-for-sad
*	bit.ly/video-for-angry
**/
