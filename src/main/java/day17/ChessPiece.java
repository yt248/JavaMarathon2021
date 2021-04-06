package day17;

/*
Всего существует 6 различных шахматных фигур: король (англ. king), ферзь (англ. queen), ладья (англ. rook), слон (англ. bishop),
конь (англ. knight) и пешка (англ. pawn).

В нашем перечислении необходимо создать 12 фигур - 6 белых и 6 черных. Названия фигур в перечислении должны иметь следующий вид:
KING_WHITE, KING_BLACK, QUEEN_WHITE, QUEEN_BLACK, и так далее

У каждой фигуры должны быть заданы две характеристики - ее ценность и строковое обозначение.

 */
public enum ChessPiece {
    KING_WHITE("Король (белый)", 100),
    QUEEN_WHITE("Ферзь (белый)", 9),
    ROOK_WHITE("Ладья (белая)", 5),
    BISHOP_WHITE("Слон (белый)", 3.5),
    KNIGHT_WHITE("Конь (белый)", 3),
    PAWN_WHITE("Пешка (белая)", 1),

    KING_BLACK("Король (черный)", 100),
    QUEEN_BLACK("Ферзь (черный)", 9),
    ROOK_BLACK("Ладья (черная)", 5),
    BISHOP_BLACK("Слон (черный)", 3.5),
    KNIGHT_BLACK("Конь (черный)", 3),
    PAWN_BLACK("Пешка (черная)", 1),

    EMPTY("", -1);

    private String nameFigure;
    private double priceFigure;

    ChessPiece(String nameFigure, double priceFigure) {
        this.priceFigure = priceFigure;
        this.nameFigure = nameFigure;
    }

    public String getNameFigure() {
        return nameFigure;
    }
}
