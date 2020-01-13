import java.util.InputMismatchException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //////////////////////
        // 占い屋開店フェーズ //
        //////////////////////

        TimeUnit.MILLISECONDS.sleep(400);
        System.out.println("[お買い得!! 石原良純レベルでよく当たる! 占いばぁやの店] 錦糸町支店が開店しました");


        ////////////////////
        // 変数作成フェーズ //
        ////////////////////

        String prefix = "[時給450円の占い師] ";
        String get_name = "";
        int get_age = 300;


        //////////////////
        // 名前尋問タイム //
        //////////////////

        TimeUnit.MILLISECONDS.sleep(6000);
        System.out.println(prefix + "あなたの名前は何かしら？");

        while (true) {//名前が何も無い場合無限ループ
            get_name = new java.util.Scanner(System.in).nextLine();
            if (get_name.equals("")) {
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.println(prefix + "無言貫き通されてもあたし困るんですけど!!");
                TimeUnit.MILLISECONDS.sleep(2750);
                System.out.println(prefix + "コミュ障クソ陰キャカス野郎でも");
                TimeUnit.MILLISECONDS.sleep(3000);
                System.out.println(prefix + "自分の名前くらいは名乗ってくれよぉ!!");
                TimeUnit.MILLISECONDS.sleep(2000);
                System.out.println(prefix + "結局あんたの名前はなんなのよ");
            } else {
                break;
            }
        }

        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println(prefix + get_name + "さんね・・・");
        TimeUnit.MILLISECONDS.sleep(1750);
        System.out.println(prefix + "なかなかいい名前じゃない");


        //////////////////
        // 年齢尋問タイム //
        //////////////////

        TimeUnit.MILLISECONDS.sleep(2750);
        System.out.println(prefix + "年齢は？");

        while (true) {
            try {
                get_age = new java.util.Scanner(System.in).nextInt();
            } catch (Exception e) { //例外が起きたらエラーメッセージを流す
                TimeUnit.MILLISECONDS.sleep(1250);
                System.out.println(prefix + "数字を超越したサバ読みは卑怯だよ!");
                TimeUnit.MILLISECONDS.sleep(1750);
                System.out.println(prefix + "ちゃんと数字で言いなさい!");
                TimeUnit.MILLISECONDS.sleep(2000);
                System.out.println(prefix + "数字で言うまで帰さないからね!");
                TimeUnit.MILLISECONDS.sleep(1750);
                System.out.println(prefix + "結局あんたは何歳なのよ");
                continue;
            }
            if (get_age > 130) { //131歳以上だった場合無限ループ
                TimeUnit.MILLISECONDS.sleep(1500);
                System.out.println(prefix + "あんた歳取りすぎて無い？");
                TimeUnit.MILLISECONDS.sleep(2000);
                System.out.println(prefix + "年齢差でマウント取りたいからって");
                TimeUnit.MILLISECONDS.sleep(2000);
                System.out.println(prefix + "そんな詐称するのは見苦しいわよ!!");
                TimeUnit.MILLISECONDS.sleep(1750);
                System.out.println(prefix + "結局あんたは何歳なのよ");
            } else {
                break;
            }
        }

        TimeUnit.MILLISECONDS.sleep(1750);
        System.out.println(prefix + "ふーん・・・");
        TimeUnit.MILLISECONDS.sleep(1750);
        System.out.println(prefix + get_age + "歳なんだ");


        ///////////////
        // 占いタイム //
        ///////////////

        TimeUnit.MILLISECONDS.sleep(3000);
        System.out.println(prefix + "何を占ってほしいの？ ([]の中の文字を入力してください)");
        System.out.println("[恋愛]について [仕事]について [健康]について [周囲からの評価]について");
        String get_fortune = new java.util.Scanner(System.in).nextLine();

        switch (get_fortune) {
            case "恋愛":
                System.out.println(prefix + "まだ開発中よ");
                break;

            case "仕事":
                System.out.println(prefix + "まだ開発中よ");
                break;

            case "健康":
                System.out.println(prefix + "まだ開発中よ");
                break;

            case "周囲からの評価":
                System.out.println(prefix + "まだ開発中よ");
                break;

            default:
                TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println(prefix + "天邪鬼みたいな回答してんじゃねぇよ");
                TimeUnit.MILLISECONDS.sleep(3000);
                System.out.println(prefix + "こんなところですら人を信用出来ないから不幸だなんだ騒いで迷惑かけてるんだろ？");
                TimeUnit.MILLISECONDS.sleep(5000);
                System.out.println(prefix + "個人情報売られたくなかったらとっとと帰れ");
                TimeUnit.MILLISECONDS.sleep(3000);
                System.out.println(prefix + "このクソゴミムシ野郎が");
                TimeUnit.MILLISECONDS.sleep(500);
        }
    }
}