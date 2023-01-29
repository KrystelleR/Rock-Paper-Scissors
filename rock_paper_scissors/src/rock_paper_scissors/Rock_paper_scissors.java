package rock_paper_scissors;

import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissors {
    
public static int player_choose = 0;

    public static void main(String[] args) {
        //scanner to get input
        Scanner scan = new Scanner (System.in);
        //menu
        System.out.println("Welcome to Rock, Paper, Scissors.");
        //let user play again while playAgain is equal to 1
        String playAgain = "1";  
        while(playAgain.equals("1")){
            //choices
            String [] elements = {"Rock", "Paper", "Scissors"};
            
            while(true){
                try{
                //user choice
                System.out.println("(1) Rock \n(2) Paper \n(3) Scissors \nEnter 1, 2 or 3");
                player_choose = scan.nextInt();
                System.out.println("\nYou have chosen " + elements[player_choose-1]+"!");
                break;
                }
                catch(Exception e){
                    System.out.println("Invalid option. Try again.");                  
                }
            }
            
            //randomly drawing ops choice
            Random rand = new Random();
            int comp = rand.nextInt(3) ;
            String comp_choose;
            comp_choose = elements[comp];
            
            System.out.println("I have chosen " + comp_choose + "!");
            
            //different dialogue messages
            String winMessage = "Haha! I win!";
            String loseMessage = "Oh man, you got me! Well done!";
            String drawMessage = "A draw! I have finally met my match!";
            
            //deciding which scenario (draw, win, lose)
            player_choose --;
            for(int i =0; i<3; i++){
                if(comp==i){
                    //draw
                    if(player_choose ==i){
                    System.out.println(drawMessage);
                    }
                    //all win scenarios
                    else if((comp==0 && player_choose ==2)||(comp==1 && player_choose ==0)||(comp==2 && player_choose ==1)){
                        System.out.println(winMessage);
                    }
                    //else lose
                    else{
                        System.out.println(loseMessage);
                    }
                }
            } 
            
            //play again option
            System.out.println("Would you like to play again? Enter 1 to play again or any other key to exit.");
            playAgain = scan.next();
        }
        //exit dialogue
        System.out.println("Thanks for playing. Goodbye.");    
    }
}
