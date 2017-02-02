
package com.vektorel.mjdbapplication.sql;

import java.util.List;

public interface ISql<T> {
    
    boolean ekle(T nesne);
    
    boolean guncelle(T nesne);
    
    boolean sil(Long id);
    
    List<T> getir();
}
