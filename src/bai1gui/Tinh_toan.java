/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1gui;

/**
 *
 * @author admin
 */
public class Tinh_toan {
    private String pt;
    private float so1, so2;

    public Tinh_toan( float so1, String pt, float so2) {
        this.pt = pt;
        this.so1 = so1;
        this.so2 = so2;
    }

   
 
    public float Tinh(){
        float kq;
        switch(pt){
            case "+":
                kq= so1+ so2; break;
            case "-":
                kq= so1 - so2; break;
            case "*":
                kq= so1 * so2; break;
            case "/":
                kq= so1 / so2; break;    
            default:
                kq=0; break;
        } 
        return kq;
    }
}
