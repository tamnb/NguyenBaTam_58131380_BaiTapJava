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
public class BT1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Nguyễn Bá Tâm", 22, "26 Nguyễn Chí Thanh", 1350000,90);
        NhanVien nv2 = new NhanVien("Nguyễn Văn B", 22, "Cam Ranh - Khánh Hòa", 2000000,100);
        nv1.showInfo();
        nv2.showInfo();
    }
    
}
