import java.util.Scanner;
class RockPaperScissors{
    public static void main(){
        Scanner scan=new Scanner(System.in);
        int playerthrow, cputhrow;
        int win=0, loss=0, draw=0;
        String playerstr=" ", cpustr=" ";
        boolean again=true;
        while(again){
            System.out.println("******************************************************");
            System.out.print("What do you throw? [1] Rock, [2] Paper, [3] Scissors? ");
            playerthrow=scan.nextInt();
            cputhrow=(int) (Math.random()*3+1);
            if(playerthrow==1) playerstr="rock";
            if(playerthrow==2) playerstr="paper";
            if(playerthrow==3) playerstr="scissors";
            if(cputhrow==1) cpustr="rock";
            if(cputhrow==2) cpustr="paper";
            if(cputhrow==3) cpustr="scissors";
            if(playerthrow==1 || playerthrow==2 || playerthrow==3){
                System.out.println("You threw "+playerstr+"! I threw "+cpustr+"!");
                if(playerthrow==1 && cputhrow==1 || playerthrow==2 && cputhrow==2 || playerthrow==3 && cputhrow==3) {System.out.println("It's a draw... Rematch?"); draw++;}
                if(playerthrow==1 && cputhrow==2) {System.out.println("I win! You lose! Rematch?"); loss++;}
                if(playerthrow==1 && cputhrow==3) {System.out.println("You win this time... Rematch?"); win++;}
                if(playerthrow==2 && cputhrow==1) {System.out.println("You win this time... Rematch?"); win++;}
                if(playerthrow==2 && cputhrow==3) {System.out.println("I win! You lose! Rematch?"); loss++;}
                if(playerthrow==3 && cputhrow==1) {System.out.println("I win! You lose! Rematch?"); loss++;}
                if(playerthrow==3 && cputhrow==2) {System.out.println("You win this time... Rematch?"); win++;}
            }
            else System.out.println("That's not a valid move... Try again?");
            System.out.println("");
            System.out.print("Again? [y,n] ");
            String again1;
            again1=scan.next();
            if(again1.contains("y")) again=true;
            else {
                again=false;
                System.out.println("Goodbye");
                System.out.println("Wins: "+win);
                System.out.println("Losses: "+loss);
                System.out.println("Draws: "+draw);
            }
        }
    }
}