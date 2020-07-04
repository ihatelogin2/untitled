import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class Exercise5 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nawiasy");
        String string = scanner.nextLine();
        char[] chars = string.toCharArray();

        Deque<Character> stack = new ArrayDeque();

        for(int i = 0; i <= chars.length-1; i++){
            if (chars[i] == '('){
                stack.push(chars[i]);
            }
            else if (chars[i] == ')'){
                stack.pop();
            }
        }
        if (stack.size()== 0){
            System.out.println("Jest okej");
        }else{
            System.out.println("Nie jest okej");
        }

    }
}


