package com.company.domotique.ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import com.company.domotique.appareils.AppareilElectrique;
import com.company.domotique.appareils.AppareilThermostate;


public class PanneauThermostat extends PanneauAppareil implements ActionListener{

	private JLabel lblThermostat;
	private JButton btnAugmenterThermostat;
	private JButton btnDiminuerThermostat;

	private int thermostatCourant;

	public PanneauThermostat(AppareilThermostate pAppThermo, PanneauCompteur pPanoC){
		super(pAppThermo, pPanoC);

		//TODO creer  bouton diminuer
		btnDiminuerThermostat=new JButton("-");
		add(btnDiminuerThermostat);

		//TODO creer label Thermostat
		lblThermostat=new JLabel();
		afficherThermostat();
		add(lblThermostat);

		
		//TODO creer  bouton diminuer
		btnAugmenterThermostat=new JButton("+");
		add(btnAugmenterThermostat);
	}

	public void actionPerformed(ActionEvent evt){
	// On laisse traiter les actions demarrer et arreter au parent
	    super.actionPerformed(evt);

		AppareilThermostate cetAppareil=(AppareilThermostate)appareil;

		
		Object src = evt.getSource();
		if (src == btnDemarrer) {
			//TODO : démarrer l'appareil electrique
			cetAppareil.demarrer();
			
			lePanoCompteur.majConso();
			
			btnDemarrer.setEnabled(false);
			btnArreter.setEnabled(true);

			btnAugmenterThermostat.setEnabled(true);
			btnDiminuerThermostat.setEnabled(true);
			
		}
		else if (src == btnArreter) {
			// TODO
			appareil.arreter();
			lePanoCompteur.majConso();
			btnAugmenterThermostat.setEnabled(false);
			btnDiminuerThermostat.setEnabled(false);
			
		}
		else if(src == btnAugmenterThermostat){
			// TODO
			if (cetAppareil.getValeurThermostatMax() > cetAppareil.getValeurThermostat()) {
				cetAppareil.incrementerThermostat();
				System.out.println("appui + thermo OK");
				//((AppareilThermostate)appareil).incrementerThermostat();
				afficherThermostat();
				lePanoCompteur.majConso();
			}
		}
		else if (src == btnDiminuerThermostat){
			//TODO
			if (cetAppareil.getValeurThermostat() > 0) {
				cetAppareil.decrementerThermostat();
				afficherThermostat();
				lePanoCompteur.majConso();
			}
		}//btnDiminuerThermostat
	}//actionPerformed(ActionEvent evt)

	
	
	
	private void afficherThermostat(){
		AppareilThermostate  cetAppareil=(AppareilThermostate)appareil;
		String s=new Integer(cetAppareil.getValeurThermostat()).toString();
		if (s.length()<2)s="0"+s;
		lblThermostat.setText(s);
		
		//TOTO setter s comme label IHM
		//lblThermostat.set....;
	}
	
	//En cas de disjonctage, permet d initialiser les elements du pano
	public void initPano() {
		super.initPano();
		btnAugmenterThermostat.setEnabled(false);
		btnDiminuerThermostat.setEnabled(false);
		lblThermostat.setText("0");	
	}
}//PanneauAppareil