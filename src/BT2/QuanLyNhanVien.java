/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import BT1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author Trang Nguyen
 */
public class QuanLyNhanVien implements IQuanLy {

    ArrayList<NhanVien> nv3 = new ArrayList<>();
    @Override
    public void them(NhanVien nv) {
        nv3.add(nv);
    }

    @Override
    public void inDS() {
        for (int i = 0; i < nv3.size(); i ++)
       {
           System.out.println( nv3.get(i).getThongtin());
       }
    }
    
}
