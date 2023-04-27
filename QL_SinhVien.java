import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SVien{
    private String hoTen;
    private int namSinh;
    private String lop;
    private float diemTB;

    public SVien(){}

    public SVien(String hoTen, int namSinh, String lop, float diemTB){
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.lop = lop;
        this.diemTB = diemTB;
    }

    public String getHoTen(){return hoTen;}
    public void setHoTen(String hoTen){this.hoTen = hoTen;}

    public int getNamSinh(){return namSinh;}
    public void setNamSinh(int namSinh){this.namSinh = namSinh;}

    public String getLop(){return lop;}
    public void setLop(String lop){this.lop = lop;}

    public float getDiemTB(){return diemTB;}
    public void setDiemTB(float diemTB){this.diemTB = diemTB;}

    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten sinh vien: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        namSinh = sc.nextInt();
        sc.nextLine(); // đọc ký tự xuống dòng "\n" và bỏ qua nó
        System.out.print("Nhap lop: ");
        lop = sc.nextLine();
        System.out.print("Nhap diem trung binh: ");
        diemTB = sc.nextFloat();
    }

    public void hienThiTT(){
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Lop: " + lop);
        System.out.println("Diem trung binh: " + diemTB);
    }
}

class QL_SinhVien{
    private ArrayList<SVien> dsSinhVien;

    public QL_SinhVien() {
        dsSinhVien = new ArrayList<SVien>();
    }

    public void nhapDanhSach() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine(); // bo qua ky tu xuong dong
        for (int i = 0; i < n; i++)
        {
            System.out.println();
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            SVien sv = new SVien();
            sv.nhapTT();
            dsSinhVien.add(sv);
        }
    }

    public void hienThiDanhSach() {
        Collections.sort(dsSinhVien, new Comparator<SVien>() {
            @Override
            public int compare(SVien sv1, SVien sv2) {
                return Float.compare(sv2.getDiemTB(), sv1.getDiemTB());
            }
        });
    }
    public void hienThiTT() {
        System.out.println("---------------------------------------------------------");
        System.out.println("Danh sach sinh vien theo thu tu diem trung binh giam dan:");
        for (SVien sv : dsSinhVien) {
            sv.hienThiTT();
            System.out.println();
        }
    }
    public static void main(String[] args) {
        QL_SinhVien qlsv = new QL_SinhVien();
        qlsv.nhapDanhSach();
        qlsv.hienThiDanhSach();
        qlsv.hienThiTT();
    }
}
