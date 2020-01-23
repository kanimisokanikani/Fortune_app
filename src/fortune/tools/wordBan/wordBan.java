package fortune.tools.wordBan;

import fortune.main.Main; //FQCNのインポート Main Classを使用する時に使う
import java.util.ArrayList;
import java.util.List;

public class wordBan {

    static List<String> ban_Name_List;

    public static String name_Scanner(String name_Parts) throws InterruptedException {

        ban_Name_List = new ArrayList<>();
        ban_Name_Create();

        String get_Name;

        while (true) {
            get_Name = new java.util.Scanner(System.in).nextLine();
            if (get_Name.equals("")) {
                continue;
            }

            if (ban_Name_Check(get_Name)) { //禁止ワードが含まれていたら メッセージを流して読み取り直し
                Main.cool_Time(200);
                Main.fortune_Teller("そんな" + name_Parts + "はあたしが許しまへんで!");

                Main.cool_Time(1800);
                Main.fortune_Teller("もう一度考え直しな!!");

                Main.cool_Time(1500);
                Main.fortune_Teller("あんたの" + name_Parts + "はなんなのよ");
                continue;
            } else {
                return get_Name; //メソッドを切り上げる
            }
        }
    }

    public static boolean ban_Name_Check(String name){
        for(String ban_Word: ban_Name_List) {
            if(name.contains(ban_Word)){
                return true; //trueが帰ってきたらNG
            }
        }
        return false; //falseが帰ってきたらOK
    }

    public static void ban_Name_Create(){
        ban_Name_List.add(" ");
        ban_Name_List.add(";");
        ban_Name_List.add(":");
        ban_Name_List.add("!");
        ban_Name_List.add("#");
        ban_Name_List.add("$");
        ban_Name_List.add("%");
        ban_Name_List.add("&");
        ban_Name_List.add("'");
        ban_Name_List.add("(");
        ban_Name_List.add(")");
        ban_Name_List.add("=");
        ban_Name_List.add("-");
        ban_Name_List.add("~");
        ban_Name_List.add("^");
        ban_Name_List.add("|");
        ban_Name_List.add("¥");
        ban_Name_List.add("`");
        ban_Name_List.add("@");
        ban_Name_List.add("{");
        ban_Name_List.add("}");
        ban_Name_List.add("[");
        ban_Name_List.add("]");
        ban_Name_List.add("「");
        ban_Name_List.add("」");
        ban_Name_List.add("*");
        ban_Name_List.add("+");
        ban_Name_List.add("_");
        ban_Name_List.add("?");
        ban_Name_List.add("/");
        ban_Name_List.add(">");
        ban_Name_List.add(".");
        ban_Name_List.add("<");
        ban_Name_List.add(",");
        ban_Name_List.add("1");
        ban_Name_List.add("2");
        ban_Name_List.add("3");
        ban_Name_List.add("4");
        ban_Name_List.add("5");
        ban_Name_List.add("6");
        ban_Name_List.add("7");
        ban_Name_List.add("8");
        ban_Name_List.add("9");
        ban_Name_List.add("0");
        ban_Name_List.add("！");
        ban_Name_List.add("”");
        ban_Name_List.add("＃");
        ban_Name_List.add("＄");
        ban_Name_List.add("％");
        ban_Name_List.add("＆");
        ban_Name_List.add("’");
        ban_Name_List.add("（");
        ban_Name_List.add("）");
        ban_Name_List.add("＝");
        ban_Name_List.add("ー");
        ban_Name_List.add("〜");
        ban_Name_List.add("＾");
        ban_Name_List.add("｜");
        ban_Name_List.add("￥");
        ban_Name_List.add("｀");
        ban_Name_List.add("＠");
        ban_Name_List.add("『");
        ban_Name_List.add("「");
        ban_Name_List.add("』");
        ban_Name_List.add("」");
        ban_Name_List.add("＋");
        ban_Name_List.add("；");
        ban_Name_List.add("＊");
        ban_Name_List.add("：");
        ban_Name_List.add("＿");
        ban_Name_List.add("？");
        ban_Name_List.add("・");
        ban_Name_List.add("＞");
        ban_Name_List.add("。");
        ban_Name_List.add("＜");
        ban_Name_List.add("、");
        ban_Name_List.add("１");
        ban_Name_List.add("２");
        ban_Name_List.add("３");
        ban_Name_List.add("４");
        ban_Name_List.add("５");
        ban_Name_List.add("６");
        ban_Name_List.add("７");
        ban_Name_List.add("８");
        ban_Name_List.add("９");
        ban_Name_List.add("０");
        ban_Name_List.add("\""); //禁止する文字なんてほぼ無限にあるので諦めた
        //ここにどんどん追加していく
    }
}