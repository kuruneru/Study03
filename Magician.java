public class Magician extends Ally implements Member{

    /* コンストラクタ */
    public Magician(String name, int hp, int atk) {
        super(name, hp, atk);
    }

    /* 指定のキャラの攻撃力を2倍に */
    public void skill(Character c) {
        System.out.println(super.name + "がスキル発動!");
        System.out.println(super.name + "が" + c.name + "の攻撃力を2倍にした");
        c.atk *= 2;
    }
}