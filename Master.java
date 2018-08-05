package RPG;

import java.io.IOException;

public class Master {

	private boolean End_Flag;
	private int Dun_Lev = 1;
	private int User_Walk = 0;
	private int Enemy_Walk = 0;


	public void DungeonStatus() throws IOException{

		do{
			End_Flag = true;

			System.out.println("\n" + Startgame.User_Name + " : 1マス進みます");
			System.out.println(Startgame.User_Name + " のHP : " + Startgame.User_HP);

			User_Walk += 1;
			Enemy_Walk = (int)(Math.random() * 9 + 1);
			Display dis = new Display();
			dis.DungeonScreen(Dun_Lev,User_Walk,Enemy_Walk);

			if(User_Walk == 9 || Startgame.User_HP  < 0){
				End_Flag = false;
			}
		}while(End_Flag);

		if(User_Walk == 9){
			System.out.println("\nGOAL!");
		}else{
			System.out.println("\nゲームオーバーです。");
		}
	}

}
