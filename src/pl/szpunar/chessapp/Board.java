package pl.szpunar.chessapp;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<BoardRow> rows = new ArrayList<>();
    private FigureColor whoseMove = FigureColor.WHITE;

    public Board() {
        for (int row = 0; row < 8; row++) {
            rows.add(new BoardRow());

        }
    }

    public Figure getFigure(int col, int row) {
        return rows.get(row).getCols().get(col);

    }

    public void setFigure(int col, int row, Figure figure) {
        rows.get(row).getCols().set(col, figure);
    }

    @Override
    public String toString() {
        String s = "Turn: " + whoseMove + "\n";
        s += "|--|--|--|--|--|--|--|--|\n";
        for (int row = 0; row < 8; row++) {
            s += rows.get(row).toString() + "\n";
        }
        s += "|--|--|--|--|--|--|--|--|\n";
        return s;
    }

    //metoda wykonująca ruch
    public boolean move(int col1, int row1, int col2, int row2) {
        boolean result = true;
        result = result && isProperColorMoving(getFigure(col1, row1).getColor());
        result = result && isMoveProperDirection(row1, row2, getFigure(col1, row1).getColor());

        if (result) {
            Figure figure = getFigure(col1, row1);
            setFigure(col2, row2, figure);
            setFigure(col1, row1, new None());
            whoseMove = oppositeColor(whoseMove);
        }
        return result;
    }

    private boolean isMoveProperDirection(int row1, int row2, FigureColor color) {
        if (color == FigureColor.WHITE){
            return row2 < row1;
        }else {
            return row1 < row2;
        }
    }

    private FigureColor oppositeColor(FigureColor color) {
        return (color == FigureColor.WHITE) ? FigureColor.BLACK : FigureColor.WHITE;
    }

    private boolean isProperColorMoving(FigureColor color) {
        return color == whoseMove;
    }

    public void initBoard() {
        for (int col = 0; col < 8; col += 2) {
            setFigure(col, 0, new Pawn(FigureColor.BLACK));
        }
        for (int col = 1; col < 8; col += 2) {
            setFigure(col, 1, new Pawn(FigureColor.BLACK));
        }
        for (int col = 0; col < 8; col += 2) {
            setFigure(col, 6, new Pawn(FigureColor.WHITE));
        }
        for (int col = 1; col < 8; col += 2) {
            setFigure(col, 7, new Pawn(FigureColor.WHITE));
        }
    }
}
