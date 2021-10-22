
package meohongngoc.qltv.model;

import java.util.Date;

/*@author MeoHongNgoc*/

public class DocGia {
    private int ma_doc_gia;
    private String ho_va_ten_dg;
    private Date ngay_sinh_dg;
    private Date ngay_tham_gia;
    private String dia_chi_dg;
    private String so_dien_thoai;
    private boolean gioi_tinh_dg;
    private boolean  tinh_trang_dg;

    public int getMa_doc_gia() {
        return ma_doc_gia;
    }

    public void setMa_doc_gia(int ma_doc_gia) {
        this.ma_doc_gia = ma_doc_gia;
    }

    public String getHo_va_ten_dg() {
        return ho_va_ten_dg;
    }

    public void setHo_va_ten_dg(String ho_va_ten_dg) {
        this.ho_va_ten_dg = ho_va_ten_dg;
    }

    public Date getNgay_sinh_dg() {
        return ngay_sinh_dg;
    }

    public void setNgay_sinh_dg(Date ngay_sinh_dg) {
        this.ngay_sinh_dg = ngay_sinh_dg;
    }

    public Date getNgay_tham_gia() {
        return ngay_tham_gia;
    }

    public void setNgay_tham_gia(Date ngay_tham_gia) {
        this.ngay_tham_gia = ngay_tham_gia;
    }

    public String getDia_chi_dg() {
        return dia_chi_dg;
    }

    public void setDia_chi_dg(String dia_chi_dg) {
        this.dia_chi_dg = dia_chi_dg;
    }

    public String getSo_dien_thoai() {
        return so_dien_thoai;
    }

    public void setSo_dien_thoai(String so_dien_thoai) {
        this.so_dien_thoai = so_dien_thoai;
    }

    public boolean isGioi_tinh_dg() {
        return gioi_tinh_dg;
    }

    public void setGioi_tinh_dg(boolean gioi_tinh_dg) {
        this.gioi_tinh_dg = gioi_tinh_dg;
    }

    public boolean isTinh_trang_dg() {
        return tinh_trang_dg;
    }

    public void setTinh_trang_dg(boolean tinh_trang_dg) {
        this.tinh_trang_dg = tinh_trang_dg;
    }
    
    
    
}
