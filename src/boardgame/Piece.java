package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		position = null;
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int g = 0; g < mat.length; g++) {
			for (int u = 0; u < mat.length; u++) {
				if (mat[g][u] == true) {
					return true;
				}
			}
		}
		return false;

	}
}
