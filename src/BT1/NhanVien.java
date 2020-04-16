/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;
/**
 *
 * @author Trang Nguyen
 */
public class NhanVien {
    public String ten;
    public int tuoi;
    public String diachi;
    public double tienluong;
    public int tongsogiolam;

    public NhanVien() {
        
    }

    public NhanVien(String ten, int tuoi, String diachi, double tienluong, int tongsogiolam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.tienluong = tienluong;
        this.tongsogiolam = tongsogiolam;
    }
    
    
    

    

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }

    public int getTongsogiolam() {
        return tongsogiolam;
    }

    public void setTongsogiolam(int tongsogiolam) {
        this.tongsogiolam = tongsogiolam;
    }
    
    public String getThongtin()
    {
        System.out.println(this.ten);
        System.out.println(this.tuoi);
        System.out.println(this.diachi);
        return null;
    }
    
    public double tinhThuong()
    {
        double thuong = 0;
        if(tongsogiolam >=200)
            thuong = tienluong * 0.8;
        else if(tongsogiolam < 200  && tongsogiolam>=100)
            thuong = tienluong * 0.9;
        else
            thuong = 0;
        return thuong;
    }
    
    public void showInfo()
    {
        System.out.println("Name \t\t: " + this.getTen());
        System.out.println("Tuổi \t\t: " + this.getTuoi());
        System.out.println("Địa Chỉ \t: " + this.getDiachi());
    }
    
}
