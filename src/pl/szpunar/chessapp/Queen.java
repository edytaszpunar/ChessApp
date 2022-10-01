package pl.szpunar.chessapp;

public class Queen extends Figure {

    public Queen(FigureColor color) {
        super(color);
    }

    @Override
    public String toString() {
        return colorSymbol() + "Q";
    }

    private String colorSymbol() {
        return (getColor() == FigureColor.WHITE) ? "w" : "b";
    }
}
