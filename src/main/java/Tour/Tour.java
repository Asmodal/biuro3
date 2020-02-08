package Tour;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String Wycieczka;
    private String KrajPoczatkowy;
    private String WhereFlyOut;
    private String HotelDocelowy;
    private String WhatHotelIn;
    private Integer CenaWycieczki;
    private Integer PriceOfVacation;
    private String KiedyWylot;
    private String WhenFlyOut;
    private String KiedyPowrot;
    private String HowLongStay;




    public Tour() {
    }

    public Integer getId() {
        return Id;
    }

    public String getWycieczka() {
        return Wycieczka;
    }

    public String getKrajPoczatkowy() {
        return KrajPoczatkowy;
    }

    public String getWhereFlyOut() {
        return WhereFlyOut;
    }

    public String getHotelDocelowy() {
        return HotelDocelowy;
    }

    public String getWhatHotelIn() {
        return WhatHotelIn;
    }

    public Integer getCenaWycieczki() {
        return CenaWycieczki;
    }

    public Integer getPriceOfVacation() {
        return PriceOfVacation;
    }

    public String getKiedyWylot() {
        return KiedyWylot;
    }

    public String getWhenFlyOut() {
        return WhenFlyOut;
    }

    public String getKiedyPowrot() {
        return KiedyPowrot;
    }

    public String getHowLongStay() {
        return HowLongStay;
    }
}

