package meohongngoc.qltv.model;

import java.util.Date;

/* @author MeoHongNgoc*/

public class Sach {
    private String ma_sach;
    private String ten_sach;
    private String dau_sach;
    private String ma_tac_gia;
    private String ten_nha_xuat_ban;
    private Date thoi_gian_xuat_ban;
    private float gia_thue_sach;
    private float gia_tri_sach;
    private boolean trang_thai_sach;
    private boolean tinh_tranh_sach;
    private int so_luong_ban_dau;
    private int so_luong_hien_tai;

    public String getMa_sach() {
        return ma_sach;
    }

    public void setMa_sach(String ma_sach) {
        this.ma_sach = ma_sach;
    }

    public String getTen_sach() {
        return ten_sach;
    }

    public void setTen_sach(String ten_sach) {
        this.ten_sach = ten_sach;
    }

    public String getDau_sach() {
        return dau_sach;
    }

    public void setDau_sach(String dau_sach) {
        this.dau_sach = dau_sach;
    }

    public String getMa_tac_gia() {
        return ma_tac_gia;
    }

    public void setMa_tac_gia(String ma_tac_gia) {
        this.ma_tac_gia = ma_tac_gia;
    }

    public String getTen_nha_xuat_ban() {
        return ten_nha_xuat_ban;
    }

    public void setTen_nha_xuat_ban(String ten_nha_xuat_ban) {
        this.ten_nha_xuat_ban = ten_nha_xuat_ban;
    }

    public Date getThoi_gian_xuat_ban() {
        return thoi_gian_xuat_ban;
    }

    public void setThoi_gian_xuat_ban(Date thoi_gian_xuat_ban) {
        this.thoi_gian_xuat_ban = thoi_gian_xuat_ban;
    }

    public float getGia_thue_sach() {
        return gia_thue_sach;
    }

    public void setGia_thue_sach(float gia_thue_sach) {
        this.gia_thue_sach = gia_thue_sach;
    }

    public float getGia_tri_sach() {
        return gia_tri_sach;
    }

    public void setGia_tri_sach(float gia_tri_sach) {
        this.gia_tri_sach = gia_tri_sach;
    }

    public boolean isTrang_thai_sach() {
        return trang_thai_sach;
    }

    public void setTrang_thai_sach(boolean trang_thai_sach) {
        this.trang_thai_sach = trang_thai_sach;
    }

    public boolean isTinh_tranh_sach() {
        return tinh_tranh_sach;
    }

    public void setTinh_tranh_sach(boolean tinh_tranh_sach) {
        this.tinh_tranh_sach = tinh_tranh_sach;
    }

    public int getSo_luong_ban_dau() {
        return so_luong_ban_dau;
    }

    public void setSo_luong_ban_dau(int so_luong_ban_dau) {
        this.so_luong_ban_dau = so_luong_ban_dau;
    }

    public int getSo_luong_hien_tai() {
        return so_luong_hien_tai;
    }

    public void setSo_luong_hien_tai(int so_luong_hien_tai) {
        this.so_luong_hien_tai = so_luong_hien_tai;
    }
    
    
}
