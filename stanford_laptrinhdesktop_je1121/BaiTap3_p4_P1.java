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
public class BaiTap3_p4_P1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tuoiCha = 0, tuoiCon = 0, soNam = 0;

        do {
            System.out.print("Nhập tuổi cha = ");
            tuoiCha = sc.nextInt();

            System.out.print("Nhập tuổi con = ");
            tuoiCon = sc.nextInt();
        } while (tuoiCha <= (2 * tuoiCon));

        //tính số năm
        soNam = tuoiCha - (2 * tuoiCon);

        tuoiCha += soNam;
        tuoiCon += soNam;

        System.out.println("Số năm tuổi cha gấp đôi tuổi con là: " + soNam);
        System.out.println("tuổi của cha là" + tuoiCha);
        System.out.println("tuổi của con là" + tuoiCon);
    }

}
