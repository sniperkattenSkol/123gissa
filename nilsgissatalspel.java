import javax.swing.JOptionPane;

public class nilsgissatalspel {

	public static void main(String[] args) {
		int rndnumb = (int ) (Math.random() * 100 + 1);
		String jonasz = JOptionPane.showInputDialog("Gissa heltalet mellan 1-100!");
		int talgiss = Integer.parseInt(jonasz);
		if(talgiss == rndnumb) {
			JOptionPane.showMessageDialog(null, "Du gissade rät!!");
		} else if (rndnumb > talgiss){
			JOptionPane.showMessageDialog(null, "Ditt tal är mindre än det rätta svaret");
		} else {
			JOptionPane.showMessageDialog(null, "Ditt tal är större än det rätta svaret");
		}
		

	}

}
