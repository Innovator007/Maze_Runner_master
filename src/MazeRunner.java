import java.util.*;     //for taking input from user to move ahead in the game
import java.io.*;

public class MazeRunner {       //start of Mazerunner class
    public static void main(String[] args) {
        Maze myMap = new Maze();     //defining maze
        intro();                     //calling the intro method
        userMove();                  //clling the usermove method that will run till the user loses or wins the game
    }

    public static void intro() {    //start of intro method
        Maze myMap = new Maze();
        System.out.println("Welcome to Maze Runner!");   //greeting and welcoming to the game
        System.out.println("Here x indicates your current location:");    //showing user their current position
        myMap.printMap();      //printing the maze
    }

    public static String userMove() {    //start of usermove method
        Maze myMap = new Maze();
        Scanner input = new Scanner(System.in);
        int count = 0;     //for counting the number of moves
        while (!myMap.didIWin()) {    //while loop will run till the user wins
            System.out.println("Where you would like to move?(R,L,U,D)");   //asking the user their desired direction
            String userSelection = input.next();   //taking input from the user for his direction
            if (userSelection.equalsIgnoreCase("R") && myMap.canIMoveRight()) {  //checkes if user wants to move right and he can move right
                System.out.println("Ok!");
                System.out.println("Moving Right..");
                myMap.moveRight();      //moving right in maze
                myMap.printMap();       //printing the updated maze
                if (myMap.isThereAPit("R")) {      //checking is there a pit ahead in right direction
                    System.out.println("Watch out! There is a pit ahead,jump it?If yes then enter y");
                    String yorn = input.next();    //taking input from the user to jump the pit or not
                    if (yorn.equalsIgnoreCase("Y")) {   //if user says yes
                        myMap.jumpOverPit("R");   //direction to jump
                        myMap.printMap();     //print the updated maze
                    } else {         //other case than yes
                        System.out.println("Oh you fell in the pit!"); //tell the user they fell in the pit
                        System.out.println("Game Over!");    //tell the user the game is over
                        System.exit(0);      //exit the code
                    }
                }
            } else if (userSelection.equalsIgnoreCase("L") && myMap.canIMoveLeft()) {
                System.out.println("Ok!");
                System.out.println("Moving Left..");
                myMap.moveLeft();
                myMap.printMap();
                if (myMap.isThereAPit("L")) {
                    System.out.println("Watch out! There is a pit ahead,jump it?If yes then enter y");
                    String yorn = input.next();
                    if (yorn.equalsIgnoreCase("Y")) {
                        myMap.jumpOverPit("L");
                        myMap.printMap();
                    } else {
                        System.out.println("Oh you fell in the pit!");
                        System.out.println("Game Over!");
                        System.exit(0);
                    }
                }


            } else if (userSelection.equalsIgnoreCase("U") && myMap.canIMoveUp()) {
                System.out.println("Ok!");
                System.out.println("Moving Up..");
                myMap.moveUp();
                myMap.printMap();
                if (myMap.isThereAPit("U")) {
                    System.out.println("Watch out! There is a pit ahead,jump it?If yes then enter y");
                    String yorn = input.next();
                    if (yorn.equalsIgnoreCase("Y")) {
                        myMap.jumpOverPit("U");
                        myMap.printMap();
                    } else {
                        System.out.println("Oh you fell in the pit!");
                        System.out.println("Game Over!");
                        System.exit(0);
                    }
                }
            } else if (userSelection.equalsIgnoreCase("D") && myMap.canIMoveDown()) {
                System.out.println("Ok!");
                System.out.println("Moving Down..");
                myMap.moveDown();
                myMap.printMap();
                if (myMap.isThereAPit("D")) {
                    System.out.println("Watch out! There is a pit ahead,jump it?If yes then enter y");
                    String yorn = input.next();
                    if (yorn.equalsIgnoreCase("Y")) {
                        myMap.jumpOverPit("D");
                        myMap.printMap();
                    } else {
                        System.out.println("Oh you fell in the pit!");
                        System.out.println("Game Over!");
                        System.exit(0);
                    }
                }

            } else {
                System.out.println("Sorry,you have hit a wall!");
            }
            while (!(userSelection.equalsIgnoreCase("R") || userSelection.equalsIgnoreCase("L") || userSelection.equalsIgnoreCase("U") || userSelection.equalsIgnoreCase("D"))) {
                System.out.println("Invalid Input!");
                System.out.println("Please enter a valid direction letter!");
                userSelection = input.next();
                if (userSelection.equalsIgnoreCase("R") && myMap.canIMoveRight()) {
                    System.out.println("Ok!");
                    System.out.println("Moving Right..");
                    myMap.moveRight();
                    myMap.printMap();
                    if (myMap.isThereAPit("R")) {
                        System.out.println("Watch out! There is a pit ahead,jump it?If yes then enter y");
                        String yorn = input.next();
                        if (yorn.equalsIgnoreCase("Y")) {
                            myMap.jumpOverPit("R");
                            myMap.printMap();
                        } else {
                            System.out.println("Oh you fell in the pit!");
                            System.out.println("Game Over!");
                            System.exit(0);
                        }
                    }
                } else if (userSelection.equalsIgnoreCase("L") && myMap.canIMoveLeft()) {
                    System.out.println("Ok!");
                    System.out.println("Moving Left..");
                    myMap.moveLeft();
                    myMap.printMap();
                    if (myMap.isThereAPit("L")) {
                        System.out.println("Watch out! There is a pit ahead,jump it?If yes then enter y");
                        String yorn = input.next();
                        if (yorn.equalsIgnoreCase("Y")) {
                            myMap.jumpOverPit("L");
                            myMap.printMap();
                        } else {
                            System.out.println("Oh you fell in the pit!");
                            System.out.println("Game Over!");
                            System.exit(0);
                        }
                    }
                } else if (userSelection.equalsIgnoreCase("U") && myMap.canIMoveUp()) {
                    System.out.println("Ok!");
                    System.out.println("Moving Up..");
                    myMap.moveUp();
                    myMap.printMap();
                    if (myMap.isThereAPit("U")) {
                        System.out.println("Watch out! There is a pit ahead,jump it?If yes then enter y");
                        String yorn = input.next();
                        if (yorn.equalsIgnoreCase("Y")) {
                            myMap.jumpOverPit("U");
                            myMap.printMap();
                        } else {
                            System.out.println("Oh you fell in the pit!");
                            System.out.println("Game Over!");
                            System.exit(0);
                        }
                    }
                } else if (userSelection.equalsIgnoreCase("D") && myMap.canIMoveDown()) {
                    System.out.println("Ok!");
                    System.out.println("Moving Down..");
                    myMap.moveDown();
                    myMap.printMap();
                    if (myMap.isThereAPit("D")) {
                        System.out.println("Watch out! There is a pit ahead,jump it?If yes then enter y");
                        String yorn = input.next();
                        if (yorn.equalsIgnoreCase("Y")) {
                            myMap.jumpOverPit("D");
                            myMap.printMap();
                        } else {
                            System.out.println("Oh you fell in the pit!");
                            System.out.println("Game Over!");
                            System.exit(0);
                        }
                    }
                } else {
                    System.out.println("Sorry,you have hit a wall!");
                }
                //input.close();
            }
            count++;
            if (count == 25) {
                System.out.println("You have done 25 moves!");
            }
            if (count == 50) {
                System.out.println("Careful, You have done 50 moves!");
            }
            if (count == 90) {
                System.out.println("Oh you have done 90 moves!");
            }
            if (count > 100) {
                System.out.println("You have done more than 100 moves and you didn't make out on time!");
                System.out.println("Sorry!,you Lose!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations!");
        System.out.println("You Won!");
        System.out.println("Your moves in completing the maze: " + count);
        System.exit(0);

        //input.close();
        return userMove();
    }
}
