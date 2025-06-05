

public class Satan extends Character{
    
    /* コンストラクタ */
    public Satan(String name, int hp, int atk) {
        super(name, hp, atk);
    }

    /* parttyに格納されたキャラ全員に攻撃 */
    public void allAttack(Ally[] party) {
        System.out.println(">> " + super.name  + "の全体攻撃");
        for (int i = 0; i < party.length; i++) {
            party[i].hp -= super.atk;
            System.out.println(party[i].name + "に" + party[i].atk + "ダメージ");
            System.out.println(party[i].name + "の残りHP: " + party[i].hp);
        }
    }
}