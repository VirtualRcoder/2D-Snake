import java.awt.Color;
import javax.swing.JFrame;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		Gameplay gameplay = new Gameplay();
		
		f.setTitle("Snake Game");
		
		f.setBounds(10,10,905,700);
		f.setBackground(Color.DARK_GRAY);
		f.setResizable(false);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.add(gameplay);

	}

}
