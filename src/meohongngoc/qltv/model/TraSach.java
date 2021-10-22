package meohongngoc.qltv.model;

import java.util.Date;

/* @author MeoHongNgoc*/

public class TraSach {
    private String ma_doc_gia;
    private Date ngay_tra_chinh_thuc;
    private boolean tinh_trang_hien_tai;
    private float tien_phat;
    private float tien_da_thu;

    public String getMa_doc_gia() {
        return ma_doc_gia;
    }

    public void setMa_doc_gia(String ma_doc_gia) {
        this.ma_doc_gia = ma_doc_gia;
    }

    public Date getNgay_tra_chinh_thuc() {
        return ngay_tra_chinh_thuc;
    }

    public void setNgay_tra_chinh_thuc(Date ngay_tra_chinh_thuc) {
        this.ngay_tra_chinh_thuc = ngay_tra_chinh_thuc;
    }

    public boolean isTinh_trang_hien_tai() {
        return tinh_trang_hien_tai;
    }

    public void setTinh_trang_hien_tai(boolean tinh_trang_hien_tai) {
        this.tinh_trang_hien_tai = tinh_trang_hien_tai;
    }

    public float getTien_phat() {
        return tien_phat;
    }

    public void setTien_phat(float tien_phat) {
        this.tien_phat = tien_phat;
    }

    public float getTien_da_thu() {
        return tien_da_thu;
    }

    public void setTien_da_thu(float tien_da_thu) {
        this.tien_da_thu = tien_da_thu;
    }
    
    
}
