/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author nguye
 */
public class DonHang {
    private int MADH; 
    private Date NGAYMUA =new Date(); 
    private int MAKH; 
    private String MATT;
    private String MANV; 

    public DonHang(int MADH, Date NGAYMUA, int MAKH, String MATT, String MANV) {
        this.MADH = MADH;
        this.NGAYMUA = NGAYMUA;
        this.MAKH = MAKH;
        this.MATT = MATT;
        this.MANV = MANV;
    }

    public DonHang() {
    }
    
    

    public int getMADH() {
        return MADH;
    }

    public void setMADH(int MADH) {
        this.MADH = MADH;
    }

    public Date getNGAYMUA() {
        return NGAYMUA;
    }

    public void setNGAYMUA(Date NGAYMUA) {
        this.NGAYMUA = NGAYMUA;
    }

    public int getMAKH() {
        return MAKH;
    }

    public void setMAKH(int MAKH) {
        this.MAKH = MAKH;
    }

    public String getMATT() {
        return MATT;
    }

    public void setMATT(String MATT) {
        this.MATT = MATT;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }
    
    
}
