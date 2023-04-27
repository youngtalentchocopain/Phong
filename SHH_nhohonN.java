import java.util.Scanner;

public class SHH_nhohonN{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Nhap mot so nguyen: ");
        int n=input.nextInt();
        input.close();

        System.out.println("Cac so hoan hao nho hon hoac bang " + n + " la:");
        for(int i=1; i<=n; i++)
            if (ktraSHH(i))
                System.out.print(i+" ");
    }

    // Hàm kiểm tra xem một số có phải số hoàn hảo hay không
    public static boolean ktraSHH(int x){
        int sum=0;
        for(int i=1; i<x; i++)
            if(x%i==0)
                sum += i;
        return sum==x;
    }
}
