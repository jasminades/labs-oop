import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        HashMap<String, String> nicknameMap = new HashMap<>();

        nicknameMap.put("matti", "mage");
        nicknameMap.put("mikael", "mixu");
        nicknameMap.put("arto","arppa");

        String mikaelNickname = nicknameMap.get("mikael");
        System.out.println("Mikael's nickname is: " + mikaelNickname);
    }
}