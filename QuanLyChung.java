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
public class QuanLyChung {

    /**
     * @param args the command line arguments
     */
    static void menu() 
        {
        System.out.println("1. Nhập thông tin cho n xe máy tại tỉnh Hòa Bình: ");
        System.out.println("2. Nhập thông tin cho n xe máy tại tỉnh Hà Nội: ");
        System.out.println("3. Sắp xếp danh sách tăng theo biển số xe: ");
        System.out.println("4. Tìm kiếm thông tin xe theo biển số xe: ");
        System.out.println("5. Thống kê số lượng xe đang quản lý: ");
        System.out.println("6. Thoát: ");
        
    }
    public static void main(String[] args) 
    {
        int n = 0;
        XeMay a = new XeMay() ;
        XeMay[] xemay = null;
        do {
            menu();
            System.out.println("Nhap vao lua chon cua ban :");
            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1: {
                    int m;
                    System.out.println("Nhap vao n :");
                    m = Integer.parseInt(sc.nextLine());
                    xemay = new XeMay[m];
                    for (int i = 0; i < m; i++) {
                    xemay[i] = new XeMay();
                    xemay[i].nhap();
                    }
                break;
                }
                case 2: {
                    if (xemay == null) {
                    System.out.println("ban chua nhap du lieu");
                    } else {
                        System.out.println("du lieu ban vua nhap la :");
                        for (int i = 0; i < xemay.length; i++) {
                            System.out.println("thong tin xe may thu " + (i + 1));
                            xemay[i].hienthi();
                            }
                        }
                break;
                }
                case 3: {
                    if (xemay == null) {
                        System.out.println("ban chua nhap du lieu");
                        } else {
                            a.sort(xemay);
                            System.out.println("du lieu sau khi sap xep la :");
                            for (int i = 0; i < xemay.length; i++) {
                                System.out.println("thong tin xe may thu " + (i + 1));
                                xemay[i].hienthi();
                                }
                            }
                break;
                }
                case 4:
                    break;
                    default: {
                        System.out.println("khong co lua chon cua ban ");
                        break;
                    }
            }  
        }while (n != 4);
    }   
}
