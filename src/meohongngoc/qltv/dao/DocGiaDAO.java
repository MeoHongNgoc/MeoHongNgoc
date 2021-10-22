package meohongngoc.qltv.dao;

import java.util.List;
import meohongngoc.qltv.model.DocGia;

/**
 *
 * @author MeoHongNgoc
 */
public interface DocGiaDAO {
    
    public List<DocGia> getList();
    
    public int createrOrUpdate(DocGia docGia);
}
