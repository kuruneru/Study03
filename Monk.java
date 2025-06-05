public class Monk extends Ally implements Member{

    /* 名前，体力，攻撃力を設定するコンストラクタ */
    public Monk(String name, int hp, int atk) {
        super(name, hp, atk);
    }

    /* 指定のキャラを15回復させる(最大HPは超えないようにする) */
    public void skill(Character c) {
        System.out.println(">> " + this.name + "がスキルを発動");
        System.out.println(">> " + c.name + "の体力が回復した!");
        c.hp += 15;
        if (c instanceof Hero && c.hp >= 150) {
            c.hp = 150;
        } else if (c instanceof Knight && c.hp >= 160){
            c.hp = 160;
        } else if (c instanceof Monk && c.hp >= 100){
            c.hp = 100;
        } else if (c instanceof Magician && c.hp >= 60){
            c.hp = 60;
        }
        System.out.println(c.name + "の残りHP: " + c.hp);
    }
}