package meohongngoc.qltv.dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import meohongngoc.qltv.model.DocGia;

/**
 *
 * @author MeoHongNgoc
 */
public class DocGiaDAOImpl implements DocGiaDAO{

    @Override
    public List<DocGia> getList() {
        try {
            Connection cons = DBConnect.getConnection();
            String sql = "SELECT *FROM [dbo].[tblDocGia]";
            List<DocGia> list = new ArrayList<>();
            PreparedStatement ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DocGia docgia =new DocGia();
                docgia.setMa_doc_gia(rs.getInt("ma_doc_gia"));
                docgia.setHo_va_ten_dg(rs.getString("ho_va_ten_dg"));
                docgia.setNgay_sinh_dg(rs.getDate("ngay_sinh_dg"));
                docgia.setNgay_tham_gia(rs.getDate("ngay_tham_gia"));
                docgia.setDia_chi_dg(rs.getString("dia_chi_dg")); 
                docgia.setSo_dien_thoai(rs.getString("so_dien_thoai"));
                docgia.setGioi_tinh_dg( rs.getBoolean("gioi_tinh_dg"));
                docgia.setTinh_trang_dg(rs.getBoolean("tinh_trang_dg"));
                
                
                list.add(docgia);
            }
            ps.close();
            rs.close();
            cons.close();
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
     }
    
    public static void main(String[] args) {
         new DocGiaDAOImpl();
    }

    @Override
    public int createrOrUpdate(DocGia docGia) {
        try {
            Connection cons = DBConnect.getConnection();
            String sql = "INSERT INTO tblDocGia VALUES(?,?,?,?,?,?,?,?);";
            PreparedStatement ps = cons.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, docGia.getMa_doc_gia());
            ps.setString(2, docGia.getHo_va_ten_dg());
            ps.setDate(3, (java.sql.Date) docGia.getNgay_sinh_dg());
            ps.setDate(4, (java.sql.Date) docGia.getNgay_tham_gia());
            ps.setString(5, docGia.getDia_chi_dg());
            ps.setString(6, docGia.getSo_dien_thoai());
            ps.setBoolean(7, docGia.isGioi_tinh_dg());
            ps.setBoolean(8, docGia.isTinh_trang_dg());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            int generatedKey = 0;
            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }
            ps.close();
            cons.close();
            return generatedKey;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }
  
}
