import javax.swing.JOptionPane;

public class nilsgissatalspel {

	public static void main(String[] args) {
		int rndnumb = (int ) (Math.random() * 100 + 1);
		String jonasz = JOptionPane.showInputDialog("Gissa heltalet mellan 1-100!");
		int talgiss = Integer.parseInt(jonasz);
		if(talgiss == rndnumb) {
			JOptionPane.showMessageDialog(null, "Du gissade r�t!!");
		} else if (rndnumb > talgiss){
			JOptionPane.showMessageDialog(null, "Ditt tal �r mindre �n det r�tta svaret");
		} else {
			JOptionPane.showMessageDialog(null, "Ditt tal �r st�rre �n det r�tta svaret");
		}
		

	}

}
