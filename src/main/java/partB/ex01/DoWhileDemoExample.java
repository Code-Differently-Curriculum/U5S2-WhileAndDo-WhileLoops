package partB.ex01;

public class DoWhileDemoExample {
    public static void main(String[] args) {
        int i=1;
        do
        {
            if(i%2==1)
                System.out.print(" "+i);
            i++;
        }while(i<21);
    }
}
