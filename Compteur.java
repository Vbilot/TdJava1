public class Compteur {

	private int compteur = 0;
			
	public void increment() {
		this.compteur++;
	}
	
	public int toString() {
		return this.compteur;
	}

	public static void toString(){
		system.out.println(this.compteur);
	}	
}
