 package meohongngoc.qltv.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
 import meohongngoc.qltv.model.DocGia;
import javax.swing.event.DocumentEvent;
import javax.swing.table.TableRowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.DocumentListener;
import meohongngoc.qltv.service.DocGiaService;
import meohongngoc.qltv.utility.ClassTableModel;
import meohongngoc.qltv.service.DocGiaServiceImpl;
import meohongngoc.qltv.view.QLDocGiaJFrame;

/**
 *
 * @author MeoHongNgoc
 */

public class QuanLyDocGiaController {
    
    private JPanel jnpView;
    private JButton btnAdd;
    private JTextField jtfSearch;
    
    private DocGiaService docGiaService = null;
    private  String[] listColumn = {"STT","Mã Đọc Giả","Họ và Tên","Ngày Sinh ",
    "Ngày Tham Gia","Địa Chỉ","Số Điện Thoại",
    "Giới Tính","Tình Trạng"};
    
    private TableRowSorter<TableModel> rowSorter = null;

    public QuanLyDocGiaController(JPanel jnpView, JButton btnAdd, JTextField jtfSearch) {
        this.jnpView = jnpView;
        this.btnAdd = btnAdd;
        this.jtfSearch = jtfSearch;
        
        this.docGiaService = new DocGiaServiceImpl();
        
    }
    public void SetDateToTable(){
        List<DocGia> listItem = docGiaService.getList();
        DefaultTableModel model = new ClassTableModel().setTableDocGia(listItem, listColumn);
        JTable table = new JTable(model);
        
        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);
        
        jtfSearch.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                String  text = jtfSearch.getText();
                if(text.trim().length() == 0 ){
                    rowSorter.setRowFilter(null);
                }else{
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String  text = jtfSearch.getText();
                if(text.trim().length() == 0 ){
                    rowSorter.setRowFilter(null);
                }else{
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
            
        });
        
        table.getColumnModel().getColumn(0).setMinWidth(30);
        table.getColumnModel().getColumn(0).setMaxWidth(30);
        table.getColumnModel().getColumn(0).setPreferredWidth(30);
        
        
        table.getColumnModel().getColumn(1).setMinWidth(80);
        table.getColumnModel().getColumn(1).setMaxWidth(80);
        table.getColumnModel().getColumn(1).setPreferredWidth(80);
        
        table.getColumnModel().getColumn(2).setMinWidth(150);
        table.getColumnModel().getColumn(2).setMaxWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(150);
        
        table.getColumnModel().getColumn(7).setMinWidth(60);
        table.getColumnModel().getColumn(7).setMaxWidth(60);
        table.getColumnModel().getColumn(7).setPreferredWidth(60);
        
        table.getColumnModel().getColumn(8).setMinWidth(60);
        table.getColumnModel().getColumn(8).setMaxWidth(60);
        table.getColumnModel().getColumn(8).setPreferredWidth(60);

     table.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() == 2 && table.getSelectedRow() != -1){
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    int selectedRowIndex = table.getSelectedRow();
                    selectedRowIndex = table.convertColumnIndexToModel(selectedRowIndex);
                    System.out.println("selectedRowIndex");
                    
                    DocGia docGia = new DocGia();
                    docGia.setMa_doc_gia((int) model.getValueAt(selectedRowIndex, 1));
                    docGia.setHo_va_ten_dg((String) model.getValueAt(selectedRowIndex, 2));
                    docGia.setNgay_sinh_dg((Date) model.getValueAt(selectedRowIndex, 3));
                    docGia.setNgay_tham_gia((Date) model.getValueAt(selectedRowIndex, 4));
                    docGia.setDia_chi_dg(model.getValueAt(selectedRowIndex, 5) != null ?
                    model.getValueAt(selectedRowIndex, 5).toString() : "");
                    docGia.setSo_dien_thoai( model.getValueAt(selectedRowIndex, 6).toString() != null ?
                    model.getValueAt(selectedRowIndex, 6).toString() : "");
                    docGia.setGioi_tinh_dg(model.getValueAt(selectedRowIndex, 7).toString().equalsIgnoreCase("Nam"));
                    docGia.setTinh_trang_dg((boolean)model.getValueAt(selectedRowIndex, 8));
                    
                    QLDocGiaJFrame frame = new QLDocGiaJFrame(docGia);
                    frame.setTitle("Thông Tin Đọc Giả");
                    frame.setResizable(false);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }
            }
        });
        
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100,50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.getViewport().add(table);
        scrollPane.setPreferredSize(new Dimension(1300,400));
        
        jnpView.removeAll();
        jnpView.setLayout(new BorderLayout());
        jnpView.add(scrollPane);
        jnpView.validate();
        jnpView.repaint();
        
    }
    
    public void setEvent(){
        btnAdd.addMouseListener(new MouseAdapter(){
             @Override
            public void mouseClicked(MouseEvent e) {
                QLDocGiaJFrame frame = new QLDocGiaJFrame(new DocGia());
                frame.setTitle("Thông Tin Đọc Giả");
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setVisible(true);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnAdd.setBackground(new Color(0,200,83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnAdd.setBackground(new Color(100,221,23));
            }
        });
    }
    
    
}
