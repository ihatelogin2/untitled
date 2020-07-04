
public class Stos {
    int[] tab = new int[10];
    int wskaznik = 0;


    public void push(int number) {
        tab[wskaznik] = number;
        wskaznik++;
    }

    public int pop() {
        int number2 = 0;
        if (wskaznik > 0) {
            number2 = tab[--wskaznik];
        }
        return number2;
    }
    public void peek(){
        System.out.println(tab[--wskaznik]);
    }

}
