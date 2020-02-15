package com.example.entity;

import javax.persistence.*;

@Entity
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Wycieczka;

    private String KrajPoczatkowy;
    private String HotelDocelowy;
    private Integer CenaWycieczki;
    private String KiedyWylot;
    private String KiedyPowrot;
    public Tour() {

    }


    @Override
    public String toString() {
        return "Tour{" +
                "id=" + id +
                ", Wycieczka='" + Wycieczka + '\'' +
                ", KrajPoczatkowy='" + KrajPoczatkowy + '\'' +
                ", HotelDocelowy='" + HotelDocelowy + '\'' +
                ", CenaWycieczki=" + CenaWycieczki +
                ", KiedyWylot='" + KiedyWylot + '\'' +
                ", KiedyPowrot='" + KiedyPowrot + '\'' +
                '}';
    }

    public Tour(String Wycieczka, long id, String KrajPoczatkowy, String HotelDocelowy,  int CenaWycieczki,
                String KiedyWylot, String KiedyPowrot){
    this.Wycieczka = Wycieczka;
    this.id= id;
    this.KrajPoczatkowy=KrajPoczatkowy;
    this.HotelDocelowy=HotelDocelowy;
    this.CenaWycieczki=CenaWycieczki;
    this.KiedyWylot=KiedyWylot;
    this.KiedyPowrot=KiedyPowrot;


}




    public Long getId() {
        return id;
    }

    public String getWycieczka() {
        return Wycieczka;
    }

    public String getKrajPoczatkowy() {
        return KrajPoczatkowy;
    }


    public String getHotelDocelowy() {
        return HotelDocelowy;
    }



    public Integer getCenaWycieczki() {
        return CenaWycieczki;
    }



    public String getKiedyWylot() {
        return KiedyWylot;
    }



    public String getKiedyPowrot() {
        return KiedyPowrot;
    }


}

