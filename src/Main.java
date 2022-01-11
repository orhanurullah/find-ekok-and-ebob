import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("EBOB ve EKOK Bulan Program");
        int first, second;
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk Sayıyı Girin : ");
        first = scanner.nextInt();
        System.out.print("İkinci Sayıyı Girin : ");
        second = scanner.nextInt();

        System.out.println("*********EBOB********");
        Main main = new Main();
        int ebob = main.findEbob(first, second);
        int ekok = main.findEkok(first,second);
        System.out.println("EBOB : " + ebob);
        System.out.println("EKOK : " + ekok);

        /**
         * While ile Yapımı
         */
        int wEbob = main.findEbobWithWhile(first,second);
        int wEkok = main.findEkokWithWhile(first,second);
        System.out.println("****************");
        System.out.println("While EBOB : " + wEbob);
        System.out.println("While EKOK : " + wEkok);

    }

    public int findEbobWithWhile(int first, int second){
        int ebob = 1;
        int temp = first;
        while(temp > 1){
            if(first%temp == 0 && second%temp == 0){
                ebob = temp;
                break;
            }
            temp--;
        }
        return ebob;
    }

    public int findEkokWithWhile(int first, int second){
        int ekok = 1;
        int temp = 1;
        while(temp < (first * second)){
            if(temp%first == 0 && temp%second == 0){
                ekok = temp;
                break;
            }
            temp++;
        }
        return ekok;
    }
    public int findEbob(int first, int second){
        int ebob = 1;
        for(int i = first; i > 1; i--){
            if(first%i == 0 && second%i == 0){
                ebob = i;
                break;
            }
        }
        return ebob;
    }

    public int findEkok(int first, int second){
        int ekok = 1;
        for(int i = 1; i <= (first * second); i++){
            if(i%first == 0 && i%second == 0){
                ekok = i;
                break;
            }
        }
        return ekok;
    }
}
