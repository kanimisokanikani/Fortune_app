import java.util.ArrayList;
import java.util.List;

public class Wordban {

    static List<String> ban_Name_List;

    public static String name_Scanner(){

        ban_Name_List = new ArrayList<>();
        ban_Name_Create();

        String get_Name;

        while (true) {
            get_Name = new java.util.Scanner(System.in).nextLine();
            if(ban_Name_Check(get_Name)){ //禁止ワードが含まれていたら メッセージを流して読み取り直し
                System.out.println("そんな名前はあたしが許しまへんで！");
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
        ban_Name_List.add("テスト");
        //ここにどんどん追加していく
    }
}
