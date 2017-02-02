
package com.vektorel.mjdbapplication.sql;

import com.vektorel.mjdbapplication.data.Kullanici;
import com.vektorel.mjdbapplication.data.VeritabaniIslemleri;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KullaniciSql implements ISql<Kullanici>{

    VeritabaniIslemleri veritabaniIslemleri = new VeritabaniIslemleri();
    
    @Override
    public boolean ekle(Kullanici nesne) {
        String query = "insert into kullanici (kullanici_adi, sifre, ad_soyad) values ('" 
                + nesne.getKullaniciAdi()+ "', '"
                + nesne.getSifre()+"', '"
                + nesne.getAdSoyad()+"');";
        return veritabaniIslemleri.kayitEkle(query);
    }

    @Override
    public boolean guncelle(Kullanici nesne) {
        String query ="update kullanici set kullanici_adi='" 
        + nesne.getKullaniciAdi()+"', sifre='"
        + nesne.getSifre()+"', ad_soyad='"
        + nesne.getAdSoyad()+"' where id=" + nesne.getId();
        return veritabaniIslemleri.kayitGuncelle(query);
    }

    @Override
    public boolean sil(Long id) {
        boolean silmeSonuc = veritabaniIslemleri.kayitSil("delete from kullanici where id=" + id);
        return silmeSonuc;
    }

    @Override
    public List<Kullanici> getir() {
        ResultSet resultSet = veritabaniIslemleri.kayitGetir("select * from kullanici");
        List<Kullanici> list = new ArrayList<>();
        try {
            while(resultSet.next()){
                Kullanici k = new Kullanici();
                k.setId(resultSet.getLong("id"));
                k.setKullaniciAdi(resultSet.getString("kullanici_adi"));
                k.setSifre(resultSet.getString("sifre"));
                k.setAdSoyad(resultSet.getString("ad_soyad"));
                list.add(k);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Kullanici kullaniciAdiSifreIleGetir(String username, String password) {
        String query = "select * from kullanici where kullanici_adi='" + username + "' and sifre='" + password + "'";
        ResultSet resultSet = veritabaniIslemleri.kayitGetir(query);
        
        try {
            Kullanici k = new Kullanici();
            if (resultSet.next()) {
                k.setId(resultSet.getLong("id"));
                k.setKullaniciAdi(resultSet.getString("kullanici_adi"));
                k.setSifre(resultSet.getString("sifre"));
                k.setAdSoyad(resultSet.getString("ad_soyad"));
                return k;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
