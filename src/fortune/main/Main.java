package fortune.main;

import fortune.tools.wordBan.wordBan; //FQCNのインポート wordBan Classを使用する時に使う
import fortune.fortune.fortuneLove; //FQCNのインポート fortuneLove Classを使用する時に使う
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

        ////////////////////
        // 変数作成フェーズ //
        ////////////////////

        String prefix = "[時給450円の占い師] ";

        String last_Name; //苗字
        String first_Name; //名前
        String get_Name; //フルネーム
        int get_Age; //年齢


        //////////////////////
        // 占い屋開店フェーズ //
        //////////////////////

        cool_Time(400);
        System.out.println("[恋のキューピット(86) 占いばぁやの店] 錦糸町支店が開店しました");


        //////////////////
        // 名前尋問タイム //
        //////////////////

        cool_Time(3000);
        fortune_Teller("あなたの苗字は何かしら？");

        last_Name = wordBan.name_Scanner("苗字");


        cool_Time(500);
        fortune_Teller("名前は何かしら？");

        first_Name = wordBan.name_Scanner("名前");


        get_Name = last_Name + " " + first_Name;


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
                continue;

            } else if (0 > get_Age) { //-1以下だった場合無限ループ
                cool_Time(1200);
                fortune_Teller("あんた人生フライングしてない？");

                cool_Time(2000);
                fortune_Teller("人生二週目だか知らないけど");

                cool_Time(2000);
                fortune_Teller("ちゃんと正規の方法で人生をプレイングしてよ");

                cool_Time(1750);
                fortune_Teller("結局あんたは何歳なのよ");
                continue;

            } else {
                break;
            }
        }

        cool_Time(1750);
        fortune_Teller("ふーん・・・");

        cool_Time(1750);
        System.out.println(prefix + get_Age + "歳なんだ");


        /////////////////////
        // Class移行フェーズ //
        /////////////////////

        fortuneLove.fortune_Love_Question( get_Name, get_Age ); //恋愛占い本編に移動
    }
}