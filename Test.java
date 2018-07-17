package project_bobo;

//Importation classe
import lejos.hardware.BrickFinder;
import lejos.hardware.Keys;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.TextLCD;


public class Test {

	public static void main(String[] args) {
		//Classe pour voir si bobo est connecté
		
		EV3 ev3 = (EV3) BrickFinder.getLocal();
		TextLCD lcd = ev3.getTextLCD();
		Keys keys = ev3.getKeys();
		
		lcd.drawString("Coucou ca fonctionne", 4, 3);
		
		//Pour que le programme s'arrête quand on click sur un bouton
		keys.waitForAnyPress();
	}
}