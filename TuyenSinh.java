import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Formatter;

class ThiSinh {
    private String soBaoDanh;
    private String hoTen;
    private String diaChi;
    private int uuTien;

    public ThiSinh(String soBaoDanh, String hoTen, String diaChi, int uuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getUuTien() {
        return uuTien;
    }

    public void setUuTien(int uuTien) {
        this.uuTien = uuTien;
    }
}

class ThiSinhKhoiA extends ThiSinh {
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, int uuTien, double diemToan, double diemLy, double diemHoa) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }
}

class ThiSinhKhoiB extends ThiSinh {
    private double diemToan;
    private double diemHoa;
    private double diemSinh;

    public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, int uuTien, double diemToan, double diemHoa, double diemSinh) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
        this.diemToan = diemToan;
        this.diemHoa = diemHoa;
        this.diemSinh = diemSinh;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public double getDiemSinh() {
        return diemSinh;
    }

    public void setDiemSinh(double diemSinh) {
        this.diemSinh = diemSinh;
    }
}

class ThiSinhKhoiC extends ThiSinh {
    private double diemVan;
    private double diemSu;
    private double diemDia;
    public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, int uuTien, double diemVan, double diemSu, double diemDia) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
        this.diemVan = diemVan;
        this.diemSu = diemSu;
        this.diemDia = diemDia;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemSu() {
        return diemSu;
    }

    public void setDiemSu(double diemSu) {
        this.diemSu = diemSu;
    }

    public double getDiemDia() {
        return diemDia;
    }

    public void setDiemDia(double diemDia) {
        this.diemDia = diemDia;
    }
}

public class TuyenSinh {
    private ArrayList<ThiSinhKhoiA> dsThiSinhKhoiA;

    public TuyenSinh() {
        dsThiSinhKhoiA = new ArrayList<>();
    }

    public void themThiSinhKhoiA(ThiSinhKhoiA ts) {
        dsThiSinhKhoiA.add(ts);
    }

    public void hienThiThiSinhKhoiA() {
        Formatter formatter = new Formatter();
        formatter.format("%15s", "So Bao Danh");
        System.out.print(formatter);
        formatter = new Formatter();
        formatter.format("%20s", "Ho Ten");
        System.out.print(formatter);
        formatter = new Formatter();
        formatter.format("%20s", "Dia Chi");
        System.out.print(formatter);
        formatter = new Formatter();
        formatter.format("%10s", "Uu Tien");
        System.out.print(formatter);
        formatter = new Formatter();
        formatter.format("%15s", "Diem Toan");
        System.out.print(formatter);
        formatter = new Formatter();
        formatter.format("%15s", "Diem Ly");
        System.out.print(formatter);
        formatter = new Formatter();
        formatter.format("%15s", "Diem Hoa");
        System.out.print(formatter);
        System.out.println();
        for (ThiSinhKhoiA ts : dsThiSinhKhoiA) {
            formatter = new Formatter();
            formatter.format("%15s", ts.getSoBaoDanh());
            System.out.print(formatter);
            formatter = new Formatter();
            formatter.format("%20s", ts.getHoTen());
            System.out.print(formatter);
            formatter = new Formatter();
            formatter.format("%20s", ts.getDiaChi());
            System.out.print(formatter);
            formatter = new Formatter();
            formatter.format("%10d", ts.getUuTien());
            System.out.print(formatter.toString());
            formatter = new Formatter();
            formatter.format("           %.2f", ts.getDiemToan());
            System.out.print(formatter.toString());
            formatter = new Formatter();
            formatter.format("           %.2f", ts.getDiemLy());
            System.out.print(formatter.toString());
            formatter = new Formatter();
            formatter.format("           %.2f", ts.getDiemHoa());
            System.out.print(formatter.toString());
            System.out.println();
        }
    }

    public void nhapThiSinhKhoiA() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------NHAP THI SINH---------------------");
        System.out.print("Nhap so luong thi sinh khoi A: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); // bo dong chua enter

        for (int i = 0; i < soLuong; i++) {
            System.out.println();
            System.out.println("--------->Nhap thong tin thi sinh khoi A thu " + (i + 1) + ":");
            System.out.print("\tNhap so bao danh: ");
            String soBaoDanh = scanner.nextLine();
            System.out.print("\tNhap ho ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("\tNhap dia chi: ");
            String diaChi = scanner.nextLine();
            System.out.print("\tNhap uu tien: ");
            int uuTien = scanner.nextInt();
            System.out.print("\tNhap diem toan: ");
            double diemToan = scanner.nextDouble();
            System.out.print("\tNhap diem ly: ");
            double diemLy = scanner.nextDouble();
            System.out.print("\tNhap diem hoa: ");
            double diemHoa = scanner.nextDouble();
            scanner.nextLine(); // bo dong chua enter

            ThiSinhKhoiA ts = new ThiSinhKhoiA(soBaoDanh, hoTen, diaChi, uuTien, diemToan, diemLy, diemHoa);
            themThiSinhKhoiA(ts);
        }
    }

    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh();
        tuyenSinh.nhapThiSinhKhoiA();
        System.out.println("----------------DANH SACH THI SINH-------------------");
        System.out.println("Danh sach thi sinh khoi A:");
        tuyenSinh.hienThiThiSinhKhoiA();
    }
}

