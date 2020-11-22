package Aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Xadrez {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.ReadChessPosition(sc);

				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.ReadChessPosition(sc);

				ChessPiece capturePiece = chessMatch.peformChessMove(source, target);
			}

			catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}

			catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}

	}

}
