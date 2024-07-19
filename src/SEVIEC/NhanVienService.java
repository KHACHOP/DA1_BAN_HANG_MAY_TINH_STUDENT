/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEVIEC;
import MODEL_TONG.NhanVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Dell
 */
public class NhanVienService {
     List<NhanVien> listNV;

    PreparedStatement preparedStatement = null;

    ResultSet resultSet = null;

    String sql = "";

    Connection connection = null;

    public NhanVien dangNhap(String sdt, String matKhau) {

        try {
            connection = DBConnect.getConnection();
            sql = "SELECT [id]\n"
                    + "      ,[hoTen]\n"
                    + "      ,[ngaySinh]\n"
                    + "      ,[gioiTinh]\n"
                    + "      ,[diaChi]\n"
                    + "      ,[SDT]\n"
                    + "      ,[email]\n"
                    + "      ,[matKhau]\n"
                    + "      ,[vaiTro]\n"
                    + "      ,[trangThaiXoa]\n"
                    + "      ,[ngayTao]\n"
                    + "      ,[ngaySuaCuoi]\n, maNV"
                    + "  FROM [dbo].[NhanVien] WHERE SDT = ? ";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, sdt);

            resultSet = preparedStatement.executeQuery();

            if (resultSet == null) {
                return null;
            }
            NhanVien nhanVien = null;
            while (resultSet.next()) {
                nhanVien = new NhanVien(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getDate(3),
                        resultSet.getInt(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8),
                        resultSet.getString(9),
                        resultSet.getBoolean(10),
                        resultSet.getDate(11),
                        resultSet.getDate(12), resultSet.getString(13));

            }
            if (nhanVien == null) {
                return null;
            }
         
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

        return null;
    }
}
