import java.util.Scanner;

class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("************************************************************");
        System.out.println("Good luck, human...");
        System.out.println("");
        
        String replay;
        int ties = 0;
        int wins = 0;
        int losses = 0;
        replay = "y";
        
        while(replay.equals("y")) {
            System.out.println("What do you throw? [1] Rock, [2] Paper, [3] Scissors");
            double computer = Math.random();
            int choice = sc.nextInt();
            if(choice == 1 && computer < 0.33) {
                System.out.println("You threw rock! I thew rock!");
                ties++;
                System.out.println("A draw ... pretty good, human! I demand a rematch ...");
            } else if(choice == 2 && computer >= 0.33 && computer < 0.66) {
                System.out.println("You threw paper! I thew paper!");
                ties++;
                System.out.println("A draw ... pretty good, human! I demand a rematch ...");
            } else if(choice == 3 && computer >= 0.66 && computer < 1.00) {
                System.out.println("You threw scissors! I thew scissors!");
                ties++;
                System.out.println("A draw ... pretty good, human! I demand a rematch ...");
            } else if(choice == 1 && computer >= 0.33 && computer < 0.66) {
                System.out.println("You threw rock! I thew paper!");
                losses++;
                System.out.println("I win! You are not a challenge for me ...");
            } else if(choice == 1 && computer >= 0.66 && computer < 1.00) {
                System.out.println("You threw rock! I thew scissors!");
                wins++;
                System.out.println("Whaaa?? ... You beat me? RAGE!");
            } else if(choice == 2 && computer < 0.33) {
                System.out.println("You threw paper! I thew rock!");
                wins++;
                System.out.println("Whaaa?? ... You beat me? RAGE!");
            } else if(choice == 2 && computer >= 0.66 && computer < 1.00) {
                System.out.println("You threw paper! I thew scissors!");
                losses++;
                System.out.println("I win! You are not a challenge for me ...");
            } else if(choice == 3 && computer < 0.33) {
                System.out.println("You threw scissors! I thew rock!");
                losses++;
                System.out.println("I win! You are not a challenge for me ...");
            } else if(choice == 3 && computer >= 0.33 && computer < 0.66) {
                System.out.println("You threw scissors! I thew paper!");
                wins++;
                System.out.println("Whaaa?? ... You beat me? RAGE!");
            }
            
            System.out.println("Play again? [y,n] ");
            replay = sc.next();
        }
        
        System.out.println("");
        System.out.println("Good Game! Thanks for playing.");
        System.out.println("************************************************************");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Ties: " + ties);
    }
}
