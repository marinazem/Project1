package Lesson7;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Game {

    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static void main(String[] args) {
        String file1 = "Soccer.txt";
        String file2 = "Hockey.txt";
        String file3 = "Rugby.txt";

        Game game = new Game();

        game.createFile(file1);
        game.writeToFile(file1, "Soccer file is here = 11");

        game.createFile(file2);
        game.writeToFile(file2, "Hockey file is here = 6");

        game.createFile(file3);
        game.writeToFile(file3, "Rugby file is here = 15");
        double result = game.writeNumOfPerTeam(11, 6, 15, GameType.SOCCER);
        System.out.println("result: " + result);

    }

    public static double writeNumOfPerTeam(int a, int b, int c, GameType type) {
        double result = 0;

        switch (type) {
            case SOCCER:
                result = a;
                break;
            case HOCKEY:
                result = b;
                break;
            case RUGBY:
                result = c;
                break;

        }
        return result;

    }

    public void createFile(String fileName) {
        File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String fileName, String text) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error !!!! ");
            e.printStackTrace();
        }
    }
}


