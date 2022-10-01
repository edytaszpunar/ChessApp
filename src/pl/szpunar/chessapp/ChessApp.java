package pl.szpunar.chessapp;

public class ChessApp {

    public static void main(String[] args) {

        Board board = new Board();
        board.initBoard();
        System.out.println(board);

        while (true) {
            Move move = UserDialogs.getMove();
            System.out.println(board.move(move.getCol1(), move.getRow1(), move.getCol2(), move.getRow2()));
            System.out.println(board);
        }
    }
}
