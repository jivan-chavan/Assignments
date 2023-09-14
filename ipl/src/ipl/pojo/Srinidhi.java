package ipl.pojo;

import java.util.ArrayList;

public class Srinidhi {

	public static void main(String[] args) {
		Operation o = new Operation();
		ArrayList<Player> list = o.m1();
		
		for (Player player : list) {
			if(player.getLoc() == "Ranchi") {
				System.out.println(player);
			}
		}
	}

}
