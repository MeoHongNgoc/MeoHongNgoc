package meohongngoc.qltv.utility;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import meohongngoc.qltv.model.DocGia;

/**
 *
 * @author MeoHongNgoc
 */
public class ClassTableModel {
    
    public DefaultTableModel setTableDocGia(List<DocGia> listItem, String[] listColumn){
        DefaultTableModel dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
           }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 8 ? Boolean.class : String.class ;
            }
            
            
        };
        dtm.setColumnIdentifiers(listColumn);
        int columns =listColumn.length;
        Object[] obj = null;
        int rows = listItem.size();
        if(rows > 0 ){
            for(int i =0 ; i < rows; i++){
                DocGia docGia = listItem.get(i);
                obj = new Object[columns];
                obj[0] = (1+i);
                obj[1] = docGia.getMa_doc_gia();
                obj[2] = docGia.getHo_va_ten_dg();
                obj[3] = docGia.getNgay_sinh_dg();
                obj[4] = docGia.getNgay_tham_gia();
                obj[5] = docGia.getDia_chi_dg();
                obj[6] = docGia.getSo_dien_thoai();
                obj[7] = docGia.isGioi_tinh_dg() == true ? "Nam" : "Nữ";
                obj[8] = docGia.isTinh_trang_dg(); /*== true? "Còn tham gia" : "Tạm Ngừng";*/
                dtm.addRow( obj);
            }            
        }
        return dtm;
    }
    
}
