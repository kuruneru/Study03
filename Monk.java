public class Monk extends Ally implements Member{

    /* 名前，体力，攻撃力を設定するコンストラクタ */
    public Monk(String name, int hp, int atk) {
        super(name, hp, atk);
    }

    /* 指定のキャラを15回復させる(最大HPは超えないようにする) */
    public void skill(Character c) {

    }
}