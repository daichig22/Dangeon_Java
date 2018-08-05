package RPG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Battle {

	private int Enemy_HP = (int)(Math.random() * 10 + 5);
	static int User_attack;
	static int Emeny_attack;
	static int User_Magic = 1;

	public void Battle_Mode() throws IOException{
		System.out.println("\nバトルスタート！");
		while(Enemy_HP > 0 && Startgame.User_HP > 0){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("\nどうしますか？ 1 : たたかう 2 : まほう 3 : 逃げる > ");
			String User_Todo = br.readLine();

			int User_Todo_num = Integer.parseInt(User_Todo);

			if (User_Todo_num == 1) {
				System.out.println("\n" + Startgame.User_Name + "の攻撃！");
				User_attack = (int)(Math.random() * 5);
				if (User_attack == 0) {
					System.out.println("\n避けられた..\n");
				} else {
					Enemy_HP -= User_attack;
					System.out.println("\n敵に" + User_attack + "のダメージ!");
				}
				Emeny_attack = (int)(Math.random() * 10);
				if (Emeny_attack == 0) {
					System.out.println("\n避けられた..\n");
				} else {
					Startgame.User_HP -= Emeny_attack;
					System.out.println("\n" + Startgame.User_Name + "に" + Emeny_attack + "のダメージ! : ");
					System.out.println(Startgame.User_Name + "のHP : " + Startgame.User_HP);
				}
			}else if (User_Todo_num == 2){
				if(User_Magic == 1){
					System.out.println("\n" + Startgame.User_Name + "は魔法を唱えた！");
					User_Magic -= 1;
					Enemy_HP = 0;
					System.out.println("\n魔物は粉々に砕け散った!");
					break;
				}else{
					System.out.println("\n魔法を使う気力がない...");
				}
			}else if (User_Todo_num == 3){
				System.out.println("\n" + Startgame.User_Name + "は逃げようとした！\n");
				int User_Escape = (int)(Math.random() * 100 + 1);
				if(User_Escape <= 80){
					System.out.println("\n成功!");
					Startgame.User_HP -= 1;
					break;
				}else{
					System.out.println("\n失敗...");
					Startgame.User_HP -= 2;
				}
			}else{
				System.out.println("\n正しいコマンドを入力してください");
			}

		}
		if(Enemy_HP < 0){
			System.out.println("\n敵はおとなしくなった！");
			System.out.println("\n----------------------------------------------------");
		}
	}
}
