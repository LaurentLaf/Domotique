package com.company.domotique.appareils;
public class AppareilElectrique extends Appareil {

	protected int iPuissance=0;
	protected boolean isEnMarche=false;
	
	protected int puissanceMaxWatts = 0;
	protected boolean isSousTension = false;
	protected boolean isBranche = false;
	
	//Constructeur
	public AppareilElectrique(String pMarque,String pModele, int pPuissance){
		super(pMarque, pModele);
		iPuissance=pPuissance;
		isEnMarche=false;
	}

	public void setPuissance(int pPuissance) {
		iPuissance = pPuissance;
	} // set
	public int getPuissance() {
		return iPuissance;
	} // get
	public void setIsEnMarche(boolean pOnOff) {
			isEnMarche = pOnOff ;
	} // set
	public boolean getIsEnMarche() {
			return isEnMarche;
	} // get

	/**
		 met l'appareil en marche
	*/
    public void demarrer() {
	   isEnMarche=true;
    }//demarrer

   /**
    arrete l'appareil
   */
   public void arreter() {
   	      isEnMarche=false;
   }//arreter


	public int  getConsommation(){
		  if (isEnMarche)
		  		return iPuissance;
		  else
		  		return 0;
	}//getConsommation

	@Override
	public String toString() {
		return super.toString() + "AppareilElectrique [iPuissance=" + iPuissance + ", isEnMarche=" + isEnMarche + ", puissanceMaxWatts="
				+ puissanceMaxWatts + ", isSousTension=" + isSousTension + ", isBranche=" + isBranche + "]";
	}

	
	
}
