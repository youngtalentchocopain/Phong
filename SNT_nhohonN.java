import java.util.Scanner;

public class SNT_nhohonN{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Nhap mot so nguyen: ");
        int n=input.nextInt();
        input.close();

        System.out.println("Cac so nguyen to nho hon hoac bang " + n + " la:");
        for(int i=2; i<=n; i++)
            if (ktraSNT(i))
                System.out.print(i+" ");
    }

    // Hàm kiểm tra 1 số là SNT hay không
    public static boolean ktraSNT(int x){
        if(x<=1)
            return false;
        for(int i=2; i<=Math.sqrt(x); i++)
            if (x%i==0)
                return false;
        return true;
    }
}
