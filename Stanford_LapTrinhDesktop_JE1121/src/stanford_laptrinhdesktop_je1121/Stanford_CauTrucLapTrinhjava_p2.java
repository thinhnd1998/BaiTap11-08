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
public class Stanford_CauTrucLapTrinhjava_p2 {
    
    public static void main(String[] args) {
        //vi du 1 nhap vao 1 thang sau do in ra tháng đó
        
        Scanner sc = new Scanner(System.in);
    
        /*
    int thang = 0;
    
    String strThangHienTai = " ";
    
    System.out.print("Nhập tháng hiện tại = ");
    
    thang = sc.nextInt();
    
    //kiểm tra tháng
    switch(thang)
    {
        case 1:
            strThangHienTai = "Tháng một";
            break;
        case 2:
            strThangHienTai = "Tháng hai";
            break;
        case 3:
            strThangHienTai = "Tháng ba";
            break;
        case 4:
            strThangHienTai = "Tháng tư";
            break;
        case 5:
            strThangHienTai = "Tháng năm";
            break;
        case 6:
            strThangHienTai = "Tháng sáu";
            break;
        case 7:
            strThangHienTai = "Tháng bảy";
            break;
        case 8:
            strThangHienTai = "Tháng tám";
            break;
        case 9:
            strThangHienTai = "Tháng chín";
            break;
        case 10:
            strThangHienTai = "Tháng mười";
            break;
        case 11:
            strThangHienTai = "Tháng mười một";
            break;
        case 12:
            strThangHienTai = "Tháng mười hai";
            break;
        default:
            strThangHienTai = "Không có tháng này";
    }//end switch
    
    //hien thi ket qua
        System.out.println("Tháng hiện tại là: " + strThangHienTai);
        
        */
 
    
    
    //ví dụ 2: nhập vào 2 số thực và phép tính(+ - * /) sau đó tính kết quả theo
            //phép tính tương ứng và in ra màn hình
   
    
    //khai báo biến
    double soA= 0, soB = 0, ketQua = 0;
    String phepToan = "";
     System.out.print("Nhập số A: ");
     soA = sc.nextDouble();
     System.out.print("Nhập số B: ");
     soB = sc.nextDouble();
     
     //di chuyển sang dòng mới
     sc.nextLine();
     
     System.out.print("Nhập phép toán: ");
     phepToan = sc.nextLine();
     
     switch(phepToan)
     {
         case "+": ketQua = soA + soB;
            break;
             case "-": ketQua = soA - soB;
            break;
             case "*": ketQua = soA * soB;
            break;
             case "/":
                 if(soB != 0)
                 {
                     ketQua = soA/soB;
                 }
                 else
                 {
                    System.out.println("Bạn cần phải nhập số B khác 0");
                 }
                 break;
            default:
                System.out.println("Bạn cần phải nhập phép toán: +, -, *, / để thực hiện phép tính");
                break;         
     }//end switch 
     
     //hiển thị kết quả
     System.out.printf("Kết quả %.1f %s %.1f là: %.1f\n", soA, phepToan, soB, ketQua);
    
    }
}
    
            
    

