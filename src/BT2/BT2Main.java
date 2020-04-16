/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import BT1.NhanVien;

/**
 *
 * @author Trang Nguyen
 */
public class BT2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuanLyNhanVien ql1 = new QuanLyNhanVien();
        ql1.them(new NhanVien("Nguyễn Bá Tâm", 22, "26 Nguyễn Chí Thanh", 1350000, 200));
        ql1.them(new NhanVien("Nguyễn Thanh Tùng", 22, "Cam Ranh", 1350000, 150));
        ql1.them(new NhanVien("Nguyễn Thành Long", 22, "Quảng Nam", 1250000, 100));
        ql1.inDS();
    }
    
}
