 package meohongngoc.qltv.controller;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import meohongngoc.qltv.model.DocGia;
import meohongngoc.qltv.service.DocGiaService;
import meohongngoc.qltv.service.DocGiaServiceImpl;

/* @author MeoHongNgoc*/

public class DocGiaController {
    private JButton btnSubmit;
    private JTextField jtfMDG;
    private JTextField jtfNameDG;
    private JTextField jtfDiaChiDG;
    private JTextField jtfPhoneNDG;
    private JDateChooser jdobDG;
    private JDateChooser jdcJoinIn;
    private JRadioButton jrbNam;
    private JRadioButton jrbNu;
    private JCheckBox jcbTinhTrang;
    private JTextArea jtaChuThich;
    private JLabel jlMsg;
    
    private DocGia docGia;
    
    private DocGiaService docGiaService = null;

    public DocGiaController(JButton btnSubmit, JTextField jtfMDG, 
            JTextField jtfNameDG, JTextField jtfDiaChiDG, 
            JTextField jtfPhoneNDG, JDateChooser jdobDG, 
            JDateChooser jdcJoinIn, JRadioButton jrbNam, 
            JRadioButton jrbNu, JCheckBox jcbTinhTrang, 
            JTextArea jtaChuThich, JLabel jlMsg) {
        this.btnSubmit = btnSubmit;
        this.jtfMDG = jtfMDG;
        this.jtfNameDG = jtfNameDG;
        this.jtfDiaChiDG = jtfDiaChiDG;
        this.jtfPhoneNDG = jtfPhoneNDG;
        this.jdobDG = jdobDG;
        this.jdcJoinIn = jdcJoinIn;
        this.jrbNam = jrbNam;
        this.jrbNu = jrbNu;
        this.jcbTinhTrang = jcbTinhTrang;
        this.jtaChuThich = jtaChuThich;
        this.jlMsg = jlMsg;
        
        this.docGiaService = new DocGiaServiceImpl();
    }

    

    public void setView(DocGia docGia){
        this.docGia = docGia;
        jtfMDG.setText("#" + docGia.getMa_doc_gia());
        jtfNameDG.setText(docGia.getHo_va_ten_dg());
        jdobDG.setDate(docGia.getNgay_sinh_dg());
        jdcJoinIn.setDate(docGia.getNgay_tham_gia());
        if(docGia.isGioi_tinh_dg()){
            jrbNam.setSelected(true);
            jrbNu.setSelected(false);
        }else{
            jrbNam.setSelected(false);
            jrbNu.setSelected(true );
        }
        jcbTinhTrang.setSelected(docGia.isTinh_trang_dg());
        jtfDiaChiDG.setText(docGia.getDia_chi_dg());
        jtfPhoneNDG.setText(docGia.getSo_dien_thoai());
        
    }
    
    public void setEvent(){
        btnSubmit.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                if(jtfNameDG.getText().length() == 0 || jdobDG.getDate() == null){
                    jlMsg.setText("Vui Lòng nhận dữ liệu bắt buộc !!");
                }else{
                    docGia.setHo_va_ten_dg(jtfNameDG.getText());
                    docGia.setNgay_sinh_dg(covertDateToDateSql(jdobDG.getDate()));
                    docGia.setNgay_tham_gia(covertDateToDateSql(jdcJoinIn.getDate()));
                    docGia.setSo_dien_thoai(jtfPhoneNDG.getText());
                    docGia.setDia_chi_dg(jtfDiaChiDG.getText());
                    docGia.setGioi_tinh_dg(jrbNam.isSelected());
                    docGia.setTinh_trang_dg(jcbTinhTrang.isSelected());
                    if (showDialog()) {
                           int lastID = docGiaService.createrOrUpdate(docGia);
                            if (lastID != 0 ) {
                                docGia.setMa_doc_gia(lastID);
                                jtfMDG.setText("#" + lastID);
                                jlMsg.setText("Xử lý và Cập nhập dữ liệu thành công !!");
                            }else{
                                jlMsg.setText("Có lỗi xảy ra, vui lòng thử lại!");
                            }
                        }
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnSubmit.setBackground(new Color(0,200,83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSubmit.setBackground(new Color(100,221,23));
            }        
        });
        
    }
   

    private boolean showDialog() {
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "Bạn muốn cập nhật dữ liệu hay không?", "Thông báo", 
                JOptionPane.YES_NO_OPTION);
        return dialogResult == JOptionPane.YES_OPTION;
    }
    
    public java.sql.Date covertDateToDateSql(Date d) {
        return new java.sql.Date(d.getTime());
    }
    
}
