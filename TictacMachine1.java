import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TictacMachine1 implements ActionListener
{
	JFrame frame=new JFrame();
	JButton but1=new JButton();
	JButton but2=new JButton();
	JButton but3=new JButton();
	JButton but4=new JButton();
	JButton but5=new JButton();
	JButton but6=new JButton();
	JButton but7=new JButton();
	JButton but8=new JButton();
	JButton but9=new JButton();
	JButton restart=new JButton("Restart ");
	JButton exit=new JButton("Exit ");
	boolean b=true;
	TictacMachine1()
	{
		GridLayout g=new GridLayout(4,3,5,5);
		Container con=frame.getContentPane();
		frame.setBounds(0,0,500,500);
		con.setLayout(g);
		
	
		con.add(but1);
		con.add(but2);
		con.add(but3);
		con.add(but4);
		con.add(but5);
		con.add(but6);
		con.add(but7);
		con.add(but8);
		con.add(but9);
		con.add(restart);
		con.add(exit);
		
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		but4.addActionListener(this);
		but5.addActionListener(this);
		but6.addActionListener(this);
		but7.addActionListener(this);
		but8.addActionListener(this);
		but9.addActionListener(this);
	    restart.addActionListener(this);
		exit.addActionListener(this);
		
		frame.show();
	}
	/////////////////Action performed //////////////////////////////
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(but1==e.getSource()){
		if(b)
		{
			if(but1.getText().equals(""))
			{
				but1.setText("0");
				but1.setBackground(Color.blue);
			}
		}
		but1.setEnabled(false);
		}
		
		if(but2==e.getSource())
		{
			if(b)
			{
				if(but2.getText().equals(""))
				{
						but2.setText("0");
						but2.setBackground(Color.blue);
				}
				
			}
			but2.setEnabled(false);
		}
		if(but3==e.getSource())
		{
			if(b)
			{
				if(but3.getText().equals(""))
				{
						but3.setText("0");
						but3.setBackground(Color.blue);
				}
				
			}
			but3.setEnabled(false);
		}
		if(but4==e.getSource())
		{
			if(b)
			{
				if(but4.getText().equals(""))
				{
						but4.setText("0");
						but4.setBackground(Color.blue);
				}
				
			}
			but4.setEnabled(false);
		}
		if(but5==e.getSource())
		{
			if(b)
			{
				if(but5.getText().equals(""))
				{
						but5.setText("0");
						but5.setBackground(Color.blue);
				}
				
			}
			but5.setEnabled(false);
		}
		if(but6==e.getSource())
		{
			if(b)
			{
				if(but6.getText().equals(""))
				{
						but6.setText("0");
						but6.setBackground(Color.blue);
				}
				
			}
			but6.setEnabled(false);
		}
		if(but7==e.getSource())
		{
			if(b)
			{
				if(but7.getText().equals(""))
				{
						but7.setText("0");
						but7.setBackground(Color.blue);
				}
				
			}
			but7.setEnabled(false);
		}
		if(but8==e.getSource())
		{
			if(b)
			{
				if(but8.getText().equals(""))
				{
						but8.setText("0");
						but8.setBackground(Color.blue);
				}
				
			}
			but8.setEnabled(false);
		}
		if(but9==e.getSource())
		{
			if(b)
			{
				if(but9.getText().equals(""))
				{
						but9.setText("0");
						but9.setBackground(Color.blue);
				}
				
			}
			but9.setEnabled(false);
		}
		if(restart==e.getSource())
		{
			Restart();
		}
		if(exit==e.getSource())
		{
			frame.dispose();
		}
			
		
		Machine();
		condition();
		
	}
	/////////////////////End Action Performed //////////////////////////
	public void setenable()
	{
		but1.setEnabled(false);
		but2.setEnabled(false);
		but3.setEnabled(false);
		but4.setEnabled(false);
		but5.setEnabled(false);
		but6.setEnabled(false);
		but7.setEnabled(false);
		but8.setEnabled(false);
		but9.setEnabled(false);
	}   /// end setenable
	///////////////////////////Machine() //////////////////
	public void Machine()
	{
		
		int n=ComputerWinCheck();
		if(n>0)
			mark(n);
		else 
		{
			n=userWinCheck();
			if(n>0)
				mark(n);
			else{
				n=winPossible();
				if(n>0)
					mark(n);
				else{
					n=Startclick();
					if(n>0)
				mark(n);}
			}
		}
		//condition();
			
	}
	/////////////////end Machine()/////////////////////////
	//Start ComputerWinCheck///////////////////////////////////
	 public int ComputerWinCheck()
	{
		int ret=-1;
		if(but1.getText().equals("X")&&but2.getText().equals("X")){
			if(but3.getText().equals(""))
			ret= 3;
		}
			else
			
				if(but2.getText().equals("X")&&but3.getText().equals("X")){
					if(but1.getText().equals(""))
			 ret= 1;
			}
			else
				
				if(but1.getText().equals("X")&&but3.getText().equals("X")){
					if(but2.getText().equals(""))
			ret= 2;}
		// 1st row
			
			else
				
				if(but1.getText().equals("X")&&but4.getText().equals("X")){
					if(but7.getText().equals(""))
			ret= 7;}
			
			else
				
				if(but1.getText().equals("X")&&but7.getText().equals("X")){
					if(but4.getText().equals(""))
			ret= 4;}
			
			else
			
				if(but4.getText().equals("X")&&but7.getText().equals("X")){
					if(but1.getText().equals(""))
			ret= 1;}
		// 1st colom
			else
				if(but1.getText().equals("X")&&but5.getText().equals("X")){
					if(but9.getText().equals(""))
			ret= 9;}
			else
				if(but1.getText().equals("X")&&but9.getText().equals("X")){
					if(but5.getText().equals(""))
			ret= 5;}
			else
				if(but5.getText().equals("X")&&but9.getText().equals("X")){
					if(but1.getText().equals(""))
			ret= 1;}
		//1st digonal
			else
				if(but2.getText().equals("X")&&but5.getText().equals("X")){
					if(but8.getText().equals(""))
			ret= 8;}
			
			else
				 
				if(but5.getText().equals("X")&&but8.getText().equals("X")){
					if(but2.getText().equals(""))
			ret= 2;}
			
			else
				if(but2.getText().equals("X")&&but8.getText().equals("X")){
					if(but5.getText().equals(""))
			ret= 5;}
		//2nd colom
			else
				
				if(but3.getText().equals("X")&&but6.getText().equals("X")){
					if(but9.getText().equals(""))
			ret= 9;}
			
			else
				
				if(but3.getText().equals("X")&&but9.getText().equals("X")){
					if(but6.getText().equals(""))
			ret= 6;}
			
			else
				
				if(but6.getText().equals("X")&&but9.getText().equals("X")){
					if(but3.getText().equals(""))
			ret= 3;}
		//3rd colom
			else
				if(but3.getText().equals("X")&&but5.getText().equals("X")){
					if(but7.getText().equals(""))
			ret= 7;}
			
			else
			
				if(but3.getText().equals("X")&&but7.getText().equals("X")){
					if(but5.getText().equals(""))
			ret= 5;}
			
			else
		
				if(but5.getText().equals("X")&&but7.getText().equals("X")){
					if(but3.getText().equals(""))
			ret=3;}
			//2nd digonal
			else
				if(but4.getText().equals("X")&&but5.getText().equals("X")){
					if(but6.getText().equals(""))
			ret= 6;}
			else
			
				if(but4.getText().equals("X")&&but6.getText().equals("X")){
					if(but5.getText().equals(""))
				ret= 5;}
			else
				if(but5.getText().equals("X")&&but6.getText().equals("X")){
					if(but4.getText().equals(""))
			ret= 4;}
		//2nd row
			else
				if(but7.getText().equals("X")&&but8.getText().equals("X")){
					if(but9.getText().equals(""))
			ret= 9;}
			else
				
				if(but7.getText().equals("X")&&but9.getText().equals("X")){
					if(but8.getText().equals(""))
			ret= 8;}
			
			else
	
				if(but8.getText().equals("X")&&but9.getText().equals("X")){
					if(but7.getText().equals(""))
			ret= 7;}
	 
		 return  ret;
			
	}	 // end of winCheckMachine
	/////////////////////////////////////
	//////////////////////////userWinCheck start /////////////////////////
	public int userWinCheck(){
		int ret=-1;
		if(but1.getText().equals("0")&&but2.getText().equals("0"))
		{
			if(but3.getText().equals(""))
				 ret= 3;
		}
			else
				 
				
		if(but1.getText().equals("0")&&but3.getText().equals("0"))
		{
			if(but2.getText().equals(""))
				 ret= 2;
			}
			else
				if(but2.getText().equals("0")&&but3.getText().equals("0"))
		{
			if(but1.getText().equals(""))
				 ret= 1;
			}
			/// 1st row
			else
					
		if(but1.getText().equals("0")&&but4.getText().equals("0"))
		{
			if(but7.getText().equals(""))
				  ret= 7;
			}
			else
				 
		
		if(but1.getText().equals("0")&&but7.getText().equals("0"))
		{
			if(but4.getText().equals(""))
			 ret=4;}
			else
				if(but4.getText().equals("0")&&but7.getText().equals("0"))
		{
			if(but1.getText().equals(""))
			 ret=1;}
		 // 1st colom
			else
				
		if(but1.getText().equals("0")&&but5.getText().equals("0"))
		{
			if(but9.getText().equals(""))
			 ret=9;
		}
			else
				if(but1.getText().equals("0")&&but9.getText().equals("0")){
					if(but5.getText().equals(""))
				ret=5;}
				else

	if(but5.getText().equals("0")&&but9.getText().equals("0")&&but1.getText().equals(""))
					ret=1;
				//1st digonal
				else
				 
		if(but2.getText().equals("0")&&but5.getText().equals("0"))
		{
			if(but8.getText().equals(""))
			 ret=8;}
			else
				 		 
		if(but2.getText().equals("0")&&but8.getText().equals("0"))
		{
			if(but5.getText().equals(""))
			 ret=5;}
			else
						 
		if(but5.getText().equals("0")&&but8.getText().equals("0"))
		{
			if(but2.getText().equals(""))
			 ret=2;}
		 //2nd colom
			else
		
		if(but3.getText().equals("0")&&but6.getText().equals("0"))
		{
			if(but9.getText().equals(""))
			 ret=9;}
			else 
				 
		if(but6.getText().equals("0")&&but9.getText().equals("0"))
		{
			if(but3.getText().equals(""))
			 ret=3;
		}
			else 
				if(but3.getText().equals("0")&&but9.getText().equals("0")){
					if(but6.getText().equals(""))
				ret=6;}
			//3rd colom 
				else	 
		if(but3.getText().equals("0")&&but5.getText().equals("0"))
		{
			if(but7.getText().equals(""))
			 ret=7;
		 }
			else 
				 
		if(but5.getText().equals("0")&&but7.getText().equals("0"))
		{
			if(but3.getText().equals(""))
                ret=3;
			}
			else
				if(but3.getText().equals("0")&&but7.getText().equals("0")&&but5.getText().equals(""))
					ret=5;
				//2nd digonal 
				else 
		if(but4.getText().equals("0")&&but5.getText().equals("0"))
		{
			if(but6.getText().equals(""))
			 ret=6;}
			else
				 
		if(but4.getText().equals("0")&&but6.getText().equals("0"))
		{
			if(but5.getText().equals(""))
				 ret=5;
			}
		else
			 
		if(but5.getText().equals("0")&&but6.getText().equals("0"))
			
		{
			if(but4.getText().equals(""))
			 ret=4;}
		 //2nd row
			else	 
		if(but7.getText().equals("0")&&but8.getText().equals("0"))
		{
			if(but9.getText().equals(""))
			 ret=9;}
			else
				 
		if(but8.getText().equals("0")&&but9.getText().equals("0"))
		{
			if(but7.getText().equals(""))
			 ret=7;
		}
		else
					 
		if(but7.getText().equals("0")&&but9.getText().equals("0"))
		{
			if(but8.getText().equals(""))
			 ret=8;
		}
		//3rd row
		
				return  ret;
		
	}
	///////////////////////////////end userWinCheck ///////////////////
	/////////winPossible() start///////////////
	public int winPossible()
	{
int ret=-1;
	
		if(but1.getText().equals("X")&&but5.getText().equals("")&& but9.getText().equals(""))
		 ret= 5;
	else
		if(but5.getText().equals("X")&&but1.getText().equals("")&& but9.getText().equals(""))
			ret= 9;
		else
			if(but9.getText().equals("X")&&but1.getText().equals("")&& but5.getText().equals(""))
				ret= 1;
			/// 1st digonal
			else
	
		if(but3.getText().equals("X")&&but5.getText().equals("")&&but7.getText().equals(""))
		 ret= 5;
	 else
		if(but5.getText().equals("X")&&but7.getText().equals("")&& but3.getText().equals(""))
			ret= 7;
		else
			if(but7.getText().equals("X")&&but5.getText().equals("")&& but3.getText().equals(""))
				ret= 3;
			//2nd digonal
		else 
			if(but1.getText().equals("X")&&but2.getText().equals("")&&but3.getText().equals(""))
		 ret= 3;
	 else
		if(but3.getText().equals("X")&&but2.getText().equals("")&&but1.getText().equals(""))
		 ret= 2;
		else 
			if(but2.getText().equals("X")&&but1.getText().equals("")&&but3.getText().equals(""))
			 ret= 1;
		 //1st row
	else 
		if(but4.getText().equals("X")&&but5.getText().equals("")&&but6.getText().equals(""))
		 ret= 6;
		else
		if(but5.getText().equals("X")&&but4.getText().equals("")&&but6.getText().equals(""))
		 ret= 4;
		else
		if(but6.getText().equals("X")&&but4.getText().equals("")&&but5.getText().equals(""))
		 ret= 5; 
	 // 2nd row
		else 
     if(but7.getText().equals("X")&&but8.getText().equals("")&&but9.getText().equals(""))
		 ret= 9;
	else
   if(but8.getText().equals("X")&&but7.getText().equals("")&&but9.getText().equals(""))
		 ret= 7;
		else
	if(but9.getText().equals("X")&&but8.getText().equals("")&&but7.getText().equals(""))
			 ret= 8;
		 //3rd row
		else
	if(but1.getText().equals("X")&&but4.getText().equals("")&&but7.getText().equals(""))
		 ret= 4;
		else
	if(but7.getText().equals("X")&&but1.getText().equals("")&&but4.getText().equals(""))
			 ret= 1;
		else
	if(but4.getText().equals("X")&&but7.getText().equals("")&&but1.getText().equals(""))
		 ret= 7;
	 //1st colum
		else
	if(but2.getText().equals("X")&&but5.getText().equals("")&&but8.getText().equals(""))
			 ret= 8;
		 else 
	if(but5.getText().equals("X")&&but2.getText().equals("")&&but8.getText().equals(""))
		 ret= 2;
		else
	if(but8.getText().equals("X")&&but5.getText().equals("")&&but2.getText().equals(""))
			 ret= 5;
		 //2nd colum
		 else
	if(but3.getText().equals("X")&&but6.getText().equals("")&&but9.getText().equals(""))
			 ret= 6;
		 else 
	if(but6.getText().equals("X")&&but3.getText().equals("")&&but9.getText().equals(""))
		 ret= 9;
		else
	if(but9.getText().equals("X")&&but6.getText().equals("")&&but3.getText().equals(""))
			 ret= 3;
		 //3rd colum
		 
		 return ret;
	
	} 
	////////////////////winpossible end /////////////
	////////start mark////////////////////
public void mark(int n){
	
	switch(n){
		
		case 1:
		but1.setText("X");
		but1.setBackground(Color.red);	
			but1.setEnabled(false);
		break;
		case 2:
		but2.setText("X");
		but2.setBackground(Color.red);	
	    but2.setEnabled(false);
		break;
		case 3:
		but3.setText("X");
		but3.setBackground(Color.red);	
	    but3.setEnabled(false);
		break;
		case 4:
		but4.setText("X");
		but4.setBackground(Color.red);	
	    but4.setEnabled(false);
		break;
		case 5:
	
	    but5.setText("X");
		but5.setBackground(Color.red);	
	    but5.setEnabled(false);
		break;
		case 6:
		but6.setText("X");
		but6.setBackground(Color.red);	
	    but6.setEnabled(false);
		break;
		case 7:
		but7.setText("X");
		but7.setBackground(Color.red);	
	    but7.setEnabled(false);
		break;
		case 8:
		but8.setText("X");
		but8.setBackground(Color.red);	
	    but8.setEnabled(false);
		break;
		case 9:
		but9.setText("X");
		but9.setBackground(Color.red);	
	    but9.setEnabled(false);
	   break;
	}
		
}
//     ////Mark end ///////////////////// 
/////////////////////////Condition start/////////////////
public void condition()
		{
			 if(but1.getText().equals("X")&&but2.getText().equals("X")&&but3.getText().equals("X"))
		 {
			 
			 but1.setBackground(Color.yellow);
			 but2.setBackground(Color.yellow);
			 but3.setBackground(Color.yellow);
			 JOptionPane.showMessageDialog(null,"Machine  win the game ");
			 setenable();
		 }
		 else
		  if(but1.getText().equals("X")&&but5.getText().equals("X")&&but9.getText().equals("X"))
		 {
			 
			 but1.setBackground(Color.yellow);
			 but5.setBackground(Color.yellow);
			 but9.setBackground(Color.yellow);
			 JOptionPane.showMessageDialog(null,"Machine win the game ");
			  setenable();
		 }
		 else
		  if(but2.getText().equals("X")&&but5.getText().equals("X")&&but8.getText().equals("X"))
		 {
			 
			 but2.setBackground(Color.yellow);
			 but5.setBackground(Color.yellow);
			 but8.setBackground(Color.yellow);
			 JOptionPane.showMessageDialog(null,"Machine win the game ");
			  setenable();
		 }
		 else
		  if(but3.getText().equals("X")&&but6.getText().equals("X")&&but9.getText().equals("X"))
		 {
			 
			 but3.setBackground(Color.yellow);
			 but6.setBackground(Color.yellow);
			 but9.setBackground(Color.yellow);
			 JOptionPane.showMessageDialog(null,"Machine  win the game ");
			  setenable();
		 }
		 else
		  if(but4.getText().equals("X")&&but5.getText().equals("X")&&but6.getText().equals("X"))
		 {
			 
			 but4.setBackground(Color.yellow);
			 but5.setBackground(Color.yellow);
			 but6.setBackground(Color.yellow);
			 JOptionPane.showMessageDialog(null,"Machine win the game ");
			  setenable();
		 }
		 else
		  if(but1.getText().equals("X")&&but4.getText().equals("X")&&but7.getText().equals("X"))
		 {
			 
			 but1.setBackground(Color.yellow);
			 but4.setBackground(Color.yellow);
			 but7.setBackground(Color.yellow);
			 JOptionPane.showMessageDialog(null,"Machine win the game ");
			 setenable();  
		 }
		 else
		  if(but7.getText().equals("X")&&but8.getText().equals("X")&&but9.getText().equals("X"))
		 {
			 
			 but7.setBackground(Color.yellow);
			 but8.setBackground(Color.yellow);
			 but9.setBackground(Color.yellow);
			 JOptionPane.showMessageDialog(null,"Machine  win the game ");
			  setenable();
		 }
		 else
		  if(but3.getText().equals("X")&&but5.getText().equals("X")&&but7.getText().equals("X"))
		 {
			 
			 but3.setBackground(Color.yellow);
			 but5.setBackground(Color.yellow);
			 but7.setBackground(Color.yellow);
			 JOptionPane.showMessageDialog(null,"Machine  win the game ");
			  setenable();
		 }
		 else
		 if(but1.getText().equals("0")&&but2.getText().equals("0")&&but3.getText().equals("0"))
		 {
			 
			 but1.setBackground(Color.yellow);
			 but2.setBackground(Color.yellow);
			 but3.setBackground(Color.yellow);
			 JOptionPane.showMessageDialog(null,"0 win the game ");
			 setenable();
		 }
		 else
		  if(but1.getText().equals("0")&&but5.getText().equals("0")&&but9.getText().equals("0"))
		 {
			 
			 but1.setBackground(Color.yellow);
			 but5.setBackground(Color.yellow);
			 but9.setBackground(Color.yellow);
			 JOptionPane.showMessageDialog(null,"0 win the game ");
			 setenable();
		 }
		 else
		 
		  if(but3.getText().equals("0")&&but6.getText().equals("0")&&but9.getText().equals("0"))
		 {
			 
			 but3.setBackground(Color.yellow);
			 but6.setBackground(Color.yellow);
			 but9.setBackground(Color.yellow);
			 JOptionPane.showMessageDialog(null,"0 win the game ");
			  setenable();
		 }
		 else
		  if(but2.getText().equals("0")&&but5.getText().equals("0")&&but8.getText().equals("0"))
		 {
			 but2.setBackground(Color.yellow);
			 but5.setBackground(Color.yellow);
			 but8.setBackground(Color.yellow);
			 JOptionPane.showMessageDialog(null,"0 win the game ");
			  setenable();
		 }
		 else
		  if(but4.getText().equals("0")&&but5.getText().equals("0")&&
		  but6.getText().equals("0"))
		 {
			 but4.setBackground(Color.yellow);
			 but5.setBackground(Color.yellow);
			 but6.setBackground(Color.yellow);
			 JOptionPane.showMessageDialog(null,"0 win the game ");
			  setenable();
		 }
		 else
		  if(but1.getText().equals("0")&&but4.getText().equals("0")&&
		  but7.getText().equals("0"))
		 {
			 but1.setBackground(Color.yellow);
			 but4.setBackground(Color.yellow);
			 but7.setBackground(Color.yellow);
			 JOptionPane.showMessageDialog(null,"0 win the game ");
			  setenable();
		 }
		 else
		  if(but7.getText().equals("0")&&but8.getText().equals("0")&&but9.getText().equals("0"))
		 {
			 
			 but7.setBackground(Color.yellow);
			 but8.setBackground(Color.yellow);
			 but9.setBackground(Color.yellow);
			 JOptionPane.showMessageDialog(null,"0 win the game ");
			  setenable();
		 }
		 else
		  if(but3.getText().equals("0")&&but5.getText().equals("0")&&but7.getText().equals("0"))
		 {
			 but3.setBackground(Color.yellow);
			 but5.setBackground(Color.yellow);
			 but7.setBackground(Color.yellow);
			 JOptionPane.showMessageDialog(null,"0 win the game ");
			 setenable();
		 }
		} 
		/////////condition method end /////////////////
		//////////////Restart()//////////////////////
		public void Restart()
	{
		but1.setEnabled(true);
		but1.setText("");
		but1.setBackground(Color.gray);
		but2.setEnabled(true);
		but2.setText("");
		but2.setBackground(Color.gray);
		but3.setEnabled(true);
		but3.setText("");
		but3.setBackground(Color.gray);
		but4.setEnabled(true);
		but4.setText("");
		but4.setBackground(Color.gray);
		but5.setEnabled(true);
		but5.setText("");
		but5.setBackground(Color.gray);
		but6.setEnabled(true);
		but6.setText("");
		but6.setBackground(Color.gray);
		but7.setEnabled(true);
		but7.setText("");
		but7.setBackground(Color.gray);
		but8.setEnabled(true);
		but8.setText("");
		but8.setBackground(Color.gray);
		but9.setEnabled(true);
		but9.setText("");
		but9.setBackground(Color.gray);
	} // Restart method end /////////////////
	/////////./////// Startclick()/////////////////////
			public int Startclick(){
		int ret=0;
		if(but1.getText().equals("0")&&but5.getText().equals("")&& but9.getText().equals(""))
		 ret= 5;
	else
		if(but5.getText().equals("0")&&but1.getText().equals("")&& but9.getText().equals(""))
			ret= 9;
		else
			if(but9.getText().equals("0")&&but1.getText().equals("")&& but5.getText().equals(""))
				ret= 1;
			/// 1st digonal
			else
	
		if(but3.getText().equals("0")&&but5.getText().equals("")&&but7.getText().equals(""))
		 ret= 5;
	 else
		if(but5.getText().equals("0")&&but7.getText().equals("")&& but3.getText().equals(""))
			ret= 7;
		else
			if(but7.getText().equals("0")&&but5.getText().equals("")&& but3.getText().equals(""))
				ret= 3;
			//2nd digonal
		else 
			if(but1.getText().equals("0")&&but2.getText().equals("")&&but3.getText().equals(""))
		 ret= 3;
	 else
		if(but3.getText().equals("0")&&but2.getText().equals("")&&but1.getText().equals(""))
		 ret= 2;
		else 
			if(but2.getText().equals("0")&&but1.getText().equals("")&&but3.getText().equals(""))
			 ret= 1;
		 //1st row
	else 
		if(but4.getText().equals("0")&&but5.getText().equals("")&&but6.getText().equals(""))
		 ret= 6;
		else
		if(but5.getText().equals("0")&&but4.getText().equals("")&&but6.getText().equals(""))
		 ret= 4;
		else
		if(but6.getText().equals("0")&&but4.getText().equals("")&&but5.getText().equals(""))
		 ret= 5; 
	 // 2nd row
		else 
     if(but7.getText().equals("0")&&but8.getText().equals("")&&but9.getText().equals(""))
		 ret= 9;
	else
   if(but8.getText().equals("0")&&but7.getText().equals("")&&but9.getText().equals(""))
		 ret= 7;
		else
	if(but9.getText().equals("0")&&but8.getText().equals("")&&but7.getText().equals(""))
			 ret= 8;
		 //3rd row
		else
	if(but1.getText().equals("0")&&but4.getText().equals("")&&but7.getText().equals(""))
		 ret= 4;
		else
	if(but7.getText().equals("0")&&but1.getText().equals("")&&but4.getText().equals(""))
			 ret= 1;
		else
	if(but4.getText().equals("0")&&but7.getText().equals("")&&but1.getText().equals(""))
		 ret= 7;
	 //1st colum
		else
	if(but2.getText().equals("0")&&but5.getText().equals("")&&but8.getText().equals(""))
			 ret= 8;
		 else 
	if(but5.getText().equals("0")&&but2.getText().equals("")&&but8.getText().equals(""))
		 ret= 2;
		else
	if(but8.getText().equals("0")&&but5.getText().equals("")&&but2.getText().equals(""))
			 ret= 5;
		 //2nd colum
		 else
			 if(but3.getText().equals("0")&&but4.getText().equals(""))
				 ret=4;
			 else
	if(but3.getText().equals("0")&&but6.getText().equals("")&&but9.getText().equals(""))
			 ret= 6;
		 else 
	if(but6.getText().equals("0")&&but3.getText().equals("")&&but9.getText().equals(""))
		 ret= 9;
		else
	if(but9.getText().equals("0")&&but6.getText().equals("")&&but3.getText().equals(""))
			 ret= 3;
		 //3rd colum
		 return ret;
		 }
		 /////////////end Stackclicl /////////////////////
		 /*
		 public int Firststart(){
int ret=-1;
		if(but1.getText().equals("0")&&but5.getText().equals(""))

			ret=5;
			else
			
		if(but2.getText().equals("0")&&but1.getText().equals(""))

			ret=1;
		else 
			if(but2.getText().equals("0")&&but3.getText().equals(""))
			ret=3;
		else

		if(but3.getText().equals("0")&&but2.getText().equals(""))
		
			ret=2;
			
		else 
			if(but3.getText().equals("0")&&but6.getText().equals(""))
				ret=6;
		else
		
		if(but4.getText().equals("0")&&but1.getText().equals(""))
			ret=1;
			
		else
		if(but4.getText().equals("0")&&but7.getText().equals(""))
			ret=7;
			else
		if(but5.getText().equals("0")&&but4.getText().equals(""))
		
			ret=4;
			
		else 
		if(but5.getText().equals("0")&&but6.getText().equals(""))
		
			ret=6;
		if(but6.getText().equals("0")&&but3.getText().equals(""))
		
			ret=3;
		
		else
			if(but6.getText().equals("0")&&but9.getText().equals(""))
				ret=9;
				else
		if(but7.getText().equals("0")&&but4.getText().equals(""))
			ret=4;
		else
			if(but7.getText().equals("0")&&but8.getText().equals(""))
				ret=8;
		else
		if(but8.getText().equals("0")&&but7.getText().equals(""))
		
			ret=7;
		else
			if(but8.getText().equals("0")&&but9.getText().equals(""))
				ret=9;
		else
		if(but9.getText().equals("0")&&but8.getText().equals(""))
			ret=8;
		else
			if(but9.getText().equals("0")&&but6.getText().equals(""))
			ret=6;
			return ret;
	}
	*/
			
public static void main(String arg[])
{
	TictacMachine1 t=new TictacMachine1();
}
}

		