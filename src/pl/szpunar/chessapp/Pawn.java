package pl.szpunar.chessapp;

public class Pawn extends Figure {

    public Pawn(FigureColor color) {
        super(color);
    }

    @Override
    public String toString() {
        return colorSymbol() + "P";
    }

    private String colorSymbol() {
        return (getColor() == FigureColor.WHITE) ? "w" : "b";
    }
}
