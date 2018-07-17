package project_bobo;

//Importation classe

public class Trier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public void Trier() {
		//Classe qui sert a trier les Lego par couleur 
		
		// 1 : Détection des couleurs
		
		      motorRight = new EV3LargeRegulatedMotor(MotorPort.A);
              motorLeft = new EV3LargeRegulatedMotor(MotorPort.B);
            
              //Sets default motor speed for driving motors
              motorRight.setSpeed(DEFAULT_MOTOR_SPEED);
              motorLeft.setSpeed(DEFAULT_MOTOR_SPEED);
            
              motorCannon = instantiateMotorCannon(skipMotorCannonCalibration);
              irSensor = new EV3IRSensor(SensorPort.S1);
              colorSensor = new EV3ColorSensor(SensorPort.S4);
            
              rangeSampler = irSensor.getDistanceMode();
              lastRange = new float[rangeSampler.sampleSize()];
            
              colors = getColors();
		
			//Afficher les couleurs sur l'écran lcd
		
		// 2 : Prendre des objects dans la main du robot
			
			//Poser les objects 
		
		// 3 : Faire avancer le robot
			
			//Faire revenir au point de depart 
		
		// 4 : Faire l'étape 2 et 3 en même temps
		
		// 5 : Faire la parti 4 et 1 (ex : prendre le lego rouge et le deposer quelque part)
		
			//Faire des "tas" de couleurs grâce au robot 
		
	}
}