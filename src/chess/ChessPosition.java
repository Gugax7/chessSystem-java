package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char columns;
	private int rows;
	public ChessPosition(int rows, char columns) {
		if(rows < 1 || rows > 8 || columns < 'a' || columns > 'h') {
			throw new ChessException("Error instantianting ChessPosition. Valid values are from a1 to h8.");
		}
		this.columns = columns;
		this.rows = rows;
	}
	public char getColumns() {
		return columns;
	}
	public int getRows() {
		return rows;
	}
	protected Position toPosition() {
		return new Position(8 - rows, columns - 'a');
	}
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition(position.getRow() - 8, (char)('a' - position.getColumn()));
		
	}
	@Override
	public String toString() {
		return "" + columns + rows;
	}
	

}
