package fortune.fortune;

import fortune.main.Main; //FQCNのインポート Main Classを使用する時に使う

public class fortuneLove {
    public static void fortune_Love_Question (String name, int age) throws InterruptedException {

        ////////////////////
        // 変数作成フェーズ //
        ////////////////////

        String string_Answer; //入力するときにのみ使用する変数
        int int_Answer;

        boolean virgin; //童貞かどうか
        int girl_Friend; //彼女は何人か
        String girl_Type; //どんな子がタイプなのか

        int fortune_Result = 0; //占いの確率に関係する変数


        ///////////////
        // 尋問タイム //
        ///////////////

        Main.cool_Time(2500);
        Main.fortune_Teller("恋愛について困ってるのね...");

        Main.cool_Time(2000);
        Main.fortune_Teller("こんなところにわざわざやってくるんだから");

        Main.cool_Time(2300);
        Main.fortune_Teller("そうとう拗らせてるわね・・・");

        Main.cool_Time(1900);
        Main.fortune_Teller("とりあえず質問するわよ");

        Main.cool_Time(2000);
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

                    virgin = true;
                    fortune_Result += 2; //点数が増えれば増えるほど運が悪くなる

                    break;

                case "NO":
                    Main.cool_Time(1000);
                    Main.fortune_Teller("あんたみたいなやつでも");

                    Main.cool_Time(2200);
                    Main.fortune_Teller("ヤらせてくれる女はいるんだね...");

                    Main.cool_Time(2500);
                    Main.fortune_Teller("かわいそ");

                    virgin = false;

                    break;

                case "":

                    continue;

                default:
                    Main.cool_Time(750);
                    Main.fortune_Teller("[YES] か [NO] で答えろっつってんじゃん!!");

                    Main.cool_Time(1800);
                    Main.fortune_Teller("二択すら答えられない無能が!!!!");

                    Main.cool_Time(2000);
                    Main.fortune_Teller("結局あんたは童貞なの?");

                    continue;
            }
            break;
        }

        string_Answer = "";

        ///////////////
        // 尋問タイム //
        ///////////////

        Main.cool_Time(3000);
        Main.fortune_Teller("...次の質問いくわね");

        if (virgin == true) {
            Main.cool_Time(2800);
            Main.fortune_Teller("童貞なら辛い質問だけど・・・");
        } else {
            Main.cool_Time(2500);
            Main.fortune_Teller("あんたならこの質問耐えられるわね...");
        }


        Main.cool_Time(2200);
        Main.fortune_Teller("彼女は何人居たの？");

        Main.cool_Time(100);
        System.out.println("数字で答えてください");


        /////////////////////
        // 彼女製造業チェック //
        /////////////////////

        while (true) {
            try {
                girl_Friend = new java.util.Scanner(System.in).nextInt();

            } catch (Exception e) { //例外が起きたらエラーメッセージを流す
                Main.cool_Time(1000);
                Main.fortune_Teller("あんた居ないからって");

                Main.cool_Time(1750);
                Main.fortune_Teller("数字以外でごまかすのやめなさい!");

                Main.cool_Time(2000);
                Main.fortune_Teller("数字で言わないとあたしゃ理解できないよ!!");

                Main.cool_Time(1750);
                Main.fortune_Teller("結局あんた何人居たのよ");

                continue;
            }
            if (0 > girl_Friend) { // -1人以下だったら無限ループ
                Main.cool_Time(1500);
                Main.fortune_Teller("あんた人生で何をしたら");

                Main.cool_Time(1600);
                Main.fortune_Teller("そんなスコアになるのよ!");

                Main.cool_Time(2000);
                Main.fortune_Teller("人生にプロアクションリプレイを使ってる暇があるなら");

                Main.cool_Time(2500);
                Main.fortune_Teller("ちゃんと彼女を作る努力をしなさい!!");

                Main.cool_Time(2250);
                Main.fortune_Teller("結局あんた何人居たのよ");

                continue;
            } else { //ここから人数選別
                switch (girl_Friend) {
                    case 0 :
                        if (virgin == true) { //童貞チェックで YES だったらこっち
                            Main.cool_Time(1000);
                            Main.fortune_Teller("でしょうね");

                            Main.cool_Time(2300);
                            Main.fortune_Teller("もしそれで彼女いたらびっくりするわ");

                            Main.cool_Time(2500);
                            Main.fortune_Teller("...");

                            Main.cool_Time(3000);
                            Main.fortune_Teller("ま、まぁ人生これからよね・・・");

                            fortune_Result ++; //点数が増えれば増えるほど運が悪くなる

                        } else { //童貞では無い場合
                            Main.cool_Time(1500);
                            Main.fortune_Teller("えぇ!?");

                            Main.cool_Time(1300);
                            Main.fortune_Teller("あんた彼女いないのにヤってんの!!?");

                            Main.cool_Time(1200);
                            Main.fortune_Teller("どこでヤってきたん?");

                            Main.cool_Time(1100);
                            Main.fortune_Teller("歌舞伎町? 飛田新地?");

                            Main.cool_Time(1000);
                            Main.fortune_Teller("もしくは円光?");

                            Main.cool_Time(3000);
                            Main.fortune_Teller("まぁいいわ");

                            fortune_Result += 2;
                        }

                        break;

                    case 1 :
                    case 2 :
                    case 3 :
                        if (virgin == true) { //童貞ならこっち
                            Main.cool_Time(1600);
                            Main.fortune_Teller("へ、へぇ・・・");

                            Main.cool_Time(2700);
                            Main.fortune_Teller("居たことあるんだぁ・・・");

                            Main.cool_Time(3500);
                            Main.fortune_Teller("もうちょっとアタックすれば卒業できるかもねぇ");

                            Main.cool_Time(4000);
                            Main.fortune_Teller("ファイト");

                            fortune_Result --; //ボーナス 点数を一つ減らしてあげる

                        } else { //童貞卒業者
                            Main.cool_Time(1800);
                            Main.fortune_Teller("...");

                            Main.cool_Time(2000);
                            Main.fortune_Teller("普通すぎて言うことないわよ!");

                            Main.cool_Time(2300);
                            Main.fortune_Teller("ここきた意味ある?");

                            Main.cool_Time(2200);
                            Main.fortune_Teller("まぁ..おめでとう...");
                        }

                        break;

                    case 4 :
                    case 5 :
                    case 6 :
                        if (virgin == true) { //童貞ならこっち
                            Main.cool_Time(1300);
                            Main.fortune_Teller("えぇ...");

                            Main.cool_Time(1750);
                            Main.fortune_Teller("ほんとにぃ?");

                            Main.cool_Time(2700);
                            Main.fortune_Teller("それだけアタックチャンスあったのに");

                            Main.cool_Time(2500);
                            Main.fortune_Teller("なぜ童貞なんだい");

                            Main.cool_Time(2100);
                            Main.fortune_Teller("あたしゃあ不思議でならないよ");

                            fortune_Result += 3;

                        } else { //童貞卒業者
                            Main.cool_Time(1300);
                            Main.fortune_Teller("割と彼女いたのね・・・");

                            Main.cool_Time(2200);
                            Main.fortune_Teller("陽キャオーラが眩しいわぁ...");

                            Main.cool_Time(2500);
                            Main.fortune_Teller("この調子で頑張んなさいよ");

                            fortune_Result --;
                        }

                        break;

                    case 7 :
                    case 8 :
                    case 9 :
                        if (virgin == true) { //童貞ならこっち
                            Main.cool_Time(2000);
                            Main.fortune_Teller(".");

                            Main.cool_Time(2000);
                            Main.fortune_Teller("..");

                            Main.cool_Time(2200);
                            Main.fortune_Teller("...");

                            Main.cool_Time(2000);
                            Main.fortune_Teller("あんたそれ本当に彼女?");

                            Main.cool_Time(2300);
                            Main.fortune_Teller("あんたは彼女だと思ってるだけで");

                            Main.cool_Time(1900);
                            Main.fortune_Teller("女子側は彼氏だと思ってないと思うよ");

                            Main.cool_Time(2800);
                            Main.fortune_Teller("この童貞拗らせ野郎");

                            fortune_Result += 3;

                        } else { //童貞卒業者
                            Main.cool_Time(1000);
                            Main.fortune_Teller("割と彼女いたのね・・・");

                            Main.cool_Time(2300);
                            Main.fortune_Teller("モテる体質なのねぇ...");

                            Main.cool_Time(2400);
                            Main.fortune_Teller("ふーん・・・");

                            fortune_Result --;
                        }

                        break;

                    case 10 :
                    case 11 :
                    case 12 :
                    case 13 :
                    case 14 :
                        if (virgin == true) { //童貞ならこっち
                            Main.cool_Time(300);
                            Main.fortune_Teller("ダウト!!");

                            Main.cool_Time(2400);
                            Main.fortune_Teller("あんたみたいな奴に彼女がいるわけないじゃん");

                            Main.cool_Time(3000);
                            Main.fortune_Teller("現実を見ようね");

                            fortune_Result += 4;

                        } else { //童貞卒業者
                            Main.cool_Time(1500);
                            Main.fortune_Teller("これがモテ期ってやつなのかね");

                            Main.cool_Time(2100);
                            Main.fortune_Teller("あんたを妬んだ奴が");

                            Main.cool_Time(2000);
                            Main.fortune_Teller("包丁を突きつけて来るかもしれないから");

                            Main.cool_Time(2800);
                            Main.fortune_Teller("気をつけなさいよ");

                            fortune_Result -= 2;
                        }

                        break;

                    case 15 :
                    case 16 :
                    case 17 :
                    case 18 :
                    case 19 :
                    case 20 :
                        if (virgin == true) { //童貞ならこっち
                            Main.cool_Time(1300);
                            Main.fortune_Teller("盛大に盛ったわね");

                            Main.cool_Time(2500);
                            Main.fortune_Teller("ここまで来たら私も許すわよ");

                            Main.cool_Time(2300);
                            Main.fortune_Teller("醜い童貞野郎さん");

                            fortune_Result += 4;

                        } else { //童貞卒業者
                            Main.cool_Time(1500);
                            Main.fortune_Teller("...");

                            Main.cool_Time(3500);
                            Main.fortune_Teller("盛った?");

                            Main.cool_Time(2400);
                            Main.fortune_Teller("何をしたらそんなに彼女が・・・");

                            Main.cool_Time(2800);
                            Main.fortune_Teller("レベルが違うわぁ");

                            fortune_Result --;
                        }

                        break;

                    default :
                        if (virgin == true) {
                            Main.cool_Time(400);
                            Main.fortune_Teller("はいうそー");

                            Main.cool_Time(2000);
                            Main.fortune_Teller("絶対盛ったー");

                            Main.cool_Time(2200);
                            Main.fortune_Teller("自暴自棄になるなって");

                            Main.cool_Time(2700);
                            Main.fortune_Teller("あたしがなんとかしてあげるからさ...");

                            fortune_Result += 10;

                        } else {
                            Main.cool_Time(1700);
                            Main.fortune_Teller("ほんとにぃ?");

                            Main.cool_Time(2000);
                            Main.fortune_Teller("絶対そんなに居ないだろうし");

                            Main.cool_Time(2300);
                            Main.fortune_Teller("もしかしたら童貞卒業も嘘なんじゃないの?");

                            Main.cool_Time(2700);
                            Main.fortune_Teller("あやしいねぇ");

                            fortune_Result += 10;
                        }
                }
            }
            break;
        }

        if (girl_Friend == 0) {
            Main.cool_Time(3000);
            Main.fortune_Teller("なかなか辛かった質問だっただろうけど");

            Main.cool_Time(2400);
            Main.fortune_Teller("まぁ..元気だしな...");

        } else {
            Main.cool_Time(3000);
            Main.fortune_Teller("彼女がいない人を嘲笑ってそうなみなさん");

            Main.cool_Time(3200);
            Main.fortune_Teller("たまにはいない人を労わってあげて下さい");

            Main.cool_Time(3000);
            Main.fortune_Teller("ってこんな棺桶に片足突っ込んでる");

            Main.cool_Time(3000);
            Main.fortune_Teller("老いぼれの戯事は聞いちゃくれないだろうけどね...");
        }


        ///////////////
        // 尋問タイム //
        ///////////////

        Main.cool_Time(4000);
        Main.fortune_Teller("...");

        Main.cool_Time(2500);
        Main.fortune_Teller("次の質問行くよ");


        Main.cool_Time(2000);
        Main.fortune_Teller("5人の中で彼女にするならどの子?");

        Main.cool_Time(4000);
        Main.fortune_Teller("[顔はいいけど性格が悪い子]");

        Main.cool_Time(4200);
        Main.fortune_Teller("[顔はあんまりだけど性格が良い子]");

        Main.cool_Time(4400);
        Main.fortune_Teller("[しっかりしてそうだけど部屋が汚い子]");

        Main.cool_Time(4600);
        Main.fortune_Teller("[ズボラそうだけど部屋が綺麗な子]");

        Main.cool_Time(6000);
        Main.fortune_Teller("それとも...[あ た し]?");

        Main.cool_Time(600);
        System.out.println("[]の中の文字を入力してください");


        ////////////////////
        // 悪趣味度チェック //
        ////////////////////

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

                    girl_Type = string_Answer;
                    fortune_Result += 2; //点数が増えれば増えるほど運が悪くなる

                    break;

                case "NO":
                    Main.cool_Time(1000);
                    Main.fortune_Teller("あんたみたいなやつでも");

                    Main.cool_Time(2200);
                    Main.fortune_Teller("ヤらせてくれる女はいるんだね...");

                    Main.cool_Time(2500);
                    Main.fortune_Teller("かわいそ");

                    virgin = false;

                    break;

                case "":

                    continue;

                default:
                    Main.cool_Time(750);
                    Main.fortune_Teller("[YES] か [NO] で答えろっつってんじゃん!!");

                    Main.cool_Time(1800);
                    Main.fortune_Teller("二択すら答えられない無能が!!!!");

                    Main.cool_Time(2000);
                    Main.fortune_Teller("結局あんたは童貞なの?");

                    continue;
            }
            break;
        }




        //あ た し ？
        //ちょっとよしなさいよ///
        //からかってみただけよ///
        //あんたが良いって言うなら... ﾎﾟｯ///

        //Main.cool_Time(1000);
        //Main.fortune_Teller("ぁたし実わぁ18さぃなんだよね( ´∀｀)");

        //Main.cool_Time(1500);
        //Main.fortune_Teller("そんなに困ってるならヤっちゃう？(●´ω｀●)"); //YESはぼったくられる 凶
    }
}
