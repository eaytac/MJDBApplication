
package com.vektorel.mjdbapplication.sql;

public class Script {

/*

    CREATE SEQUENCE public.seq_kullanici_id
    INCREMENT 1
    START 4
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

-----------------------------------------------------------------------
	
CREATE SEQUENCE public.seq_ogrenci_id
    INCREMENT 1
    START 11
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

-----------------------------------------------------------------------

CREATE TABLE public.kullanici
(
    kullanici_adi character varying(70) COLLATE pg_catalog."default",
    sifre character varying(70) COLLATE pg_catalog."default",
    ad_soyad character varying(200) COLLATE pg_catalog."default",
    id bigint NOT NULL DEFAULT nextval('seq_kullanici_id'::regclass),
    CONSTRAINT kullanici_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

-----------------------------------------------------------------------

CREATE TABLE public.ogrenci
(
    ad character varying(70) COLLATE pg_catalog."default",
    soyad character varying(70) COLLATE pg_catalog."default",
    yas integer,
    okul_no character varying(30) COLLATE pg_catalog."default",
    bolum_adi character varying(200) COLLATE pg_catalog."default",
    id bigint NOT NULL DEFAULT nextval('seq_ogrenci_id'::regclass),
    CONSTRAINT ogrenci_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;
    
*/
    
}
