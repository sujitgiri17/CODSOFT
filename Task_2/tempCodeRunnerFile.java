import java.awt.Font;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.event.DocumentListener;  
public class Main {  
public static void UpdateCounter(JTextArea MainText,JLabel WordCountLabel,JLabel CharactersCount){
	String str = MainText.getText().strip();
	int count = 0, i, word = 0;

	String words[]=str.split(" ");
	CharactersCount.setText("Characters : " + str.length());
	WordCountLabel.setText("Total Words : "+words.length);
}
Main(){  
JFrame f = new JFrame();  
  JLabel EnterStringLabel,WordCountLabel,CharactersCount;
  JTextArea MainText;
  JButton CountButton,ClearButton;
  Font font=new Font(Font.SANS_SERIF,Font.PLAIN,16);
  

  //Declaration
  EnterStringLabel=new JLabel("Enter Your Text Below:");
  MainText=new JTextArea();
  WordCountLabel=new JLabel("Total Words : 0");
  CharactersCount =new JLabel("Characters: 0");
  ClearButton=new JButton("Clear");
  
//Bound
  EnterStringLabel.setBounds(10,10,400,20);  
  MainText.setBounds(10,50,500,400);
  ClearButton.setBounds(430,460,80,28);
  WordCountLabel.setBounds(10,460,200,20);
  CharactersCount.setBounds(10,490,200,20);

  //MainText.setLineWrap(true);
 // MainText.setWrapStyleWord(true);
	
 //style
 
 EnterStringLabel.setFont(font);
 MainText.setFont(font);
 WordCountLabel.setFont(font);
 CharactersCount.setFont(font);
 

 //Event Listner 


	MainText.getDocument().addDocumentListener(new DocumentListener() {

		@Override
			public void changedUpdate(DocumentEvent e){
				
				UpdateCounter(MainText, WordCountLabel,CharactersCount);
	
									   }
	
			@Override
			public void insertUpdate(DocumentEvent e) {
	
								UpdateCounter(MainText, WordCountLabel,CharactersCount);
			}
	
			@Override
			public void removeUpdate(DocumentEvent e) {

				UpdateCounter(MainText, WordCountLabel,CharactersCount);
			}
	});  
 //Adding component
  f.add(EnterStringLabel);
 f.add(MainText);
 f.add(ClearButton);
 f.add(WordCountLabel);
 f.add(CharactersCount);
  f.setSize(530,600);		
  f.setResizable(true);
  f.setLayout(null);
  f.setLocationRelativeTo(null);
  f.setVisible(true);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}  
  
public static void main(String[] args) {  
// TODO Auto-generated method stub  
Main s = new Main();  
}  
}  