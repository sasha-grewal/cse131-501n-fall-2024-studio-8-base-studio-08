package studio8;

public class MultipleChoiceQuestion extends Question {
	
	private String[] choices;
	
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		//FIXME
		
		//Call the super class constructor, then create and set
		//instance variables for any values that aren't handled
		//by the base class
		super(prompt, answer, points);
		this.choices = choices;
	}
	
	public void displayPrompt() {
		super.displayPrompt();
		
		for (int i = 0; i < choices.length; i++) {
			System.out.println("Choice " + (i + 1) + " " + choices[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		multipleChoice.displayPrompt();
		System.out.println(multipleChoice.checkAnswer("hi"));//wrong
		System.out.println(multipleChoice.checkAnswer("1"));//wrong
		System.out.println(multipleChoice.checkAnswer("3"));//right
	}

}
