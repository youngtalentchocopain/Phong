import java.util.Scanner;

public class SinhVien {
    private String soBaoDanh;
    private String hoTen;
    private String diaChi;
    private String monHoc;
    private double diemHocKi1;
    private double diemHocKi2;

    public SinhVien(String soBaoDanh, String hoTen, String diaChi, String monHoc, double diemHocKi1, double diemHocKi2) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.monHoc = monHoc;
        this.diemHocKi1 = diemHocKi1;
        this.diemHocKi2 = diemHocKi2;
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

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public double getDiemHocKi1() {
        return diemHocKi1;
    }

    public void setDiemHocKi1(double diemHocKi1) {
        this.diemHocKi1 = diemHocKi1;
    }

    public double getDiemHocKi2() {
        return diemHocKi2;
    }

    public void setDiemHocKi2(double diemHocKi2) {
        this.diemHocKi2 = diemHocKi2;
    }
}
