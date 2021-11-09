/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stanford_laptrinhdesktop_je1121;

import java.util.Scanner;

/**
 *
 * @author MrT
 */
public class BaiTap2_p4_P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //khai báo
        double x = 0, fxa = 0, fxb = 0;
        System.out.print("Nhập giá trị x = ");
        x = sc.nextDouble();
        
        if (x > 0) 
        {
            fxa = 3*x + Math.sqrt(x);
        }
        else
        {
            fxa = Math.exp(x) + 4;
        }
        if (x >= 1) 
        {
            fxb = Math.sqrt(x*x + 1);
        }
        else
        {
            if (x >-1 && x < 1)
            {
                fxb = 3*x + 5;
            } 
            else
            {
                fxb = Math.pow(x, 2) + 2*x - 1;
            }
        }
        
        //in kết quả
        System.out.printf("Kết quả câu fxa = %.2f\n", fxa);
        System.out.printf("Kết quả câu fxb = %.2f\n", fxb);
        
        
        //Bài 1. Nhập 1 kí tự cho biết kí tự đó có phải là chữ cái hay không
        
        //khai báo 1 kí tự
        
        char kiTu;
        System.out.print("Nhập vào 1 kí tự = ");
        kiTu = sc.next().charAt(0);
       
        
    }
    
}
