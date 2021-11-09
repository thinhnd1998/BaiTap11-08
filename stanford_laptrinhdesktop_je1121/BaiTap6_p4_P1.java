/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stanford_laptrinhdesktop_je1121;

/**
 *
 * @author MrT
 */
public class BaiTap6_p4_P1 {
    public static void main(String[] args) {
        
        //Bài 6: Tìm số nguyên dương n lớn nhất thoả mãn điều kiện:
        //câu a
        int n = 0;
        double S1 = 0, S2 = 0;
        do {            
            n ++;
            S1 += 1/(2.0*n - 1);
        } while (S1 < 2.101999);
        System.out.println("N = " + n);
        System.out.println("S1 = " + n);
        System.out.println("Giá trị của n để thỏa mãn biểu thức là: " + (n-1));
        
        //gán lại giá trị
        // câu b
        n = 0;
        
        do {            
            n++;
            S2 = Math.exp(n) - 1999 * Math.log10(n);
        } while (S2 < 2000);
        
        System.out.println("N = " + n);
        System.out.println("S2 = " + n);
        System.out.println("2. Giá trị của n để thỏa mãn biểu thức là: " + (n-1));
    }
    
}
