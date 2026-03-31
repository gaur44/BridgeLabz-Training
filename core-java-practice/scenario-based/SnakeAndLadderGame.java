import java.util.Random;

public class SnakeAndLadderGame {
    static Random r = new Random();
    
    static class Player {
        String name;
        // UC 1 - Start at 0
        int pos = 0, rolls = 0;
        
        Player(String name) { this.name = name; }
        
        boolean play() {
            // UC 2 - Roll the die
            int dice = r.nextInt(6) + 1, opt = r.nextInt(3), old = pos;
            rolls++;
            System.out.print(name + " rolled " + dice + " | ");

            // UC 3 - Check whether to play or not
            if (opt == 1) { pos += dice; if (pos > 100) pos = old; System.out.println("LADDER: " + old + "->" + pos); return true; }
            if (opt == 2) { pos -= dice; if (pos < 0) pos = 0; System.out.println("SNAKE: " + old + "->" + pos); }
            else System.out.println("NO PLAY");
            return false;
        }
    }
    
    public static void main(String[] args) {
        // Single Player
        Player p = new Player("P1");

        // UC 4 & 5 - Repeat till player reaches 100
        while (p.pos != 100) p.play();

        // UC 6 - Report the number of times the dice was played
        System.out.println(p.name + " WON in " + p.rolls + " rolls!\n");
        
        // UC 7 - Two Players
        Player p1 = new Player("P1"), p2 = new Player("P2"), cur = p1;
        while (p1.pos != 100 && p2.pos != 100) 
            if (!cur.play()) cur = (cur == p1) ? p2 : p1;
        Player w = p1.pos == 100 ? p1 : p2;
        System.out.println(w.name + " WON! Rolls: " + p1.name + "=" + p1.rolls + ", " + p2.name + "=" + p2.rolls);
    }
}