import java.util.Scanner;

class Guesser
{
    int guessNum;                       //Make a class for the Guesser.
    public int guessNumber()
    {   
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser! Kindly guess the number: ");
        guessNum=scan.nextInt();
        return guessNum;
    }
}

class Player
{
    int pguessNum;                        //Make a class for the Player.
    public int guessNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player! Kindly guess the number: ");
        pguessNum =scan.nextInt();
        return pguessNum;
    }
}

class Umpire
{
    int numFromGusser;           // Make a class for the Umpire.
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    public void collectNumFromGuesser()
    {
        Guesser G = new Guesser();    //Make object G for the Guesser to store value in G variable.
        numFromGusser=G.guessNumber();
    }


    public void collectNumFromPlayer()
    {
        Player p1= new Player();     // Make object p1 for the player1 to store value in p1 variable.
        numFromPlayer1=p1.guessNumber();

        Player p2= new Player();     // Make object p2 for the player2 to store value in p2 variable.
        numFromPlayer2=p2.guessNumber();

        Player p3= new Player();     // Make object p3 for the player3 to store value in p3 variable.
        numFromPlayer3=p3.guessNumber();    
    }

    public void compare()
    {
        if(numFromGusser==numFromPlayer1)
        {
            if (numFromGusser==numFromPlayer2 && numFromGusser==numFromPlayer3)
            {
                System.out.println("All players guess the right answer, All the player won the Game.");
            } 
            else if(numFromGusser==numFromPlayer2)
            {
                System.out.println("Player1 and Player2 guess the right number, Player1 and Player2 won the Game.");   
            }
            else if (numFromGusser==numFromPlayer3) 
            {
                System.out.println("Player1 and Player3 guess the right number, Player1 and Player3 won the Game.");    
            }
            else
            {
                System.out.println(" Player1 guess the right number, Player1 won the Game.");
            }
        }
        else if(numFromGusser==numFromPlayer2)
        {
            if (numFromGusser==numFromPlayer3) 
            {
                System.out.println("Player2 and Player3 won the Game.");    
            }
            else
            {
                System.out.println("Player2 won the Game.");
            }
        }
        else if(numFromGusser==numFromPlayer3)
        {
            System.out.println("Player3 won the Game.");
        }
        else
        {
            System.out.println("All the players lost the game.");
        }
    }
}


class LaunchGame
{
    public static void main(String[] args)
    {
        System.out.println("Game started.");
        Umpire U = new Umpire();       // Make object U for the Umpire.
        U.collectNumFromGuesser();
        U.collectNumFromPlayer();
        U.compare();
    }
}