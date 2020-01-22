package fortune.main.fortune;

import fortune.main.main.Main; //FQCNのインポート Main Classを使用する時に使う

public class fortuneLove {
    public static void fortune_Love_Question_Main (String name, int age) throws InterruptedException {

        ////////////////////
        // 変数作成フェーズ //
        ////////////////////

        String string_Answer = "";
        int int_Answer = -1;
        int fortune_Result = 0;


        ///////////////
        // 尋問タイム //
        ///////////////

        Main.cool_Time(1000);
        Main.fortune_Teller("恋愛について困ってるんだ...");

        Main.cool_Time(2000);
        Main.fortune_Teller("こんなところにわざわざやってくるんだから");

        Main.cool_Time(2300);
        Main.fortune_Teller("そうとう拗らせてるわね・・・");

        Main.cool_Time(1900);
        Main.fortune_Teller("とりあえず質問するわよ");

        Main.cool_Time(1800);
        Main.fortune_Teller("あんたは童貞？");

        Main.cool_Time(100);
        System.out.println("[YES] か [NO] で答えてください ([]の中の文字を入力してください)");


        ////////////////
        // 童貞チェック //
        ////////////////

        while (true) { //1回目の尋問 YESなら陰キャポインツ増加
            string_Answer = new java.util.Scanner(System.in).nextLine();
            switch (string_Answer) {
                case "YES":
                    Main.cool_Time(300);
                    Main.fortune_Teller("あっ・・・");

                    Main.cool_Time(6000);
                    Main.fortune_Teller("そうだったんだね・・・");

                    Main.cool_Time(3500);
                    Main.fortune_Teller("なんかごめんね・・・");

                    fortune_Result ++; //点数が増えれば増えるほど運が悪くなる
                    break;

                case "NO":
                    Main.cool_Time(1000);
                    Main.fortune_Teller("あんたみたいなやつでも");

                    Main.cool_Time(2200);
                    Main.fortune_Teller("ヤらせてくれる女いるんだね...");

                    Main.cool_Time(3500);
                    Main.fortune_Teller("かわいそ");

                    break;

                case "":
                    continue;

                default:
                    Main.cool_Time(750);
                    Main.fortune_Teller("[YES] か [NO] で答えろっつってんじゃん!!");

                    Main.cool_Time(1800);
                    Main.fortune_Teller("二択すら答えられない無能が!!!!");
                    continue;
            }
            break;
        }


        ///////////////
        // 尋問タイム //
        ///////////////

        Main.cool_Time(3000);
        System.out.println("");

        if (string_Answer == "YES") {
            Main.cool_Time(2000);
            Main.fortune_Teller("童貞なら辛い質問だけど・・・");
        } else {
            Main.cool_Time(2000);
            Main.fortune_Teller("あんたならこの質問耐えられるわね...");
        }

        string_Answer ="";

        Main.cool_Time(1800);
        Main.fortune_Teller("彼女は何人居たの？");

        Main.cool_Time(100);
        System.out.println("数字で答えてください");


        /////////////////////
        // 彼女製造業チェック //
        /////////////////////

        while (true) {
            string_Answer = new java.util.Scanner(System.in).nextLine();
            switch (string_Answer) {
                case "YES":
                    break;

                case "NO":
                    break;

                case "":
                    continue;

                default:
                    Main.cool_Time(750);
                    Main.fortune_Teller("[YES] か [NO] で答えろっつってんじゃん!!");

                    Main.cool_Time(1250);
                    Main.fortune_Teller("二択すら答えられない無能が!!!!");
                    continue;
            }
            break;
        }









        Main.cool_Time(1000);
        Main.fortune_Teller("ぁたし実わぁ18さぃなんだよね( ´∀｀)");

        Main.cool_Time(1500);
        Main.fortune_Teller("そんなに困ってるならヤっちゃう？(●´ω｀●)"); //YESはぼったくられる 凶



        while (true) {
            string_Answer = new java.util.Scanner(System.in).nextLine();
            switch (string_Answer) {
                case "YES":
                    break;

                case "NO":
                    break;

                case "":
                    continue;

                default:
                    Main.cool_Time(750);
                    Main.fortune_Teller("[YES] か [NO] で答えろっつってんじゃん!!");

                    Main.cool_Time(1250);
                    Main.fortune_Teller("二択すら答えられない無能が!!!!");
                    continue;
            }
            break;
        }
    }
}
