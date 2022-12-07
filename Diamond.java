import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.util.Random;
public class Diamond{
static boolean work = true;
static JLabel label = new JLabel();
static JTextField tf = new JTextField();
static Random random = new Random();
static int number = random.nextInt(6)+1;
static JButton button1 = new JButton("?");
static JButton button2 = new JButton("?");
static JButton button3 = new JButton("?");
static JButton button4 = new JButton("?");
static JButton button5 = new JButton("?");
static JButton button6 = new JButton("?");
public static void main(String args[]){
JFrame frame = new JFrame("My Eighth Project");
JPanel panel = new JPanel();
button1.setFont(new Font("?", Font.BOLD, 20));
button2.setFont(new Font("?", Font.BOLD, 20));
button3.setFont(new Font("?", Font.BOLD, 20));
button4.setFont(new Font("?", Font.BOLD, 20));
button5.setFont(new Font("?", Font.BOLD, 20));
button6.setFont(new Font("?", Font.BOLD, 20));
tf.setBounds(45, 10, 295, 40);
label.setBounds(45, 170, 245, 50);
button1.setBounds(45, 60, 95, 40);
button2.setBounds(145, 60, 95, 40);
button3.setBounds(245, 60, 95, 40);
button4.setBounds(45, 110, 95, 40);
button5.setBounds(145, 110, 95, 40);
button6.setBounds(245, 110, 95, 40);

button1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if(work){
	if(number==1)
	{
		tf.setText("DIAMOND");
		button1.setBackground(Color.green);
	    tf.setFont(new Font("DIAMOND", Font.BOLD, 18));
	    label.setFont(new Font("You win the diamond!", Font.BOLD, 20));
	    label.setText("You win the diamond!");
	    work = false;
	}
	else
	{
		tf.setText("EMPTY");
		button1.setBackground(Color.red);
	    tf.setFont(new Font("EMPTY", Font.BOLD, 18));
	    work = false;
	    open();
	}
}
}
});
button2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if(work){
	if(number==2)
	{
		tf.setText("DIAMOND");
		button2.setBackground(Color.green);
	    tf.setFont(new Font("DIAMOND", Font.BOLD, 18));
	    label.setFont(new Font("You win the diamond!", Font.BOLD, 20));
	    label.setText("You win the diamond!");
	    work = false;
	}
	else
	{
		tf.setText("EMPTY");
		button2.setBackground(Color.red);
	    tf.setFont(new Font("EMPTY", Font.BOLD, 18));
	    work = false;
	    open();
	}
}
}
});
button3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if(work){
	if(number==3)
	{
		tf.setText("DIAMOND");
		button3.setBackground(Color.GREEN);
	    tf.setFont(new Font("DIAMOND", Font.BOLD, 18));
	    label.setFont(new Font("You win the diamond!", Font.BOLD, 20));
	    label.setText("You win the diamond!");
	    work = false;
	}
	else
	{
		tf.setText("EMPTY");
		button3.setBackground(Color.RED);
		tf.setFont(new Font("EMPTY", Font.BOLD, 18));
		work = false;
		open();
	}
}
}
});
button4.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if(work){
	if(number==4)
	{
		tf.setText("DIAMOND");
		button4.setBackground(Color.green);
		tf.setFont(new Font("DIAMOND", Font.BOLD, 18));
		label.setFont(new Font("You the diamond!", Font.BOLD, 20));
		label.setText("You win the diamond!");
		work = false;
	}

	else
	{
		tf.setText("EMPTY");
		button4.setBackground(Color.red);
		tf.setFont(new Font("EMPTY", Font.BOLD, 18));
		work = false;
		open();
	}
}
}
});
button5.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if(work){
	if(number==5)
	{
		tf.setText("DIAMOND");
		button5.setBackground(Color.green);
		tf.setFont(new Font("DIAMOND", Font.BOLD, 18));
		label.setFont(new Font("You win the diamond!", Font.BOLD, 20));
		label.setText("You win the diamond");
		work = false;
	}
	else
	{
		tf.setText("EMPTY");
	    button5.setBackground(Color.red);
	    tf.setFont(new Font("EMPTY", Font.BOLD, 18));
	    work = false;
	    open();
	}
}
}
});
button6.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if(work){
	if(number==6)
	{
		tf.setText("DIAMOND");
		button6.setBackground(Color.green);
	    tf.setFont(new Font("DIAMOND", Font.BOLD, 18));
	    label.setFont(new Font("You win the diamond!", Font.BOLD, 20));
	    label.setText("You win the diamond!");
	    work = false;
	}
	else
	{
		tf.setText("EMPTY");
		button6.setBackground(Color.red);
	    tf.setFont(new Font("EMPTY", Font.BOLD, 18));
	    work = false;
	    open();
	}
}
}
});
panel.add(tf);
panel.add(label);
panel.add(button1);
panel.add(button2);
panel.add(button3);
panel.add(button4);
panel.add(button5);
panel.add(button6);
frame.setVisible(true);
frame.setSize(400, 400);
frame.setLocationRelativeTo(null);
panel.setLayout(null);
frame.add(panel);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setResizable(false);
}
public static void open(){
	if(number==1)
	{
		button1.setBackground(Color.green);
		label.setFont(new Font("You win the diamond!", Font.BOLD, 20));
		label.setText("You loss the diamond!");
	}else if(number==2)
	{
		button2.setBackground(Color.green);
	    label.setFont(new Font("You win the diamond!", Font.BOLD, 20));
	    label.setText("You loss the diamond!");
	}else if(number==3)
	{
		button3.setBackground(Color.GREEN);
	    label.setFont(new Font("You win the diamond!", Font.BOLD, 20));
	    label.setText("You loss the diamond!");
	} else if(number==4)
	{
		button4.setBackground(Color.green);
		label.setFont(new Font("You the diamond!", Font.BOLD, 20));
		label.setText("You loss the diamond!");
	} else if(number==5)
	{
		button5.setBackground(Color.green);
		label.setFont(new Font("You win the diamond!", Font.BOLD, 20));
		label.setText("You loss the diamond");
	} else if(number==6)
	{
		button6.setBackground(Color.green);
	    label.setFont(new Font("You win the diamond!", Font.BOLD, 20));
	    label.setText("You loss the diamond!");
	}

}
}





