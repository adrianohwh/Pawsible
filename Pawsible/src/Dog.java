public class Dog {
	public enum Allergy{
		Grass,
		Chicken,
		Beef,
		Pollen,
		Pork;
		
	}
	public String specialAllergies;
	public String dogID;
	public String dogName;
	public int dogAge;
	public Allergy[] dogAllergies;
	
	public void AddAllergy(Allergy newAllergy) {
		int count = dogAllergies.length;
		dogAllergies[count] = newAllergy;
	}	
	
	
}
