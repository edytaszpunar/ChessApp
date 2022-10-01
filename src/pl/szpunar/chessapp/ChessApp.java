package pl.szpunar.chessapp;

public class ChessApp {

    public static void main(String[] args) {

        Board board= new Board();
        board.setFigure(1,1, new Pawn(FigureColor.BLACK));
        board.setFigure(2,2, new Pawn(FigureColor.BLACK));
        board.setFigure(5,5, new Queen(FigureColor.WHITE));
        System.out.println(board);
    }
}
