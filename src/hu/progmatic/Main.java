package hu.progmatic;

import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Varos alfapolisz = new Varos("Alfapolisz", otUrhajoGeneralasa());
    Varos betapolisz = new Varos("Bétapolisz", tizUrhajoGeneralasa());

    alfapolisz.urhajoLista(otUrhajoGeneralasa());

    alfapolisz.leggyorsabbUrhajo(otUrhajoGeneralasa());

    alfapolisz.tipusLista("Alfa-1",otUrhajoGeneralasa());

    alfapolisz.gyorsHajtokLista(otUrhajoGeneralasa());
  }


  private static Urhajo[] otUrhajoGeneralasa() {
    return new Urhajo[]{
        new Urhajo(2222, "Alfa-1", 800),
        new Urhajo(2222, "Beta-1", 900),
        new Urhajo(2222, "Gamma-1", 1000),
        new Urhajo(2230, "Alfa-1", 1000),
        new Urhajo(2230, "Beta-2", 1100)
    };
  }

  private static Urhajo[] tizUrhajoGeneralasa() {
    return new Urhajo[]{
        new Urhajo(2222, "Alfa-1", 800),
        new Urhajo(2222, "Beta-1", 900),
        new Urhajo(2222, "Gamma-1", 1000),
        new Urhajo(2230, "Alfa-2", 1000),
        new Urhajo(2230, "Beta-2", 1100),
        new Urhajo(2241, "Gamma-2", 1100),
        new Urhajo(2246, "Alfa-3", 1200),
        new Urhajo(2250, "Beta-3", 1300),
        new Urhajo(2250, "Gamma-3", 1300),
        new Urhajo(2251, "Alfa-4", 1400)
    };
  }

}
