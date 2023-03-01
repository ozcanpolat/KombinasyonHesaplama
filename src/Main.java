import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,r;
        int totalN=1,totalR=1,totalNR=1, total, k;
        Scanner input= new Scanner(System.in);
        System.out.print("Eleman sayısını girin :");
        n=input.nextInt();
        System.out.print("Seçim sayısını girin :");
        r=input.nextInt();
//C(n,r) = n! / (r! * (n-r)!)
        for(int i=1 ; i<=n; i++){
           totalN=totalN*i;
        }

        for(int j=1; j<=r; j++){
            totalR=totalR*j;
        }

        k=n-r;
        for(int l=1; l<=k;l++){
            totalNR*=l;
        }
        total=totalN/(totalR*totalNR);
        System.out.println("C(" + n + "," + r + ") = " + total);
    }
}
