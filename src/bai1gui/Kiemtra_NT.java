/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1gui;

/**
 *
 * @author admin
 */
public class Kiemtra_NT {
    private int n;

    public  Kiemtra_NT(int n) {
        this.n=n;
    }
    public boolean KT(){
        for(int i=2; i<n/2; i++)
            if (n%2==0) return false;
                   return true;
    }
    
}
