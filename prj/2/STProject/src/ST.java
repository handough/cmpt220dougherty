import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ST extends JFrame implements ActionListener{
	/**
	 *   
	 *  */
	private static final long serialVersionUID = 1L;
	JLabel answer = new JLabel("");
	JPanel pane = new JPanel(); 
	JButton pressme = new JButton("Start");
	ST(){
		super("Smile Therapy"); 
	    setBounds(100,100,300,200);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container con = this.getContentPane(); 
	    con.add(pane); 
	    answer.setText("<html>Do 5 sets of 10 exercises <br> "
	    		+ " for 10 seconds each. </html>");
	    pressme.setMnemonic('P'); 
	    pressme.addActionListener(this);   
	    pane.add(answer); 
	    pane.add(pressme); 
	    pressme.requestFocus();
	    setVisible(true); 
	    }
	  
	public void actionPerformed(ActionEvent event){
		Object source = event.getSource();
	    if (source == pressme){
	    	for(int j = 1; j < 6; j++){
	    		JOptionPane.showMessageDialog(null, "You are on round " + j , 
	    				":)", JOptionPane.PLAIN_MESSAGE);
		    	for(int i = 1; i < 11; i++){
	    			answer.setText("Restart?");
		        	 JOptionPane.showMessageDialog(null,"Do exercise " + i + 
				    		  " for 10 seconds. Time: ",
				    		  "Nice work!", JOptionPane.PLAIN_MESSAGE);
		        	 
		        	 
		        	 setVisible(true);
		    	}
	    	}
	    }
	  }
	public static void main(String args[]){
		new ST();
	}
	}
	
