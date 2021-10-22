package meohongngoc.qltv.model;

import java.util.Date;

/* @author MeoHongNgoc*/

public class Nhanvien {
    private String ma_nhan_vien;
    private String ho_va_ten_nv;
    private String chuc_vu;
    private Date ngay_sinh_nv;
    private String dia_tri_nv;
    private boolean gioi_tinh_nv;
    private boolean tinh_trang_nv;

    public String getMa_nhan_vien() {
        return ma_nhan_vien;
    }

    public void setMa_nhan_vien(String ma_nhan_vien) {
        this.ma_nhan_vien = ma_nhan_vien;
    }

    public String getHo_va_ten_nv() {
        return ho_va_ten_nv;
    }

    public void setHo_va_ten_nv(String ho_va_ten_nv) {
        this.ho_va_ten_nv = ho_va_ten_nv;
    }

    public String getChuc_vu() {
        return chuc_vu;
    }

    public void setChuc_vu(String chuc_vu) {
        this.chuc_vu = chuc_vu;
    }

    public Date getNgay_sinh_nv() {
        return ngay_sinh_nv;
    }

    public void setNgay_sinh_nv(Date ngay_sinh_nv) {
        this.ngay_sinh_nv = ngay_sinh_nv;
    }

    public String getDia_tri_nv() {
        return dia_tri_nv;
    }

    public void setDia_tri_nv(String dia_tri_nv) {
        this.dia_tri_nv = dia_tri_nv;
    }

    public boolean isGioi_tinh_nv() {
        return gioi_tinh_nv;
    }

    public void setGioi_tinh_nv(boolean gioi_tinh_nv) {
        this.gioi_tinh_nv = gioi_tinh_nv;
    }

    public boolean isTinh_trang_nv() {
        return tinh_trang_nv;
    }

    public void setTinh_trang_nv(boolean tinh_trang_nv) {
        this.tinh_trang_nv = tinh_trang_nv;
    }
    
    
}
