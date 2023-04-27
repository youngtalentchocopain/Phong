import java.util.Scanner;

public class DemTu{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi can dem so tu: ");
        String str=scanner.nextLine();
        int dem=demTu(str);
        if (dem==-1)
            System.out.println("Chuoi khong hop le !");
        else
            System.out.println("So tu trong chuoi la: " + dem);
        scanner.close();
    }

    public static int demTu(String str){
        if (str==null)
            return -1;
        int dem=0;
        boolean checkdem = true;
        for(int i=0; i<str.length(); i++) 
        {
            if(str.charAt(i)!=' ' && str.charAt(i)!='\t' && str.charAt(i)!='\n')
            {
                if(checkdem)
                {
                    dem++;
                    checkdem = false;
                }
            } else
                checkdem = true;
        }
        return dem;
    }
}
