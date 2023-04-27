
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;


class HocSinh {
    private String hoTen;
    private String lop;
    private double diemToan;
    private double diemLy;
    private double diemHoa;
    private double diemTB;

    public HocSinh() {}

    public HocSinh(String hoTen, String lop, double diemToan, double diemLy, double diemHoa){
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public void nhapDL(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\tNhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("\tNhap lop: ");
        lop = scanner.nextLine();
        System.out.print("\tNhap diem toan: ");
        diemToan = scanner.nextDouble();
        System.out.print("\tNhap diem ly: ");
        diemLy = scanner.nextDouble();
        System.out.print("\tNhap diem hoa: ");
        diemHoa = scanner.nextDouble();
    }

    public void tinhDTB() {
        diemTB = (3*diemToan + 2*diemLy + diemHoa) / 6;
    }

    public String getHoTen() {return hoTen;}
    public void setHoTen(String hoTen) {this.hoTen = hoTen;}
    public String getLop(){return lop;}
    public void setLop(String lop) {this.lop = lop;}
    public double getDiemToan(){return diemToan;}
    public void setDiemToan(double diemToan) {this.diemToan = diemToan;}
    public double getDiemLy() {return diemLy;}
    public void setDiemLy(double diemLy) {this.diemLy = diemLy;}
    public double getDiemHoa() {return diemHoa;}
    public void setDiemHoa(double diemHoa) {this.diemHoa = diemHoa;}
    public double getDiemTB() {return diemTB;}
}

public class QL_HocSinh {
    private ArrayList<HocSinh> danhSachHocSinh;

    public QL_HocSinh() {
        danhSachHocSinh = new ArrayList<HocSinh>();
    }

    public void nhapDanhSachHocSinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        int m = sc.nextInt();
        sc.nextLine(); // clear buffer
        for (int i = 0; i < m; i++) {
            HocSinh hs = new HocSinh();
            System.out.println("------------hoc sinh ["+(i+1)+"]--------------");
            hs.nhapDL();
            hs.tinhDTB();
            danhSachHocSinh.add(hs);
        }
    }

    public void sapXepDanhSachTheoDTBGiamDan() {
        Collections.sort(danhSachHocSinh, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh hs1, HocSinh hs2) {
                return Double.compare(hs2.getDiemTB(), hs1.getDiemTB());
            }
        });
    }

    public void timKiemHocSinhTheoTen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n---------------------TIM KIEM HOC SINH-------------------");
        System.out.print("Nhap ten hoc sinh can tim kiem: ");
        String ten = sc.nextLine();
        int count = 0;
        for (HocSinh hs : danhSachHocSinh) {
            if (hs.getHoTen().equalsIgnoreCase(ten)) {
                count++;
            }
        }
        System.out.println("Co " + count + " hoc sinh co ten '" + ten + "' trong danh sach.");
    }

    public void hienThiDanhSachHocSinh() {
        System.out.println("\n--------DANH SACH HOC SINH SAP XEP THEO DTB GIAM DAN--------");
        for (HocSinh hs : danhSachHocSinh) {
            System.out.println("\t\tHo va ten: " + hs.getHoTen());
            System.out.println("\t\tLop: " + hs.getLop());
            System.out.println("\t\tDiem Toan: " + hs.getDiemToan());
            System.out.println("\t\tDiem Ly: " + hs.getDiemLy());
            System.out.println("\t\tDiem Hoa: " + hs.getDiemHoa());
            System.out.println("\t\tDiem trung binh: " + hs.getDiemTB());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QL_HocSinh qlhs = new QL_HocSinh();
        qlhs.nhapDanhSachHocSinh();
        qlhs.sapXepDanhSachTheoDTBGiamDan();
        qlhs.timKiemHocSinhTheoTen();
        qlhs.hienThiDanhSachHocSinh();
    }
}


