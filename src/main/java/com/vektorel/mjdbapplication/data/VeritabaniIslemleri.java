package com.vektorel.mjdbapplication.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VeritabaniIslemleri {
    
    private static final String sunucuAdresi = "localhost";
    private static final String port = "5432";
    private static final String kullaniciAdi = "postgres";
    private static final String kullaniciSifre = "postgres";
    private static final String veritabani = "vektorel";
    
    public boolean kayitEkle(String query) {
        try {
            Connection connection = baglantiVer();
            if (connection != null) {
                PreparedStatement statement = connection.prepareStatement(query);
                int dbSonuc = statement.executeUpdate();
                connection.close();
                
                if (dbSonuc > 0) 
                    return true;
                else
                    return false;
            }
            
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return true; //Neden true? false olmalı sanırım!!!
    }
    
    public boolean kayitSil(String query) {
        try {
            Connection connection = baglantiVer();
            if (connection != null) {
                PreparedStatement statement = connection.prepareStatement(query);
                int dbSonuc = statement.executeUpdate();
                connection.close();
                
                if (dbSonuc > 0) 
                    return true;
                else
                    return false;
            }
            
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return true; //Neden true? false olmalı sanırım!!!
    }
    
    public boolean kayitGuncelle(String query) {
        try {
            Connection connection = baglantiVer();
            if (connection != null) {
                PreparedStatement statement = connection.prepareStatement(query);
                int dbSonuc = statement.executeUpdate();
                connection.close();
                
                if (dbSonuc > 0) 
                    return true;
                else
                    return false;
            }
            
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return true; //Neden true? false olmalı sanırım!!!
    }
    
    public ResultSet kayitGetir(String query){
        try {
            Connection connection = baglantiVer();
            if (connection != null) {
                PreparedStatement statement = connection.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery();
                connection.close();
                return resultSet;
            }
        } catch (SQLException e) {
        }
        return null;
    }
    
    
    private Connection baglantiVer () {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://" + sunucuAdresi + ":" + port + "/" + veritabani;
            Connection connection = DriverManager.getConnection(url, kullaniciAdi, kullaniciSifre);
            return connection;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}