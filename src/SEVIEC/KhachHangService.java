/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEVIEC;

import MODEL_TONG.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tienl
 */
public class KhachHangService {
      List<KhachHang> listKH;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    Connection connection = null;
    String sql = "";
    
    
    public List<KhachHang> getAll(){
        listKH = new ArrayList<>();
        sql = "select id, maKH, hoTen, ngaySinh, gioiTinh,email, SDT, diaChi from KhachHang";
        try {
            connection = DBConnect.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                KhachHang kh = new KhachHang(
                        resultSet.getInt(1), 
                        resultSet.getString(2), 
                        resultSet.getString(3),
                        resultSet.getDate(4), 
                        resultSet.getInt(5), 
                        resultSet.getString(8), 
                        resultSet.getString(7), 
                        resultSet.getString(6));
                listKH.add(kh);
            }
            return listKH;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
   
     
    
    
    public int insertKH (KhachHang kh){
        sql = "insert into KhachHang(maKH, hoTen, ngaySinh, gioiTinh,email, SDT, diaChi)values(?,?,?,?,?,?,?)";
        try {
            connection = DBConnect.getConnection();
            preparedStatement = connection.prepareCall(sql);
            preparedStatement.setObject(1, kh.getMaKH());
            preparedStatement.setObject(2, kh.getHoTen());
            preparedStatement.setObject(3, kh.getNgaySinh());
            preparedStatement.setObject(4, kh.getGioiTinh());
            preparedStatement.setObject(5, kh.getEmail());
            preparedStatement.setObject(6, kh.getSdt());
            preparedStatement.setObject(7, kh.getDiaChi());
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public int updateKhachHang(String ma, KhachHang kh){
        sql = "update KhachHang set hoTen = ?,ngaySinh = ?, gioiTinh=?, SDT = ?,email = ?, diaChi = ? where maKH like ? ";
        try {
            connection = DBConnect.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setObject(1, kh.getHoTen());
            preparedStatement.setObject(2, kh.getNgaySinh());
            preparedStatement.setObject(3, kh.getGioiTinh());
            preparedStatement.setObject(4, kh.getSdt());
            preparedStatement.setObject(5, kh.getEmail());
            preparedStatement.setObject(6, kh.getDiaChi());
            preparedStatement.setObject(7, kh.getMaKH());
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0; 
        }
        finally {
            try {
               connection.close();
               preparedStatement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
          
    }
    public List<KhachHang> timTheoTen(String ten){
        try {
            listKH = new ArrayList<>();
            connection = DBConnect.getConnection();
            sql = "select id, maKH,hoTen, ngaySinh, gioiTinh, SDT, email, diaChi from KhachHang where hoTen like ?";
            preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1, "%"+ten+"%");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                KhachHang kh = new KhachHang(
                        resultSet.getInt(1), 
                        resultSet.getString(2), 
                        resultSet.getString(3), 
                        resultSet.getDate(4), 
                        resultSet.getInt(5) , 
                        resultSet.getString(6), 
                        resultSet.getString(7), 
                        resultSet.getString(8));
                listKH.add(kh);
            }
            return listKH;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
          finally {
            try {
               connection.close();
               preparedStatement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
          
    }
      public KhachHang timTheoMaKH(String maKH){
           
               KhachHang khachHang = null;
        try {
            connection = DBConnect.getConnection();
            sql = "select id, maKH,hoTen, ngaySinh, gioiTinh, SDT, email, diaChi from KhachHang where maKH = ?";
            preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1, maKH);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                 khachHang = new KhachHang(
                        resultSet.getInt(1), 
                        resultSet.getString(2), 
                        resultSet.getString(3), 
                        resultSet.getDate(4), 
                        resultSet.getInt(5) , 
                        resultSet.getString(6), 
                        resultSet.getString(7), 
                        resultSet.getString(8));
                
            }
            return khachHang;
        } catch (Exception e) {
            e.printStackTrace();
        }
          finally {
            try {
               connection.close();
               preparedStatement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
          
        return  khachHang;
    }

    public KhachHang timTheoSoDienThoai(String sdt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
