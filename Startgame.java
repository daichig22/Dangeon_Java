package RPG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Startgame {

	public static int User_HP = 20;
	public static String User_Name;

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ

		Master mas = new Master();

		System.out.print("君の名は？ : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		User_Name = br.readLine();
		if(User_Name.equals("saikyo")){
			User_HP = 10000;
		}
		System.out.println("\nGame Start!");

		mas.DungeonStatus();
	}

}
