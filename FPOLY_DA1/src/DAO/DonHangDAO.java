/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.DonHang;
import java.util.ArrayList;
import java.util.List;
import Utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author nguye
 */
public class DonHangDAO extends DADAO<DonHang,Integer> {

    @Override
    public void insert(DonHang entity) {
        String sql = "INSERT INTO DonHang (NGAYMUA,MAKH,MATT,MANV) VALUES (?,?,?,?) ";
        XJdbc.update(sql,
                entity.getNGAYMUA(),
                entity.getMAKH(),
                entity.getMATT(),
                entity.getMANV());
    }

    @Override
    public void update(DonHang entity) {
        String sql = "UPDATE DonHang SET NGAYMUA = ?, MAKH = ?, MATT = ?,MANV=? WHERE MADH = ? ";
        XJdbc.update(sql,
                entity.getNGAYMUA(),
                entity.getMAKH(),
                entity.getMATT(),
                entity.getMANV(),
                entity.getMADH());
    }

    @Override
    public void delete(Integer MADH) {
        String sql = "DELETE FROM DonHang WHERE MADH = ?";
        XJdbc.update(sql, MADH);
    }

    @Override
    public DonHang selectById(Integer MADH) {
        String sql = "SELECT * FROM Don WHERE MADH=?";
        List<DonHang> list = selectBySql(sql, MADH);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<DonHang> selectAll(){
        String sql="SELECT * FROM DONHANG";
        return selectBySql(sql);
    }

    @Override
    protected List<DonHang> selectBySql(String sql, Object... args) {
        List<DonHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    DonHang entity = new DonHang();
                    entity.setMADH(rs.getInt("MADH"));
                    entity.setNGAYMUA(rs.getDate("NGAYMUA"));
                    entity.setMAKH(rs.getInt("MAKH"));
                    entity.setMATT(rs.getString("MATT"));
                    entity.setMANV(rs.getString("MANV"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

}
