
package com.vektorel.mjdbapplication.sql;

import com.vektorel.mjdbapplication.data.Ogrenci;
import com.vektorel.mjdbapplication.data.VeritabaniIslemleri;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OgrenciSql implements ISql<Ogrenci>{
    
    VeritabaniIslemleri veritabaniIslemleri = new VeritabaniIslemleri();

    @Override
    public boolean ekle(Ogrenci nesne) {
        String query = "insert into ogrenci (ad, soyad, yas, okul_no, bolum_adi)\n values ('" 
                + nesne.getAd() + "', '"
                + nesne.getSoyad()+"', "
                + nesne.getYas()+", '"
                + nesne.getOkulNo()+"', '"
                + nesne.getBolumAdi()+"');";
        return veritabaniIslemleri.kayitEkle(query);
    }

    @Override
    public boolean guncelle(Ogrenci nesne) {
        String query ="update ogrenci set ad='" 
                + nesne.getAd() +"', soyad='"
                + nesne.getSoyad()+"', yas="
                + nesne.getYas()+", okul_no='"
                + nesne.getOkulNo()+"', bolum_adi='"
                + nesne.getBolumAdi()+"' where id=" + nesne.getId();
        return veritabaniIslemleri.kayitGuncelle(query);
    }

    @Override
    public boolean sil(Long id) {
        boolean silmeSonuc = veritabaniIslemleri.kayitSil("delete from ogrenci where id=" + id);
        return silmeSonuc;
    }

    @Override
    public List<Ogrenci> getir() {
        ResultSet resultset = veritabaniIslemleri.kayitGetir("select * from ogrenci");
        List<Ogrenci> list = new ArrayList<>();
        try {
            while (resultset.next()) {
                Ogrenci o = new Ogrenci();
                o.setId(resultset.getLong("id"));
                o.setAd(resultset.getString("ad"));
                o.setSoyad(resultset.getString("soyad"));
                o.setBolumAdi(resultset.getString("bolum_adi"));
                o.setOkulNo(resultset.getString("okul_no"));
                o.setYas(resultset.getInt("yas"));
                list.add(o);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciSql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
