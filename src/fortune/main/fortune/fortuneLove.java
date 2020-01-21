package fortune.main.fortune;

import fortune.main.main.Main; //FQCNのインポート Main Classを使用する時に使う

public class fortuneLove {
    public static void fortune_Love_Question_Main (String name, int age) throws InterruptedException {
        String answer = "";

        Main.cool_Time(1000);
        Main.fortune_Teller("恋愛について困ってるんだ...");

        Main.cool_Time(1500);
        Main.fortune_Teller("こんなところにわざわざやってくるんだから");

        Main.cool_Time(1300);
        Main.fortune_Teller("そうとう拗らせてるわね・・・");

        Main.cool_Time(1200);
        Main.fortune_Teller("とりあえず質問するわよ");

        Main.cool_Time(800);
        Main.fortune_Teller("あんたは童貞？");

        Main.cool_Time(100);
        Main.fortune_Teller("[YES] か [NO] で答えてください ([]の中の文字を入力してください)");

        while (true) {
            answer = new java.util.Scanner(System.in).nextLine();
            switch (answer) {
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
        Main.fortune_Teller("ぁたし実わぁ18さぃなんだよね(*'▽'*)");

        Main.cool_Time(1500);
        Main.fortune_Teller("そんなに困ってるならヤっちゃう？(●´ω｀●)"); //NO以外はぼったくられる 凶



        while (true) {
            answer = new java.util.Scanner(System.in).nextLine();
            switch (answer) {
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
