/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stanford_laptrinhdesktop_je1121;

import java.time.Clock;
import java.util.Scanner;

/**
 *
 * @author MrT
 */
public class VongLapTrongjava {
    public static void main(String[] args) {
        
        
        //khai báo biến
//        int i = 1;
//        System.out.println("Sử dụng vòng lặp While: ");
//        
//        while(i < 10)
//        {
//            System.out.println("I LOVE YOU" +i);
//            i++;//tăng i lên 1 đơn vị mỗi lần chạy
//        }
//        
//        System.out.println("Sử dụng vòng do vòng lặp while ");
//        do
//        {
//            System.out.println("Giá trị của i = " + i);
//            i++;
//        }
//        while(i < 20);
        
//        Scanner sc = new Scanner(System.in);
//        
//    
//        //kiểm tra người dùng cần phải nhập đúng số gồm 4 chữ số
//        int so4ChuSo = 0;
//        
//        do
//        {
//        System.out.print("Nhập số gồm 4 chữ số = ");
//        so4ChuSo = sc.nextInt();
//        }
//        while(so4ChuSo < 1000 || so4ChuSo > 9999);
//        System.out.println("Số 4 chữ số là: " + so4ChuSo);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Sử dụng vòng lặp for: ");
        for(int i = 80; i <= 90; i+=2)//i =i+2
        {
            System.out.println(i);
        }
//        
        //bài tập 4 - P4
        int N = 0;
        double S1 = 0, S2 = 0;
        
        System.out.println("Nhập giá trị của dãy N = ");
        N = sc.nextInt();
        
        //duyệt vòng lặp để tính toán
        for(int i = 1; i<=N; i++)
        {
            S1 += i;//S1 = S1+i
            S2 += i*i;
        }
        
        S1 = S1/N;
        S2 = Math.sqrt(S2);
        
        System.out.printf("Giá trị của S1 = %.2f\n", S1);
        System.out.printf("Giá trị của S2 = %.2f\n", S2);
        
        //bài 5.In ra màn hình các số có 2 chữ số sao cho tích của 2 chữ số 
        //2 chữ số đó (ví dụ số 36 có tích 3*6 = 18 gấp 2 lần tổng của nó là 3 + 6 = 9)
        
        int tich = 0, tong = 0, chuc = 0, donVi = 0;
        System.out.println("Các số 2 chữ số mà có tích bằng 2 lần tổng: ");
        
        for(int i = 10; i <=99; i++)
        {
            chuc = i/10;
            donVi = i%10;
            tich = chuc * donVi;
            tong = chuc + donVi;
            if(tich == 2*tong)//true
            {
                System.out.println(i);
            }
                 
        }
        
        
    }

    
}
