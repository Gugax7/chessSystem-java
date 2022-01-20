package main;

import chess.ChessPiece;

public class UI {
	
	public static void printBoard(ChessPiece[][] chessPiece) {
		
		for(int g = 0; g < chessPiece.length; g++) {
			System.out.print((8 - g ) + " ");
			for(int u = 0; u < chessPiece.length; u++ ) {
				printPiece(chessPiece[g][u]);
			}
			System.out.println();
			
		}
		System.out.print("  a b c d e f g h");
	}
	public static void printPiece(ChessPiece piece) {
		if(piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}

}
