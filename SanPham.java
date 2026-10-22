public class SanPham {
    private String maSP;
    private String tenSP;
    private double donGia;
    private int soLuongTon;

    public SanPham() {
    }

    public SanPham(String maSP,String tenSP){
        this.maSP=maSP;
        this.tenSP=tenSP;
    }

    public SanPham(String maSP,String tenSP,double donGia,int soLuongTon){
        this.maSP=maSP;
        this.tenSP=tenSP;
        this.donGia=donGia;
        this.soLuongTon=soLuongTon;
    }

    public String getMaSP(){
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public void hienThi() {
        System.out.printf("%-6s %-18s %,10.0f  tồn %d%n", maSP, tenSP, donGia, soLuongTon);
    }
}
