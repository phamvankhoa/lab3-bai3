/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.xeco.info;

import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class XeMay implements IXe
{
    private String bienso;
    private String loaixe;
    private String mauxe;
    private float giatien;

    public XeMay(String bienso, String loaixe, String mauxe, float giatien)
    {
        this.bienso = bienso;
        this.loaixe = loaixe;
        this.mauxe = mauxe;
        this.giatien = giatien;
    }
    public XeMay()
    {
             bienso = "12a8";
             loaixe = "honda";
             mauxe = "the thao";
             giatien = 0;
    }

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public String getMauxe() {
        return mauxe;
    }

    public void setMauxe(String mauxe) {
        this.mauxe = mauxe;
    }

    public float getGiatien() {
        return giatien;
    }

    public void setGiatien(float giatien) {
        this.giatien = giatien;
    }
@Override
    public void nhap ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao bien so xe: ");
        this.bienso = sc.nextLine();
        System.out.println("Nhap vao loai xe: ");
        this.loaixe = sc.nextLine();
        System.out.println("Nhap vao mau xe: ");
        this.mauxe = sc.nextLine();
        System.out.println("Nhap vao gia tien: ");
        giatien = sc.nextFloat();
    }
    public void hienthi ()
    {
        System.out.println("Nhap vao bien so xe: "+ this.getBienso());
        System.out.println("Nhap vao loai xe: "+ this.getLoaixe());
        System.out.println("Nhap vao mau xe: "+ this.getMauxe());
        System.out.println("Nhap vao gia tien: "+ this.getGiatien());
    }
    public void sort(XeMay[] b)
    {
        for (int i = 0; i < b.length - 1; i++) 
        {
            for (int j = i + 1; j < b.length; j++) 
            {
                if (b[i].giatien < b[j].giatien) 
                {
                    XeMay tem = b[i];
                    b[i] = b[j];
                    b[j] = tem;
                }
            }
        }
    }
}