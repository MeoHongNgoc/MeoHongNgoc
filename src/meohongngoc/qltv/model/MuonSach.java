package meohongngoc.qltv.model;

import java.util.Date;

/*@author MeoHongNgoc*/

public class MuonSach {
    private String ma_doc_gia;
    private String ma_sach;
    private String ten_sach;
    private Date ngay_muon;
    private Date ngay_tra_du_kien;
    private int so_luong_sach_muon;
    private float gia_thue;

    public String getMa_doc_gia() {
        return ma_doc_gia;
    }

    public void setMa_doc_gia(String ma_doc_gia) {
        this.ma_doc_gia = ma_doc_gia;
    }

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

    public Date getNgay_muon() {
        return ngay_muon;
    }

    public void setNgay_muon(Date ngay_muon) {
        this.ngay_muon = ngay_muon;
    }

    public Date getNgay_tra_du_kien() {
        return ngay_tra_du_kien;
    }

    public void setNgay_tra_du_kien(Date ngay_tra_du_kien) {
        this.ngay_tra_du_kien = ngay_tra_du_kien;
    }

    public int getSo_luong_sach_muon() {
        return so_luong_sach_muon;
    }

    public void setSo_luong_sach_muon(int so_luong_sach_muon) {
        this.so_luong_sach_muon = so_luong_sach_muon;
    }

    public float getGia_thue() {
        return gia_thue;
    }

    public void setGia_thue(float gia_thue) {
        this.gia_thue = gia_thue;
    }
    
    
}
