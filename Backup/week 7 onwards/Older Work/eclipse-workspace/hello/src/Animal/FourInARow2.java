package Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FourInARow2 {
	String[][] board = new String[7][6];
	
	

	boolean player = true;

	// public String[][] setBoard () {
	//
	//
	// return board;
	//
	// }

	public int getColumn(String userInput) {

		Map<String, Integer> convertor = new HashMap<>();
		convertor.put("a", 0);
		convertor.put("b", 1);
		convertor.put("c", 2);
		convertor.put("d", 3);
		convertor.put("e", 4);
		convertor.put("f", 5);
		convertor.put("g", 6);

		return convertor.get(userInput);

	}

	public void setPoint(int col, String[][] board) {

		for (int i = 0; i < board[col].length; i++) {

			if (board[col][i] != null && player == false) {
				board[col][i] = "red";
				playerSwitch();
				break;
			} else if (board[col][i] != null && player == true) {
				board[col][i] = "blue";
				playerSwitch();
				break;
			}
		}

	}
	
	public void playerSwitch() {
		if(player){
			player = false;
		} else if (!player) {
			player = true;
		}
	}
	
	public void printBoard() {
		
		//Print board by looping through I and J 
//		for(int i = 0; i <  )
		
	}
	
	public void checkWin(String[][] board) {
		
		
		
	}
}
