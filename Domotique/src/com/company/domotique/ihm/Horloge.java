package com.company.domotique.ihm;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone; // TimeZone, SimpleTimeZone, Calendar, GregorianCalendar

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Horloge extends JPanel implements Runnable {
	public JLabel	labCpt = new JLabel("Il est :   ");
	private Thread myThread;

	public Horloge() {
		add(labCpt);
		myThread = new Thread(this);
		myThread.start();
	}

	public void run() {

		while (true) {
			// suspendre le thread pendant 1 seconde
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Date date = new Date();
			DateFormat dateformat = new SimpleDateFormat("HH:mm:ss");
			String time = dateformat.format(date);
			
			labCpt.setText(" Il est : "+time);
			
		} // while
	}

} // class Horloge