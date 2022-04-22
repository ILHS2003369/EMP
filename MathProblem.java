import java.util.*;

//Iham Goyal
//McTavish Period 1
//Prog 5.1
//This class creates 1 basic math problem. It generates a random number which decides an operation. This operation then decideds the set of numbers which will be used to make the problem. If it's a multiplication and a division problem then it will pick 2 numbers between 0-10. If it's an addition or subtraction problem, then the numbers picked will be between 0-9. 

/* 
Fields to keep track of anything else needed in order for the methods described below to work properly.
The following public methods, with exact names and behaviors as described:


*/

class MathProblem {
  private Random rand; 
  //creates a random variable
  private boolean solved;
  //creates a boolen for whether the problem has been solved yet. 
  private int correctAnswer;
  //The variable that stores the correct answer
  public MathProblem(Random rand) {
    //This method creates a random operation, then used that operation to create 2 random numbers. It then calls a formatting method to print and format the problem. 
    this.rand = rand;
  }
  public String getQuestion() {
    return "test";
    //getQuestion() - no parameters, returns String with the MathProblem’s question (e.g. “5 * 9 = ? “)

  }
  public void giveAnswer(int correctAnswer) {
  // Checks its single integer parameter against the MathProblem’s correct answer, and appropriately updates the      
  // MathProblem’s state (boolean field) to “solved” or “not solved”.
  // Throws an IllegalStateException if called after the problem has already been solved.
  // if(answeredCorrectly() == true) {
  //   throw new IllegalStateException("The Math problem has already been solved"); 
      }
  }
  
  public boolean answeredCorrectly() {
      // - no parameters, returns true if problem has been solved, false otherwise
    return true;
  }

  public String getFeedback() {
      // no parameters, returns String with appropriate feedback based on whether the MathProblem has been solved or 
    // not.
    // Feedback must always start with the exact string 
    // "Correct!" or "Incorrect."
    return null;
    }
} 