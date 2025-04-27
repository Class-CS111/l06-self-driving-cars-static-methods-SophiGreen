// When you are ready to have your work checked, change the value below from N to Y
// ReadyForSubmission=Y
// YOUR NAME:Sophia Platas
// COLLABORATORS: N/A
// DATE:  4/9/25

public class Main
{
	public static void main(String[] args) //method header
	{ //method body
		System.out.println("My thoughts on the article are:");
		// Part 2: Invoking/calling method
		Main.printGuidingAnswers();

		String answers = Main.getGuidingAnswers();
		System.out.println(answers);

		
	}
	
	// Part 1: Creating method definition
			//return type (void) //method identifier (printGuidingAnswers)
	public static void printGuidingAnswers()
	{ //method body
		System.out.println ("My answer to Question 1: Cars should prioritize pedestrians due to them not having the protection of a car to shield them and therefore a greater chance of dying if a collision ever occurs.");
		System.out.println ("My answer to Question 2: ars should first consider age, species, # of people, and -if all factors are equal (two options possessing same demographics and number(s))- the total mass of a person(s) (lets say for example the car can hit either a 185 pound man whos 25 or a 103 pound woman whos 25, it should hit the man because he has less of a chance of dying due being a bigger and most likely stronger person).");
		System.out.println ("My answer to Question 3: The algorithms should be decided by the masses.");
	}

	public static String getGuidingAnswers() {
		return "Thoughts on Questions 1-3";
	}
}