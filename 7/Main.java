import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50);
        Player[] teamA = {
                new Player("Alice", 10, 20),
                new Player("Bob", 15, 25)
        };
        Player[] teamB = {
                new Player("Charlie", 80, 20),
                new Player("Diana", 85, 25)
        };
        final int FIELD_WIDTH = 100;
        final int FIELD_HEIGHT = 50;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Player player;
            if (i % 2 == 0) {
                player = teamA[random.nextInt(teamA.length)];
            } else {
                player = teamB[random.nextInt(teamB.length)];
            }
            float xDest = random.nextInt(FIELD_WIDTH);
            float yDest = random.nextInt(FIELD_HEIGHT);
            player.kick(ball, xDest, yDest);
            System.out.println(ball);
        }
    }
}
