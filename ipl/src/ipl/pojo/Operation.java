package ipl.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Operation {

	ArrayList<Player> m1() {

		Player p1 = new Player("Dhoni", 34, "Ranchi");
		Player p2 = new Player("Jadeja", 26, "Jamnagar");
		Player p3 = new Player("Virat", 34, "Delhi");
		Player p4 = new Player("Bumrah", 37, "Panjab");
		Player p5 = new Player("Shubman", 21, "Panjab");
		Player p6 = new Player("pant", 35, "delhi");
		Player p7 = new Player("rohit", 34, "Mumbai");
		Player p8 = new Player("surya", 22, "Mumbai");
		Player p9 = new Player("Sanju", 33, "Gujrat");
		Player p10 = new Player("Zaheer", 38, "Shirdi");
		Player p11 = new Player("Sachin", 21, "Mumbai");

		ArrayList<Player> alcsk = new ArrayList<>();
		alcsk.add(p1);
		alcsk.add(p2);
		alcsk.add(p9);

		ArrayList<Player> alMi = new ArrayList<>();
		alMi.add(p4);
		alMi.add(p5);
		alMi.add(p7);
		alMi.add(p8);
		alMi.add(p11);

		ArrayList<Player> alRCB = new ArrayList<>();
		alRCB.add(p3);
		alRCB.add(p6);
		alRCB.add(p10);

		HashMap<String, ArrayList<Player>> hm = new HashMap<>();
		hm.put("CSK", alcsk);
		hm.put("RCB", alRCB);
		hm.put("MI", alMi);

		TreeMap<String, HashMap<String, ArrayList<Player>>> tm = new TreeMap<>();
		tm.put("IPL", hm);

		return alcsk;
	}

	public static void main(String[] args) {
		Operation o = new Operation();
		o.m1();
	}

}
