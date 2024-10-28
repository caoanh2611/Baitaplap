/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap1;
import java.util.Scanner;
public class Baitap1 {
    public static void main(String[] args) {
        System.out.println("Nhap thong tin !");
        Scanner SC = new Scanner(System.in);
        System.out.print("Nhap ho va ten : ");
        String name = SC.nextLine();
        System.out.print("Nhap Lop : ");
        String lop = SC.nextLine();
        System.out.print("Nhap ma sinh vien : ");
        String msv = SC.nextLine();
        
        System.out.println("In thong tin !");
        System.out.println("Ho va ten : " + name);
        System.out.println("Lop : "+ lop);
        System.out.println("Ma so sinh vien : "+ msv);
        SC.close();
         
//        System.out.println("Cao Le Tuan Anh");
//        System.out.println("CMU-TPM 15");
//        System.out.println("29219053647");
    }
    
}
