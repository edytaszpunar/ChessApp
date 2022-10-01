package pl.szpunar.chessapp;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<BoardRow> rows = new ArrayList<>();

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
        String s = "|--|--|--|--|--|--|--|--|\n";
        for (int row = 0; row < 8; row++){
            s += rows.get(row).toString() + "\n";
        }
            s += "|--|--|--|--|--|--|--|--|\n";
        return s;
    }
}
