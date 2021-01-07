package section4expressionsstatementscodeblocksmethods;

public class ExpressionsStatementsCodeBlocks {
    public static void main(String[] args) {

        //a mile is equal to 1.609344
        double kilometres = (100*1.609344);
        //the expression of above line is: kilometres = (100*1.609344)
        //includes variable, values, operators (not data type or semi colon)
        int highscore = 50;
        if(highscore ==50){
            System.out.println("This is an expression");
        }

        //the expression is: highscore ==50
        //Another expression is whats inside the brackets of sout: "This is an expression"
        //Also when you call on a method - anything inside the brackets is called expression



        //Statements, whitespace and indenting

        int myVariable = 50;
        //The complete line above is called a statement

        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is " +
                " another" +
                " still more.");

        int anotherVariable = 50; myVariable--;System.out.println("This is another one");

        //All examples above are expressions
        //Whitespace is all spaces, you can add as many spaces as you want, IntelliJ will read it anyway
        //Indentation (tab) will make your code easier to read

        //Code block
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        //Code block is defined with{}
        if(score < 5000 && score >1000){
            System.out.println("Your score was less than 5000 but greater than 1000");
        }else if (score <1000){
            System.out.println("Your score was less than 1000");
        }
        else {
            System.out.println("Got here");
        }

        //If you only have one line in your if statement - you don´t have to have the curly brackets

        if(gameOver == true){
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //You can also just write if(gameOver){}

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }




    }
}
