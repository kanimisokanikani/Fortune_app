import java.util.InputMismatchException;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void fortune_teller (String get_string) { //get_stringに入れた文章は、prefixを合成して書き出します
        String prefix = "[時給450円の占い師] ";               //イレギュラーは System.out.println で書きます
        System.out.println(prefix + get_string);
    }

    public static void cool_time (int get_time) throws InterruptedException { //get_timeに任意を入れるとその時間だけ待ちます
        TimeUnit.MILLISECONDS.sleep(get_time);                                //[1秒 = 1000] です。 500 は 0.5秒
    }

    public static void main(String[] args) throws InterruptedException {

        //////////////////////
        // 占い屋開店フェーズ //
        //////////////////////

        cool_time(400);
        System.out.println("[お買い得!! 石原良純レベルでよく当たる! 占いばぁやの店] 錦糸町支店が開店しました");


        ////////////////////
        // 変数作成フェーズ //
        ////////////////////

        String prefix = "[時給450円の占い師] ";
        String get_name = "";
        int get_age = 300;
        String get_fortune;


        //////////////////
        // 名前尋問タイム //
        //////////////////

        cool_time(6000);
        fortune_teller("あなたの名前は何かしら？");

        while (true) {//名前が何も無い場合無限ループ
            get_name = new java.util.Scanner(System.in).nextLine();

            if (get_name.equals("")) {
                cool_time(500);
                fortune_teller("無言貫き通されてもあたし困るんですけど!!");

                cool_time(2750);
                fortune_teller("コミュ障クソ陰キャカス野郎でも");

                cool_time(3000);
                fortune_teller("自分の名前くらいは名乗ってくれよぉ!!");

                cool_time(2000);
                fortune_teller("結局あんたの名前はなんなのよ");
            } else {
                break;
            }
        }

        cool_time(1000);
        System.out.println(prefix + get_name + " さんね・・・");

        cool_time(1750);
        fortune_teller("なかなかいい名前じゃない");


        //////////////////
        // 年齢尋問タイム //
        //////////////////

        cool_time(2750);
        fortune_teller("年齢は？");

        while (true) {
            try {
                get_age = new java.util.Scanner(System.in).nextInt();

            } catch (Exception e) { //例外が起きたらエラーメッセージを流す
                cool_time(1250);
                fortune_teller("数字を超越したサバ読みは卑怯だよ!");

                cool_time(1750);
                fortune_teller("ちゃんと数字で言いなさい!");

                cool_time(2000);
                fortune_teller("数字で言うまで帰さないからね!");

                cool_time(1750);
                fortune_teller("結局あんたは何歳なのよ");
                continue;
            }
            if (get_age > 130) { //131歳以上だった場合無限ループ
                cool_time(1500);
                fortune_teller("あんた歳取りすぎて無い？");

                cool_time(2000);
                fortune_teller("年齢差でマウント取りたいからって");

                cool_time(2000);
                fortune_teller("そんな詐称するのは見苦しいわよ!!");

                cool_time(1750);
                fortune_teller("結局あんたは何歳なのよ");
            } else {
                break;
            }
        }

        cool_time(1750);
        fortune_teller("ふーん・・・");

        cool_time(1750);
        System.out.println(prefix + get_age + "歳なんだ");


        ///////////////
        // 占いタイム //
        ///////////////

        cool_time(3000);
        fortune_teller("何を占ってほしいの？ ([]の中の文字を入力してください)");
        System.out.println("[恋愛]について [仕事]について [健康]について [周囲からの評価]について");

        while (true) {
            get_fortune = new java.util.Scanner(System.in).nextLine();
            switch (get_fortune) {
                case "恋愛":
                    fortune_teller("まだ開発中よ");
                    break;

                case "仕事":
                    fortune_teller("まだ開発中よ");
                    break;

                case "健康":
                    fortune_teller("まだ開発中よ");
                    break;

                case "周囲からの評価":
                    fortune_teller("まだ開発中よ");
                    break;

                case "":
                    continue;

                default:
                    cool_time(1000);
                    fortune_teller("天邪鬼みたいな回答してんじゃねぇよ");
                    cool_time(3000);
                    fortune_teller("こんなところですら人を信用出来ないから不幸だなんだ騒いで迷惑かけてるんだろ？");
                    cool_time(5000);
                    fortune_teller("個人情報売られたくなかったらとっとと帰れ");
                    cool_time(3000);
                    fortune_teller("このクソゴミムシ野郎が");
                    cool_time(500);
                    break;
            }
            break;
        }
    }
}