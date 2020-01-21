import java.util.concurrent.TimeUnit;

public class Main {

    public static void fortune_Teller (String get_String) { //get_stringに入れた文章は、prefixを合成して書き出します
        String prefix = "[時給450円の占い師] ";               //イレギュラーは System.out.println で書きます
        System.out.println(prefix + get_String);
    }

    public static void cool_Time (int get_Time) throws InterruptedException { //get_timeに任意を入れるとその時間だけ待ちます
        TimeUnit.MILLISECONDS.sleep(get_Time);                                //[1秒 = 1000] です。 500 は 0.5秒
    }


    public static void main(String[] args) throws InterruptedException {

        //////////////////////
        // 占い屋開店フェーズ //
        //////////////////////

        cool_Time(400);
        System.out.println("[お買い得!! 石原良純レベルでよく当たる! 占いばぁやの店] 錦糸町支店が開店しました");


        ////////////////////
        // 変数作成フェーズ //
        ////////////////////

        String prefix = "[時給450円の占い師] ";
        String get_Name = "";
        int get_Age = 300;
        String get_Fortune;


        //////////////////
        // 名前尋問タイム //
        //////////////////

        cool_Time(6000);
        fortune_Teller("あなたの苗字は何かしら？");

        get_Name = new java.util.Scanner(System.in).nextLine();
        Wordban.name_Scanner(get_Name);

        while (true) {//名前が何も無い場合無限ループ

            if (get_Name.equals("")) {
                cool_Time(500);
                fortune_Teller("無言貫き通されてもあたし困るんですけど!!");

                cool_Time(2750);
                fortune_Teller("コミュ障クソ陰キャカス野郎でも");

                cool_Time(3000);
                fortune_Teller("自分の名前くらいは名乗ってくれよぉ!!");

                cool_Time(2000);
                fortune_Teller("結局あんたの名前はなんなのよ");
            } else {
                break;
            }
        }

        cool_Time(1000);
        System.out.println(prefix + get_Name + " さんね・・・");

        cool_Time(1750);
        fortune_Teller("なかなかいい名前じゃない");


        //////////////////
        // 年齢尋問タイム //
        //////////////////

        cool_Time(2750);
        fortune_Teller("年齢は？");

        while (true) {
            try {
                get_Age = new java.util.Scanner(System.in).nextInt();

            } catch (Exception e) { //例外が起きたらエラーメッセージを流す
                cool_Time(1250);
                fortune_Teller("数字を超越したサバ読みは卑怯だよ!");

                cool_Time(1750);
                fortune_Teller("ちゃんと数字で言いなさい!");

                cool_Time(2000);
                fortune_Teller("数字で言うまで帰さないからね!");

                cool_Time(1750);
                fortune_Teller("結局あんたは何歳なのよ");
                continue;
            }
            if (get_Age > 130) { //131歳以上だった場合無限ループ
                cool_Time(1500);
                fortune_Teller("あんた歳取りすぎて無い？");

                cool_Time(2000);
                fortune_Teller("年齢差でマウント取りたいからって");

                cool_Time(2000);
                fortune_Teller("そんな詐称するのは見苦しいわよ!!");

                cool_Time(1750);
                fortune_Teller("結局あんたは何歳なのよ");
            } else {
                break;
            }
        }

        cool_Time(1750);
        fortune_Teller("ふーん・・・");

        cool_Time(1750);
        System.out.println(prefix + get_Age + "歳なんだ");


        ///////////////
        // 占いタイム //
        ///////////////

        cool_Time(3000);
        fortune_Teller("何を占ってほしいの？ ([]の中の文字を入力してください)");
        System.out.println("[恋愛]について [仕事]について [健康]について [周囲からの評価]について");

        while (true) {
            get_Fortune = new java.util.Scanner(System.in).nextLine();
            switch (get_Fortune) {
                case "恋愛":
                    fortune_Teller("まだ開発中よ");
                    break;

                case "仕事":
                    fortune_Teller("まだ開発中よ");
                    break;

                case "健康":
                    fortune_Teller("まだ開発中よ");
                    break;

                case "周囲からの評価":
                    fortune_Teller("まだ開発中よ");
                    break;

                case "":
                    continue;

                default:
                    cool_Time(1000);
                    fortune_Teller("天邪鬼みたいな回答してんじゃねぇよ");
                    cool_Time(3000);
                    fortune_Teller("こんなところですら人を信用出来ないから不幸だなんだ騒いで迷惑かけてるんだろ？");
                    cool_Time(5000);
                    fortune_Teller("個人情報売られたくなかったらとっとと帰れ");
                    cool_Time(3000);
                    fortune_Teller("このクソゴミムシ野郎が");
                    cool_Time(500);
                    break;
            }
            break;
        }
    }
}