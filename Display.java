package RPG;

import java.io.IOException;

public class Display {
	public void DungeonScreen(int dan_lev,int User_Place,int Enemy_Place) throws IOException{
		System.out.println("\nダンジョンLV." + dan_lev);
		String[] Dangeon = {"1","2","3","4","5","6","7","8","9","10",};
		for(int i = 0;i < 10; i++){
			System.out.print("| ");
			if(User_Place == i && Enemy_Place == i){
				Dangeon[i] = "★";
				System.out.print(Dangeon[i]);
			}else if(User_Place == i){
				Dangeon[i] = "👤";
				System.out.print(Dangeon[i]);
			}else if(Enemy_Place == i){
				Dangeon[i] = "👿";
				System.out.print(Dangeon[i]);
			}else{
				System.out.print(Dangeon[i]);
			}
			System.out.print(" |");
		}
		System.out.println("\n");
		System.out.println("---------------------------------------------------");
		for(int j = 0;j < 10; j++){
			if(Dangeon[j].equals("★")){
				Battle bat = new Battle();
				bat.Battle_Mode();
			}
		}
	}
}
