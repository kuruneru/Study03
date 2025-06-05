public class Knight extends Ally implements Member{

    /* 名前，体力，攻撃力を設定するコンストラクタ */
    public Knight(String name, int hp, int atk) {
        super(name, hp, atk);
    }

    /* 3倍の攻撃力で指定のキャラを攻撃 */
    public void skill(Character c) {
        System.out.println(">> " + super.name + "がスキルを発動！");
        System.out.println(">> " + super.name + "の攻撃力" + super.atk * 3);
        c.damege(super.atk * 3);

    }
}