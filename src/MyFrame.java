import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

	Calendar calender;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dateFormat;
	SimpleDateFormat dayFormat;
	JLabel timeLabel;
	JLabel dateLabel;
	JLabel dayLabel;
	String date;
	String day;
	String time;
	
	MyFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(350,200);
		//this.setResizable(true);
		this.setTitle("Clock");
		this.setLocationRelativeTo(null);
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat = new SimpleDateFormat("EEEE");
		dateFormat = new SimpleDateFormat("MMMM dd, yyyy");

		timeLabel = new JLabel();
		timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
		timeLabel.setForeground(new Color(0x00FF00));
		timeLabel.setBackground(Color.BLACK);
		timeLabel.setOpaque(true);
		

		dayLabel = new JLabel();
		dayLabel.setFont(new Font("Ink free", Font.PLAIN, 35));
		day = dayFormat.format(calender.getInstance().getTime());
		dayLabel.setText(day);
		
		dateLabel = new JLabel();
		dateLabel.setFont(new Font("Ink free", Font.PLAIN, 25));
		
		
		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		this.setVisible(true);
		
		setTime();
	}

	public void setTime() {
		while(true)
		{
		time = timeFormat.format(calender.getInstance().getTime());
		timeLabel.setText(time);
		
		date = dateFormat.format(calender.getInstance().getTime());
		dateLabel.setText(date);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
