package meohongngoc.qltv.service;

import java.util.List;
import meohongngoc.qltv.model.DocGia;

/**
 *
 * @author MeoHongNgoc
 */
public interface DocGiaService {
    
    public List<DocGia> getList();
    
    public int createrOrUpdate(DocGia docGia);
    
}
