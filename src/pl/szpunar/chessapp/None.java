package pl.szpunar.chessapp;

public class None extends Figure {

    public None() {
        super(FigureColor.NONE);
    }

    @Override
    public String toString() {
        return "  ";
    }
}
