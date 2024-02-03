package feb3;

public class ReverseString {
    public static void main(String[] args) {

        String s1 = "pragra";
        char[] ch =s1.toCharArray();
        for(int i = ch.length -1 ; i >=0 ;i--){
            System.out.print(ch[i]);
        }
    }
}
