package meohongngoc.qltv.service;

import java.util.List;
import meohongngoc.qltv.dao.DocGiaDAO;
import meohongngoc.qltv.dao.DocGiaDAOImpl;
import meohongngoc.qltv.model.DocGia;

/**
 *
 * @author MeoHongNgoc
 */
public class DocGiaServiceImpl implements DocGiaService{

    private DocGiaDAO docgiaDAO = null;
    
    public DocGiaServiceImpl() {
        docgiaDAO = new DocGiaDAOImpl();
        
    }
    
    @Override
    public List<DocGia> getList() {
        return docgiaDAO.getList();
    }

    @Override
    public int createrOrUpdate(DocGia docGia) {
        return docgiaDAO.createrOrUpdate(docGia);
    }
    
}
