package cli;

import logic.LogicalAgent;
import model.Board;
import model.Cell;
import model.GameState;

import static model.pieces.PieceType.contains;

public class CommandLineAgent {
    private LogicalAgent logicalAgent;


    public CommandLineAgent(LogicalAgent logicalAgent) {
        this.logicalAgent = logicalAgent;
    }

    public void printBoard() {
        Board board = Board.getInstance();
        Cell[][] cells = board.getCells();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (cells[i][i].getPiece() == null) {
                    System.out.print('-');
                } else {
                    System.out.print(cells[i][j].getPiece().getType());
                }
            }
        }
    }

    public boolean isValidInput(String input) {
        String[] result = input.split(" ");
        if (result.length!=3) {
            return false;
        }
        String type = result[0];
        if (!contains(type)) {
            return false;
        }
        int initialColumn = Integer.parseInt(result[1].substring(0, 1));
        int initialRow = Integer.parseInt(result[1].substring(1,2));
        if (initialColumn < 0 || initialColumn > 5 || initialRow < 0 || initialRow > 5) {
            return false;
        }
        if ((initialColumn == 0 && initialRow != 0) || (initialRow == 0 && initialColumn != 0)) {
            return false;
        }
        int destinationColumn = Integer.parseInt(result[2].substring(0, 1));
        int destinationRow = Integer.parseInt(result[2].substring(1,2));
        if (destinationColumn <= 0 || destinationColumn > 5 || destinationRow <= 0 || destinationRow > 5) {
            return false;
        }
        return true;
    }

    public void execution() {
        while (!GameState.getInstance().isEndGame()) {
            printBoard();

            String input = MyScanner.getScanner().scan();
            if (isValidInput(input)) {
                String[] result = input.split(" ");
                String type = result[0];
                int initialColumn = Integer.parseInt(result[1].substring(0, 1));
                int initialRow = Integer.parseInt(result[1].substring(1,2));
                int destinationColumn = Integer.parseInt(result[2].substring(0, 1));
                int destinationRow = Integer.parseInt(result[2].substring(1,2));
                this.logicalAgent.apply(type, initialRow, initialColumn, destinationRow, destinationColumn);
            }
        }

        System.out.println("black win!");
    }
}
