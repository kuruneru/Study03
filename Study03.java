import java.util.*;

public class Study03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* idとターンの変数定義 */
        int id; int turn = 0;

        /* 魔王以外を配列に格納する */
        Ally[] ally = new Ally[4];
        ally[0] = new Hero("勇者", 150, 20);
        ally[1] = new Knight("騎士", 160, 25);
        ally[2] = new Monk("僧侶", 100, 5);
        ally[3] = new Magician("魔導士", 60, 10);
        Satan satan = new Satan("魔王", 250, 30);
        
        /* 味方メンバーのステータスの表示 */
        System.out.println("-----");
        for (int i = 0; i < ally.length; i++) ally[i].showStatus();
        System.out.println("-----");

        /* 配列の中からメンバーになる人を選ぶ */
        while (true) {
            System.out.println("連れて行く仲間を選んでください(IDを入力)");
            System.out.print("ID: ");
            id = scan.nextInt();
            if (id >= 1 && id <= 3) { /* 有効な数字であった場合 */
                System.out.println(ally[id].name + "が仲間になった\n");
                break;
            } else { /* 無効な数字である場合 */
                System.out.println("\n無効なID入力です\n");
            }
        }
        

        System.out.println("現在のパーティー");
        System.out.println("-----");

        /* パーティーを追加(配列のID番を追加) */
        Ally[] party = new Ally[2];
        party[0] = ally[0];
        party[1] = ally[id];

        for (int i = 0; i < party.length; i++) party[i].showStatus();
        System.out.println("---\n");

        /* 魔王のステータス表示 */
        satan.showStatus();

        System.out.println();
        System.out.println("======= BATTLE START =======");
        while(true) {
            System.out.println("ターン: " + (++turn));

            /* パーティーメンバーの攻撃 */
            if (turn % 2 == 1 && party[1].hp > 0) {
                party[1].attack(satan);
            } else if (party[1].hp > 0){
                /* スキル攻撃 */
                if ( party[1] instanceof Knight ) {
                    ((Member) party[1]).skill(satan);
                } else if (party[1] instanceof Monk) {
                    ((Member)party[1]).skill(party[0]);
                } else if (party[1] instanceof Magician) {
                    ((Member)party[1]).skill(party[0]);
                } else {
                    break;
                }
            }

            if (party[0].hp == 0)  {
                System.out.println("-------YOU LOSE-------");
                break;
            } else if (satan.hp == 0) {
                System.out.println("-------YOU WIN-------");
                break;
            }

            /* 勇者の攻撃 */
            party[0].attack(satan);
            System.out.println();

            if (party[0].hp == 0)  {
                System.out.println("-------YOU LOSE-------");
                break;
            } else if (satan.hp == 0) {
                System.out.println("-------YOU WIN-------");
                break;
            }

            if (turn % 2 == 1) {
                satan.attack(party[0]);
            } else {
                satan.allAttack(party);
            }

            if (party[0].hp == 0)  {
                System.out.println("-------YOU LOSE-------");
                break;
            } else if (satan.hp == 0) {
                System.out.println("-------YOU WIN-------");
                break;
            }

            for (int i = 0; i < party.length; i++) party[i].resetStatus();

            System.out.println();
        }
    }
}