/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1gui;

/**
 *
 * @author admin
 */
public class Phuongtrinh_b2 {
    private double a,b,c;

    public Phuongtrinh_b2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String Tinh(){
        double denta=0;
        denta = (b*b)-4*a*c;
        double x1, x2;
        x1=(-b+ Math.sqrt(denta))/2*a;
        x2=(-b- Math.sqrt(denta))/2*a;
        String kq="";
        
        if(denta <0)
            kq= "Phuong trinh vo nghiem!!!!";
        else if(denta==0)
            kq= "Phuong trinh co nghiem kep"+ -b/(2*a) ;
        else
            kq ="Phuong trinh co 2 nghiem phan biet x1="+ x1 +";x2="+x2;
        
        return kq;
    }
    
}
