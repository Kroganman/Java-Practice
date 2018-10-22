package practice4;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Match extends JFrame {
		
	private int ac_milan = 0;
	private int real_madrid = 0;
	private String last_scorer = "N/A";
	private String winner = "N/A";
	JButton button1 = new JButton("AC Milan");
	JButton button2 = new JButton("Real Madrid");
	JLabel label1 = new JLabel(ac_milan + " X " + real_madrid);
	JLabel label2 = new JLabel("Last scorer: " + last_scorer);
	JLabel label3 = new JLabel("Winner: " + winner);
	
	public Match()
	{
		setSize(800,500);
		setLayout(null);
		button1.setBounds(100, 20, 300, 50);
		add(button1);
		button2.setBounds(400, 20, 300, 50);
		add(button2);
		label1.setBounds(350, 190, 300, 50);
		add(label1);
		label2.setBounds(350, 280, 300, 50);
		add(label2);
		label3.setBounds(350, 370, 300, 50);
		add(label3);
		
		button1.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				ac_milan++;
				last_scorer = "AC Milan";
				clicked();
			}

			public void mouseEntered(MouseEvent e) {}

			public void mouseExited(MouseEvent e) {}

			public void mousePressed(MouseEvent e) {}

			public void mouseReleased(MouseEvent e) {}
			
		});
		
		button2.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				real_madrid++;
				last_scorer = "Real Madrid";
				clicked();
			}

			public void mouseEntered(MouseEvent e) {}

			public void mouseExited(MouseEvent e) {}

			public void mousePressed(MouseEvent e) {}

			public void mouseReleased(MouseEvent e) {}
			
		});
		
	}
	
	public void clicked() {
		if(ac_milan > real_madrid)
			winner = "AC Milan";
		else
			if(ac_milan == real_madrid)
				winner = "Draw";
			else
				winner = "Real Madrid";
		label1.setText(ac_milan + " X " + real_madrid);	
		label2.setText("Last scorer: " + last_scorer);
		label3.setText("Winner: " + winner);
	}
	
	public static void main(String[]args)
	{
		new Match().setVisible(true);
	}
}
