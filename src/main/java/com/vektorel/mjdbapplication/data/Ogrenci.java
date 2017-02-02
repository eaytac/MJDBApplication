
package com.vektorel.mjdbapplication.data;

public class Ogrenci {
    
    String ad;
    String soyad;
    int yas;
    String okulNo;
    String bolumAdi;
    Long id;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(String okulNo) {
        this.okulNo = okulNo;
    }

    public String getBolumAdi() {
        return bolumAdi;
    }

    public void setBolumAdi(String bolumAdi) {
        this.bolumAdi = bolumAdi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ogrenci{" + "ad=" + ad + ", soyad=" + soyad + ", yas=" + yas + ", okulNo=" + okulNo + ", bolumAdi=" + bolumAdi + ", id=" + id + '}';
    }
    
    
}
