package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int g = 0; g < board.getRows(); g++) {
			for (int u = 0; u < board.getColumns(); u++) {
				mat[g][u] = (ChessPiece) board.piece(g, u);
			}
		}
		return mat;
	}
	public void initialSetup() {
		board.PlacePiece(new King(board, Color.BLACK), new Position(4, 0));
		board.PlacePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		
	}
}
