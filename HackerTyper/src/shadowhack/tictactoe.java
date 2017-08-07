package shadowhack;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class tictactoe {
	public void Tic() {
		JFrame.setDefaultLookAndFeelDecorated(true);
	    JFrame frame = new JFrame("GridLayout Test");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLayout(new GridLayout(3, 3));
	    JButton a1 = new JButton("");
	    JButton a2 = new JButton("");

	    JButton a3 = new JButton("");

	    JButton a4 = new JButton("");

	    JButton a5 = new JButton("");

	    JButton a6 = new JButton("");

	    JButton a7 = new JButton("");

	    JButton a8 = new JButton("");
	    
	    JButton a9 = new JButton("");
	    
	    int[] array = new int[] {0,0,0,0,0,0,0,0,0};
	    a1.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 int random = (int) Math.random() * 8 + 1;
	        	 System.out.print(random);
	        	 a1.setText("X");
	        	 array[2] = 1;
	        	 switch (random) {
	        	 case 1:
	        		 a2.setText("O");
	        		 break;
	        	 case 2:
	        		 a3.setText("O");
	        		 break;
	        	 case 3:
	        		 a4.setText("O");

	        		 break;
	        	 case 4:
	        		 a5.setText("O");

	        		 break;
	        	 case 5:
	        		 a6.setText("O");

	        		 break;
	        		 
	        	 case 6:
	        		 a7.setText("O");

	        		 break;
	        		 
	        	 case 7:
	        		 a8.setText("O");

	        		 break;
	        		 
	        	 case 8:
	        		 a9.setText("O");

	        		 break;
	        	 default:
	        		 a9.setText("O");
	        		 break;
	        	 }
	         }
	      });
	    a2.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 int random = (int) Math.random() * 8 + 1;
	        	 System.out.print(random);
	        	 a2.setText("X");
	        	 array[3] = 1;
	        	 switch (random) {
	        	 case 1:
	        		 a1.setText("O");
	        		 break;
	        	 case 2:
	        		 a3.setText("O");
	        		 break;
	        	 case 3:
	        		 a4.setText("O");

	        		 break;
	        	 case 4:
	        		 a5.setText("O");

	        		 break;
	        	 case 5:
	        		 a6.setText("O");

	        		 break;
	        		 
	        	 case 6:
	        		 a7.setText("O");

	        		 break;
	        		 
	        	 case 7:
	        		 a8.setText("O");

	        		 break;
	        		 
	        	 case 8:
	        		 a9.setText("O");

	        		 break;
	        	 default:
	        		 a9.setText("O");
	        		 break;
	        	 }
	         }
	      });
	    a3.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 int random = (int) Math.random() * 8 + 1;
	        	 System.out.print(random);
	        	 a3.setText("X");
	        	 array[4] = 1;
	        	 switch (random) {
	        	 case 1:
	        		 a2.setText("O");
	        		 break;
	        	 case 2:
	        		 a1.setText("O");
	        		 break;
	        	 case 3:
	        		 a4.setText("O");

	        		 break;
	        	 case 4:
	        		 a5.setText("O");

	        		 break;
	        	 case 5:
	        		 a6.setText("O");

	        		 break;
	        		 
	        	 case 6:
	        		 a7.setText("O");

	        		 break;
	        		 
	        	 case 7:
	        		 a8.setText("O");

	        		 break;
	        		 
	        	 case 8:
	        		 a9.setText("O");

	        		 break;
	        	 default:
	        		 a9.setText("O");
	        		 break;
	        	 }
	         }
	      });
	    a4.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 int random = (int) Math.random() * 8 + 1;
	        	 System.out.print(random);
	        	 a4.setText("X");
	        	 array[5] = 1;
	        	 switch (random) {
	        	 case 1:
	        		 a2.setText("O");
	        		 break;
	        	 case 2:
	        		 a3.setText("O");
	        		 break;
	        	 case 3:
	        		 a1.setText("O");

	        		 break;
	        	 case 4:
	        		 a5.setText("O");

	        		 break;
	        	 case 5:
	        		 a6.setText("O");

	        		 break;
	        		 
	        	 case 6:
	        		 a7.setText("O");

	        		 break;
	        		 
	        	 case 7:
	        		 a8.setText("O");

	        		 break;
	        		 
	        	 case 8:
	        		 a9.setText("O");

	        		 break;
	        	 default:
	        		 a9.setText("O");
	        		 break;
	        	 }
	         }
	      });
	    a5.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 int random = (int) Math.random() * 8 + 1;
	        	 System.out.print(random);
	        	 a5.setText("X");
	        	 array[6] = 1;
	        	 switch (random) {
	        	 case 1:
	        		 a2.setText("O");
	        		 break;
	        	 case 2:
	        		 a3.setText("O");
	        		 break;
	        	 case 3:
	        		 a4.setText("O");

	        		 break;
	        	 case 4:
	        		 a1.setText("O");

	        		 break;
	        	 case 5:
	        		 a6.setText("O");

	        		 break;
	        		 
	        	 case 6:
	        		 a7.setText("O");

	        		 break;
	        		 
	        	 case 7:
	        		 a8.setText("O");

	        		 break;
	        		 
	        	 case 8:
	        		 a9.setText("O");

	        		 break;
	        	 default:
	        		 a9.setText("O");
	        		 break;
	        	 }
	         }
	      });
	    a6.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 int random = (int) Math.random() * 8 + 1;
	        	 System.out.print(random);
	        	 a6.setText("X");
	        	 array[7] = 1;
	        	 switch (random) {
	        	 case 1:
	        		 a2.setText("O");
	        		 break;
	        	 case 2:
	        		 a3.setText("O");
	        		 break;
	        	 case 3:
	        		 a4.setText("O");

	        		 break;
	        	 case 4:
	        		 a5.setText("O");

	        		 break;
	        	 case 5:
	        		 a1.setText("O");

	        		 break;
	        		 
	        	 case 6:
	        		 a7.setText("O");

	        		 break;
	        		 
	        	 case 7:
	        		 a8.setText("O");

	        		 break;
	        		 
	        	 case 8:
	        		 a9.setText("O");

	        		 break;
	        	 default:
	        		 a9.setText("O");
	        		 break;
	        	 }
	         }
	      });
	    a7.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 int random = (int) Math.random() * 8 + 1;
	        	 System.out.print(random);
	        	 a7.setText("X");
	        	 array[8] = 1;
	        	 switch (random) {
	        	 case 1:
	        		 a2.setText("O");
	        		 break;
	        	 case 2:
	        		 a3.setText("O");
	        		 break;
	        	 case 3:
	        		 a4.setText("O");

	        		 break;
	        	 case 4:
	        		 a5.setText("O");

	        		 break;
	        	 case 5:
	        		 a6.setText("O");

	        		 break;
	        		 
	        	 case 6:
	        		 a1.setText("O");

	        		 break;
	        		 
	        	 case 7:
	        		 a8.setText("O");

	        		 break;
	        		 
	        	 case 8:
	        		 a9.setText("O");

	        		 break;
	        	 default:
	        		 a9.setText("O");
	        		 break;
	        	 }
	         }
	      });
	    a8.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 int random = (int) Math.random() * 8 + 1;
	        	 System.out.print(random);
	        	 a8.setText("X");
	        	 array[9] = 1;
	        	 switch (random) {
	        	 case 1:
	        		 a2.setText("O");
	        		 break;
	        	 case 2:
	        		 a3.setText("O");
	        		 break;
	        	 case 3:
	        		 a4.setText("O");

	        		 break;
	        	 case 4:
	        		 a5.setText("O");

	        		 break;
	        	 case 5:
	        		 a6.setText("O");

	        		 break;
	        		 
	        	 case 6:
	        		 a7.setText("O");

	        		 break;
	        		 
	        	 case 7:
	        		 a1.setText("O");

	        		 break;
	        		 
	        	 case 8:
	        		 a9.setText("O");

	        		 break;
	        	 default:
	        		 a9.setText("O");
	        		 break;
	        	 }
	         }
	      });
	    a9.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 int random = (int) Math.random() * 8 + 1;
	        	 System.out.print(random);
	        	 a9.setText("X");
	        	 array[10] = 1;
	        	 switch (random) {
	        	 case 1:
	        		 a2.setText("O");
	        		 break;
	        	 case 2:
	        		 a3.setText("O");
	        		 break;
	        	 case 3:
	        		 a4.setText("O");

	        		 break;
	        	 case 4:
	        		 a5.setText("O");

	        		 break;
	        	 case 5:
	        		 a6.setText("O");

	        		 break;
	        		 
	        	 case 6:
	        		 a7.setText("O");

	        		 break;
	        		 
	        	 case 7:
	        		 a8.setText("O");

	        		 break;
	        		 
	        	 case 8:
	        		 a1.setText("O");

	        		 break;
	        	 default:
	        		 a1.setText("O");
	        		 break;
	        	 }
	         }
	      });

	    frame.add(a1);
	    frame.add(a2);
	    frame.add(a3);
	    frame.add(a4);
	    frame.add(a5);
	    frame.add(a6);
	    frame.add(a7);
	    frame.add(a8);
	    frame.add(a9);
	    

	    frame.pack();
	    frame.setSize(500, 500);
	    frame.setVisible(true);
	}
	
	
		
}
