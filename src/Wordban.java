import java.util.ArrayList;
import java.util.List;

public class Wordban {

    static List<String> ban_Name_List;

    public static void name_Scanner(String set_name){

        ban_Name_List = new ArrayList<>();
        ban_Name_Create();

        if(ban_Name_Check(set_name)){ //禁止ワードが含まれていたら メッセージを流して読み取り直し
            System.out.println("そんな名前はあたしが許しまへんで！");
            return; //メソッドを切り上げる
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
        ban_Name_List.add("テスト");
        //ここにどんどん追加していく
    }
}
