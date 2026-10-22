public class DonHang {
    private String tenKhach;
    private SanPham sanPham; // Truyền đối tượng SanPham vào đơn hàng
    private int soLuong;

    public DonHang(String tenKhach, SanPham sanPham, int soLuong) {
        this.tenKhach = tenKhach;
        this.sanPham = sanPham;
        if (soLuong < 1) {
            this.soLuong = 1;
        } else {
            this.soLuong = soLuong;
        }
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong < 1) {
            this.soLuong = 1;
        } else {
            this.soLuong = soLuong;
        }
    }

    public double tinhThanhTien() {
        double thanhTien = sanPham.getDonGia() * soLuong;
        if (soLuong >= 5) {
            thanhTien *= 0.9; // Giảm 10%
        }
        return thanhTien;
    }

    public void inDonHang() {
        System.out.printf("%-7s %-18s %-4d %,10.0f%n",
                tenKhach, sanPham.getTenSP(), soLuong, tinhThanhTien());
        if (soLuong >= 5) {
            System.out.println("       (giảm 10%)");
        }
    }
}
