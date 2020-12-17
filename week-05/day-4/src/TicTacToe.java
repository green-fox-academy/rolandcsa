import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {
    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }

    public static String[][] fileToBoard(String filename) {
        List<String> boardList = new ArrayList<>();
        Path filePath = Paths.get("src/" + filename);
        String[][] board = new String[3][3];
        try {
            boardList = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("Could not read file");
            System.exit(1);
        }
        for (int i = 0; i < board.length; i++) {
            board[i] = boardList.get(i).split("");
        }
        return board;
    }

    public static String ticTacResult(String filename) {
        String[][] board = fileToBoard(filename);
        String result = "draw";
        for (int i = 0; i < board.length; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                result = board[i][0];
            } else if ((board[0][i].equals(board[1][i]) && (board[1][i].equals(board[2][i])))) {
                result = board[0][i];
            }
        }
        if ((board[0][0].equals(board[1][1]) && (board[1][1].equals(board[2][2])))) {
            result = board[0][0];
        } else if ((board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]))) {
            result = board[0][2];
        }
        return result;
    }
}
