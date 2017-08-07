package shadowhack;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Hack {
	public static void main(String[] args) throws InterruptedException {
		String hack = "<html><p style='font-family: 'Source Code Pro''>Congratulations :) ! All of your files have been encrypted by the team at Shadow Cipher. <br/> Per hour, one file will be deleted. <br/>  Of course you can delete this program... what will it serve you?<br/><br/>What can you do? Well, to begin with, let me explain<br/>our little game. Every 10 minutes, files are deleted...<br/>and in an increasing fashion, too. <br/>How can you stop this? Easy, follow the instructions below.<br/>Don't try anything fishy, though, since your files are encrypted.<br/><br/>Are you bored of this little game? Well, play a fun game of Tic-Tac-Toe here! Don't worry about anything here, though, since your computer is already infected; just thought it'd be a nice touch! Praise be upon rezzonkey and may Anday keep s<br/><br/><u>Send 0 USD in <b>Bitcoins</b> to this address: </u> <span style='color: yellow;'>jdssdadsxxd</span><br/><br/><br/><br/><br/>";
		
		
		JFrame mainframe = new JFrame();
		JLabel label = new JLabel();
		String empty = "";
		//Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		JButton play = new JButton("Play!");
		play.setBackground(Color.black);
		play.setForeground(Color.red);
        play.setFocusPainted(false);
        
		mainframe.add(label);
	    play.setPreferredSize(new Dimension(40, 40));
		label.setBounds(0, 0, 0, 0);
		label.setForeground(Color.green);
		mainframe.getContentPane().setBackground(Color.black);
		mainframe.setSize(500, 500);
		mainframe.setVisible(true);
		mainframe.setLayout(null);
		
		for(int i=0; i<hack.length(); i++) {
			char currentlet = hack.charAt(i);
			label.setText(empty + currentlet + "_");
			String without = label.getText();
			empty = without.substring(0,without.length()-1);
			if (without.length() == hack.length()+1) {
				
			}
			try {
				TimeUnit.MILLISECONDS.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		int seconds = 59;
		int minutes = 59;
		label.setText(hack + "<span style='color: red; font-size: 50px; font-weight: bold;'>" + minutes + ":" + seconds + "<br/><br/><br/><br/><br/><br/></span></p></html>");
		int i = 0;
		int ex = 2;
		tictactoe main = new tictactoe();
		main.Tic();
		while (true) {
			
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
				seconds--;
				if (seconds == 0) {
					minutes--;
					seconds = 59;
				}
				
				if (minutes < 51) {
					label.setForeground(Color.orange);
					if (minutes < 41) {
						label.setForeground(Color.red);
					}
				}
				
				if (minutes < 0) {
					while(true) {
					label.setText(hack + "<span style='color: red; font-size: 50px; font-weight: bold;'>" + "0" + ":" + "00" + "<br/></span></p></html>");
					}
				}
				if (minutes%10 == 0 && seconds == 1) {
					i++;
					ex = (int) (Math.pow(ex,i));
					String command = "say " + ex + " files deleted";
					label.setText(hack + "<span style='color: red; font-size: 50px; font-weight: bold;'>" + minutes + ":0" + seconds + "<br/></span></p></html>");

			        Process proc;
					try {
						proc = Runtime.getRuntime().exec(command);
						
						
						BufferedReader reader =  
					              new BufferedReader(new InputStreamReader(proc.getInputStream()));

					        String line = "";
					        try {
								while((line = reader.readLine()) != null) {
								    System.out.print(line + "\n");
								}
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

					        proc.waitFor();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

			        // Read the output

			        
				}
				
				
				if (seconds<10) {
					
					label.setText(hack + "<span style='color: red; font-size: 50px; font-weight: bold;'>" + minutes + ":0" + seconds + "<br/></span></p></html>");
					
				}
				label.setText(hack + "<span style='color: red; font-size: 50px; font-weight: bold;'>" + minutes + ":" + seconds + "<br/></span></p></html>");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			
		}
		
	}
}
