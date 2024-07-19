/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEVIEC;

import MODEL_TONG.HoaDon;
import MODEL_TONG.HoaDonDTO;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.EntityReference;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;
import org.w3c.dom.UserDataHandler;

/**
 *
 * @author admin
 */
public class HoaDonService {

    PreparedStatement preparedStatement = null;

    ResultSet resultSet = null;

    String sql = "";

    Connection connection = null;

    private List<HoaDonDTO> hoaDonDTOs = null;

    private HoaDonRepository hoaDonRepository = new HoaDonRepository();

    private HoaDonChiTietService hoaDonChiTietService = new HoaDonChiTietService();

    public List<HoaDonDTO> findAllHoaDon() {
        try {
            hoaDonDTOs = new ArrayList<>();
            connection = DBConnect.getConnection();
            sql = "SELECT [HoaDon].id\n"
                    + "      ,id_KhachHang\n"
                    + "      ,id_NhanVien\n"
                    + "      ,maHoaDon\n"
                    + "      ,tenNguoiNhan\n"
                    + "      ,[HoaDon].diaChi\n"
                    + "      ,tienKhachTra\n"
                    + "      ,tienThuaLai\n"
                    + "      ,thanhTien\n"
                    + "      ,[HoaDon].trangThaiXoa\n"
                    + "      ,[HoaDon].ngayTao\n"
                    + "      ,[HoaDon].ngaySuaCuoi\n"
                    + "      ,ghiChu,\n"
                    + "	  NhanVien.hoTen,\n"
                    + "	  KhachHang.hoTen,\n"
                    + "	  KhachHang.SDT, hinhThucThanhToan, trangThaiThanhToan,Voucher.maVoucher, tienSauGiamGia  \n"
                    + "  FROM [dbo].[HoaDon] "
                    + " left join NhanVien on HoaDon.id_NhanVien = NhanVien.id "
                    + " left join KhachHang on KhachHang.id = HoaDon.id_KhachHang "
                    + " LEFT JOIN Voucher on Voucher.id = HoaDon.maVoucher order by HoaDon.ngayTao desc";

            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                HoaDonDTO hoaDonDTO = new HoaDonDTO(
                        resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getInt(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getDouble(7),
                        resultSet.getDouble(8),
                        resultSet.getDouble(9),
                        resultSet.getBoolean(10),
                        resultSet.getDate(11),
                        resultSet.getDate(12),
                        resultSet.getString(13),
                        resultSet.getString(14),
                        resultSet.getString(15),
                        resultSet.getString(16),
                        resultSet.getString(17),
                        resultSet.getInt(18),
                        resultSet.getString(19),
                        resultSet.getDouble(20)
                );
                hoaDonDTOs.add(hoaDonDTO);

            }

            return hoaDonDTOs;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
               
                connection.close();
                preparedStatement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return hoaDonDTOs;
    }
    
     public List<HoaDonDTO> findHoaDonByMaNhanVien(String maNhanVien) {
         hoaDonDTOs = new ArrayList<>();  
       try {
         
            connection = DBConnect.getConnection();
            sql = "SELECT [HoaDon].id\n"
                    + "      ,id_KhachHang\n"
                    + "      ,id_NhanVien\n"
                    + "      ,maHoaDon\n"
                    + "      ,tenNguoiNhan\n"
                    + "      ,[HoaDon].diaChi\n"
                    + "      ,tienKhachTra\n"
                    + "      ,tienThuaLai\n"
                    + "      ,thanhTien\n"
                    + "      ,[HoaDon].trangThaiXoa\n"
                    + "      ,[HoaDon].ngayTao\n"
                    + "      ,[HoaDon].ngaySuaCuoi\n"
                    + "      ,ghiChu,\n"
                    + "	  NhanVien.hoTen,\n"
                    + "	  KhachHang.hoTen,\n"
                    + "	  KhachHang.SDT, hinhThucThanhToan, trangThaiThanhToan,Voucher.maVoucher, tienSauGiamGia  \n"
                    + "  FROM [dbo].[HoaDon] "
                    + " left join NhanVien on HoaDon.id_NhanVien = NhanVien.id "
                    + " left join KhachHang on KhachHang.id = HoaDon.id_KhachHang "
                    + " LEFT JOIN Voucher on Voucher.id = HoaDon.maVoucher "
                    + " where NhanVien.maNV = ? "
                    + " order by HoaDon.ngayTao desc" ;

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, maNhanVien);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                HoaDonDTO hoaDonDTO = new HoaDonDTO(
                        resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getInt(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getDouble(7),
                        resultSet.getDouble(8),
                        resultSet.getDouble(9),
                        resultSet.getBoolean(10),
                        resultSet.getDate(11),
                        resultSet.getDate(12),
                        resultSet.getString(13),
                        resultSet.getString(14),
                        resultSet.getString(15),
                        resultSet.getString(16),
                        resultSet.getString(17),
                        resultSet.getInt(18),
                        resultSet.getString(19),
                        resultSet.getDouble(20)
                );
                hoaDonDTOs.add(hoaDonDTO);
            }

            return hoaDonDTOs;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                preparedStatement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return hoaDonDTOs;
    }

    public List<HoaDonDTO> locTheoGiaTri(String trangThai, String hinhThucThanhToan, Date tuNgay, Date denNgay) {
        List<HoaDonDTO> hoaDonDTOs = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DBConnect.getConnection();
            hoaDonDTOs = new ArrayList<>();

            String sql = sql = "SELECT [HoaDon].id\n"
                    + "      ,id_KhachHang\n"
                    + "      ,id_NhanVien\n"
                    + "      ,maHoaDon\n"
                    + "      ,tenNguoiNhan\n"
                    + "      ,[HoaDon].diaChi\n"
                    + "      ,tienKhachTra\n"
                    + "      ,tienThuaLai\n"
                    + "      ,thanhTien\n"
                    + "      ,[HoaDon].trangThaiXoa\n"
                    + "      ,[HoaDon].ngayTao\n"
                    + "      ,[HoaDon].ngaySuaCuoi\n"
                    + "      ,ghiChu,\n"
                    + "	  NhanVien.hoTen,\n"
                    + "	  KhachHang.hoTen,\n"
                    + "	  KhachHang.SDT, hinhThucThanhToan, trangThaiThanhToan,Voucher.maVoucher, tienSauGiamGia  \n"
                    + "  FROM [dbo].[HoaDon] "
                    + " left join NhanVien on HoaDon.id_NhanVien = NhanVien.id "
                    + " left join KhachHang on KhachHang.id = HoaDon.id_KhachHang "
                    + " LEFT JOIN Voucher on Voucher.id = HoaDon.maVoucher";

            int count = 1;

            if (trangThai != null && !trangThai.isEmpty()) {
                sql += " WHERE trangThaiThanhToan = ?";
                count++;
            }

            if (hinhThucThanhToan != null && !hinhThucThanhToan.isEmpty()) {
                if (count > 1) {
                    sql += " AND hinhThucThanhToan = ?";
                } else {
                    sql += " WHERE hinhThucThanhToan = ?";
                }
                count++;
            }

            if (tuNgay != null && denNgay != null) {
                if (count > 1) {
                    sql += " AND [HoaDon].ngaySuaCuoi BETWEEN ? AND ?";
                } else {
                    sql += " WHERE [HoaDon].ngaySuaCuoi BETWEEN ? AND ?";
                }
            }
            
            sql += " order by HoaDon.ngayTao desc";

            preparedStatement = connection.prepareStatement(sql);
            count = 1;

            if (trangThai != null && !trangThai.isEmpty()) {
                preparedStatement.setString(count++, trangThai);
            }

            if (hinhThucThanhToan != null && !hinhThucThanhToan.isEmpty()) {
                preparedStatement.setString(count++, hinhThucThanhToan);
            }

            if (tuNgay != null && denNgay != null) {
                java.sql.Date sqlTuNgay = new java.sql.Date(tuNgay.getTime());
                java.sql.Date sqlDenNgay = new java.sql.Date(denNgay.getTime());
                preparedStatement.setDate(count++, sqlTuNgay);
                preparedStatement.setDate(count++, sqlDenNgay);
            }

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                HoaDonDTO hoaDonDTO = new HoaDonDTO(
                        resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getInt(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getDouble(7),
                        resultSet.getDouble(8),
                        resultSet.getDouble(9),
                        resultSet.getBoolean(10),
                        resultSet.getDate(11),
                        resultSet.getDate(12),
                        resultSet.getString(13),
                        resultSet.getString(14),
                        resultSet.getString(15),
                        resultSet.getString(16),
                        resultSet.getString(17),
                        resultSet.getInt(18),
                        resultSet.getString(19),
                        resultSet.getDouble(20)
                );
                hoaDonDTOs.add(hoaDonDTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return hoaDonDTOs;
    }

    public List<HoaDonDTO> getHoaDonToDay() {
        List<HoaDonDTO> hoaDonDTOs = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DBConnect.getConnection();
            hoaDonDTOs = new ArrayList<>();

            String sql = sql = "SELECT [HoaDon].id\n"
                    + "      ,id_KhachHang\n"
                    + "      ,id_NhanVien\n"
                    + "      ,maHoaDon\n"
                    + "      ,tenNguoiNhan\n"
                    + "      ,[HoaDon].diaChi\n"
                    + "      ,tienKhachTra\n"
                    + "      ,tienThuaLai\n"
                    + "      ,thanhTien\n"
                    + "      ,[HoaDon].trangThaiXoa\n"
                    + "      ,[HoaDon].ngayTao\n"
                    + "      ,[HoaDon].ngaySuaCuoi\n"
                    + "      ,ghiChu,\n"
                    + "	  NhanVien.hoTen,\n"
                    + "	  KhachHang.hoTen,\n"
                    + "	  KhachHang.SDT, hinhThucThanhToan, trangThaiThanhToan,Voucher.maVoucher, tienSauGiamGia  \n"
                    + "  FROM [dbo].[HoaDon] "
                    + " left join NhanVien on HoaDon.id_NhanVien = NhanVien.id "
                    + " left join KhachHang on KhachHang.id = HoaDon.id_KhachHang "
                    + " LEFT JOIN Voucher on Voucher.id = HoaDon.maVoucher "
                    + " WHERE CONVERT(DATE, [HoaDon].ngayTao) = CONVERT(DATE, GETDATE())";

            int count = 1;
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                HoaDonDTO hoaDonDTO = new HoaDonDTO(
                        resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getInt(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getDouble(7),
                        resultSet.getDouble(8),
                        resultSet.getDouble(9),
                        resultSet.getBoolean(10),
                        resultSet.getDate(11),
                        resultSet.getDate(12),
                        resultSet.getString(13),
                        resultSet.getString(14),
                        resultSet.getString(15),
                        resultSet.getString(16),
                        resultSet.getString(17),
                        resultSet.getInt(18),
                        resultSet.getString(19),
                        resultSet.getDouble(20)
                );
                hoaDonDTOs.add(hoaDonDTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return hoaDonDTOs;
    }

    public String taoHoaDon(HoaDon hoaDon) {
        String maHoaDon = hoaDonRepository.taoHoaDonByHoaDon(hoaDon);
        System.out.println(maHoaDon);
        return maHoaDon;
    }

    public HoaDonDTO findHoaDonByMaHoaDon(String maHoaDon) {
        return hoaDonRepository.findHoaDonByMaHoaDon(maHoaDon);
    }
    
    public List<HoaDonDTO> findHoaDonByTenKhachHang(String tenKhachHang) {
        return hoaDonRepository.findHoaDonByTenKhachHang(tenKhachHang);
    }

    public int updateHoaDonByMaHoaDon(String maHoaDonUpdate) {
        return hoaDonRepository.updateHoaDonByMaHoaDon(maHoaDonUpdate);
    }

    public List<ChiTietSanPham> findChiTietSanPhamByMaHoaDon(String maHoaDon) {
        return hoaDonRepository.findChiTietSanPhamByMaHoaDon(maHoaDon);
    }

    public int updateHoaDonByHoaDonUpdate(HoaDonDTO hoaDonUpdate) {
        return hoaDonRepository.updateHoaDonByHoaDonDTO(hoaDonUpdate);
    }

    public void inHoaDonRaPDF(String maHoaDon) {
        List<HoaDonChiTietDTO> hoaDonChiTietDTOs = hoaDonChiTietService.getHoaDonChiTietDTOByMaHoaDon(maHoaDon);
        HoaDonDTO hoaDon = hoaDonRepository.findHoaDonByMaHoaDon(maHoaDon);
        System.out.println(hoaDon.toString());
        Document document = new Document() {
            @Override
            public DocumentType getDoctype() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public DOMImplementation getImplementation() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Element getDocumentElement() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Element createElement(String tagName) throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public DocumentFragment createDocumentFragment() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Text createTextNode(String data) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Comment createComment(String data) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public CDATASection createCDATASection(String data) throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public ProcessingInstruction createProcessingInstruction(String target, String data) throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Attr createAttribute(String name) throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public EntityReference createEntityReference(String name) throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public NodeList getElementsByTagName(String tagname) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Node importNode(Node importedNode, boolean deep) throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Element createElementNS(String namespaceURI, String qualifiedName) throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Attr createAttributeNS(String namespaceURI, String qualifiedName) throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public NodeList getElementsByTagNameNS(String namespaceURI, String localName) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Element getElementById(String elementId) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getInputEncoding() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getXmlEncoding() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean getXmlStandalone() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void setXmlStandalone(boolean xmlStandalone) throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getXmlVersion() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void setXmlVersion(String xmlVersion) throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean getStrictErrorChecking() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void setStrictErrorChecking(boolean strictErrorChecking) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getDocumentURI() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void setDocumentURI(String documentURI) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Node adoptNode(Node source) throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public DOMConfiguration getDomConfig() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void normalizeDocument() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Node renameNode(Node n, String namespaceURI, String qualifiedName) throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getNodeName() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getNodeValue() throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void setNodeValue(String nodeValue) throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public short getNodeType() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Node getParentNode() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public NodeList getChildNodes() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Node getFirstChild() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Node getLastChild() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Node getPreviousSibling() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Node getNextSibling() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public NamedNodeMap getAttributes() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Document getOwnerDocument() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Node insertBefore(Node newChild, Node refChild) throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Node replaceChild(Node newChild, Node oldChild) throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Node removeChild(Node oldChild) throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Node appendChild(Node newChild) throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean hasChildNodes() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Node cloneNode(boolean deep) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void normalize() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean isSupported(String feature, String version) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getNamespaceURI() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getPrefix() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void setPrefix(String prefix) throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getLocalName() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean hasAttributes() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getBaseURI() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public short compareDocumentPosition(Node other) throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getTextContent() throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void setTextContent(String textContent) throws DOMException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean isSameNode(Node other) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String lookupPrefix(String namespaceURI) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean isDefaultNamespace(String namespaceURI) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String lookupNamespaceURI(String prefix) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean isEqualNode(Node arg) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Object getFeature(String feature, String version) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Object setUserData(String key, Object data, UserDataHandler handler) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Object getUserData(String key) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String timestamp = dateFormat.format(new Date());

        String pdfFile = "src/HoaDon/" + "hoadon_" + timestamp + ".pdf";

        try {
            PdfWriter.getInstance(document, new FileOutputStream(pdfFile));
            document.open();
            addContent(document, hoaDonChiTietDTOs, hoaDon);
            document.close();
            openPDFFile(pdfFile);
            System.out.println("PDF printed successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addContent(Document document, List<HoaDonChiTietDTO> hoaDonChiTietDTOs, HoaDonDTO hoaDon) throws DocumentException {
        // Thêm tiêu đề hóa đơn
        Font titleFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
        Paragraph title = new Paragraph("THE HANS SHOP \nHOA DON MUA HANG", titleFont);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);

        // Thêm thông tin hóa đơn
        Font infoFont = new Font(Font.FontFamily.TIMES_ROMAN, 12);
        Paragraph info = new Paragraph("Ngay thanh toan : " + hoaDon.getNgaySuaCuoi() + "\nMa Hoa Don : " + hoaDon.getMaHoaDon()
                + "\nKhach Hang : " + hoaDon.getTenKhachHang() + "\n\n");
        info.setFont(infoFont);
        document.add(info);

        // Tạo bảng danh sách sản phẩm
        PdfPTable table = new PdfPTable(4); // Số cột của bảng

        // Đặt tiêu đề cho các cột
        table.addCell("Ten San Pham");
        table.addCell("Don Gia");
        table.addCell("So Luong");
        table.addCell("Thanh Tien");

        // Thêm từng sản phẩm vào bảng
        for (HoaDonChiTietDTO chiTiet : hoaDonChiTietDTOs) {
            table.addCell(chiTiet.getTenSanPham());
            table.addCell(String.valueOf(chiTiet.getDonGia()));
            table.addCell(String.valueOf(chiTiet.getSoLuong()));
            table.addCell(String.valueOf(chiTiet.getDonGia() * chiTiet.getSoLuong()));
        }

        // Thêm bảng vào tài liệu
        document.add(table);

        // Thêm tổng cộng
        Paragraph total = new Paragraph("\nTong Cong: " + hoaDon.getThanhTien());
        total.setFont(infoFont);
        document.add(total);

        Paragraph tienKhachTra = new Paragraph("Tien Khach Tra: " + hoaDon.getTienKhachTra());
        tienKhachTra.setFont(infoFont);
        document.add(tienKhachTra);

        if (hoaDon.getMaVoucher() != null) {
            Paragraph vouCher = new Paragraph("Ma Voucher: " + hoaDon.getMaVoucher());
            vouCher.setFont(infoFont);
            document.add(vouCher);

            Paragraph tienDuocGiam = new Paragraph("Tien được giảm: " + (hoaDon.getThanhTien() - hoaDon.getTienSauGiamGia()));
            tienDuocGiam.setFont(infoFont);
            document.add(tienDuocGiam);
        }

        Paragraph tienSauGiamGia = new Paragraph("Tien cần thanh toán: " + hoaDon.getTienSauGiamGia());
        tienSauGiamGia.setFont(infoFont);
        document.add(tienSauGiamGia);
    }

    public static void openPDFFile(String filePath) {
        try {
            File file = new File(filePath);
            if (file.exists() && Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(file);
            } else {
                System.out.println("File not found or desktop operations not supported.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public void truHangTonKhoTrongSanPham(List<ChiTietSanPham> listChiTietGioHang) {
//        
//    }
    public void truHangTonKhoTrongSanPham(List<ChiTietSanPham> listChiTietGioHang) {
        for (ChiTietSanPham chiTietSanPham : listChiTietGioHang) {
            hoaDonRepository.truSoLuongTrongSanPham(chiTietSanPham.getMaCTSP(), chiTietSanPham.getSoLuongTrongGioHang());
        }
    }

   

}
