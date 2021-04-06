package day17;

public class ChessBoard {
    ChessPiece[][] chessPieces;

    public ChessBoard(ChessPiece[][] chessPiece) {
        this.chessPieces = chessPiece;
    }

    public void print() {
        for (int i = 0; i < chessPieces.length; i++) {
            for (int j = 0; j < chessPieces[i].length; j++) {
                System.out.print(chessPieces[i][j].getNameFigure() + " ");
            }
            System.out.println();
        }
    }
}
