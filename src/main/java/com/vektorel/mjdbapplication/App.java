package com.vektorel.mjdbapplication;

import com.vektorel.mjdbapplication.ui.frmLogin;

public class App {
    
    public static void main(String[] args) {
        System.out.println("Application is started...");
        
        frmLogin login = new frmLogin(null, true);
        login.setVisible(true);
        
    }
}
