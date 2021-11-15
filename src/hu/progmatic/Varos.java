package hu.progmatic;

public class Varos {
  public static int sebessegHatar;
  final String nev;
  private Urhajo[] urhajok;

  public Varos(String nev, Urhajo[] urhajok) {
    this.nev = nev;
  }

  public Urhajo[] getUrhajok() {
    return urhajok;
  }

  public void setUrhajok(int index, Urhajo urhajo) {
    if (index < 0 || index >= urhajok.length) {
      throw new RuntimeException();
    }
  }

  public String getNev() {
    return nev;
  }

  public void urhajoLista(Urhajo[] urhajok) {
    System.out.println("==============================");
    System.out.println(getNev() + " Űrhajói");
    System.out.println("==============================");

    for (int i = 0; i < urhajok.length; i++) {
      if (urhajok[i] != null) {
        System.out.println("Építési év: " + urhajok[i].getEpitesiEv());
        System.out.println("Típus: " + urhajok[i].getTipus());
        System.out.println();
      }
    }
  }

  public void leggyorsabbUrhajo(Urhajo[] urhajok) {
    System.out.println("================================");
    System.out.println(getNev() + " Leggyorsabb Úrhajója");
    System.out.println("================================");

    int leggyorsabb = Integer.MIN_VALUE;

    for (int i = 0; i < urhajok.length; i++) {
        if (urhajok[i] != null && leggyorsabb < urhajok[i].getAktualisSebesseg()) {
          leggyorsabb = i;
      }
    }
    System.out.println("Típus: " + urhajok[leggyorsabb].getTipus());
    System.out.println("Építési év: " + urhajok[leggyorsabb].getEpitesiEv());
    System.out.println();
  }

  public void tipusLista(String tipus, Urhajo[] urhajok) {
    System.out.println("==========================================");
    System.out.println(getNev() + "(" + tipus + " típusú űrhajók listája)");
    System.out.println("=========================================");

    for (int i = 0; i < urhajok.length; i++) {
      if (urhajok[i] != null && urhajok[i].getTipus().equals(tipus)) {
        System.out.println("Építési év: " + urhajok[i].getEpitesiEv());
        System.out.println("Típus: " + urhajok[i].getTipus());
        System.out.println();
      }
    }
  }

  public void gyorsHajtokLista(Urhajo[] urhajok) {
    System.out.println("================================");
    System.out.println(getNev() + " Gyorshajtó Úrhajói");
    System.out.println("================================");

    if (sebessegHatar >= 0) {
      System.out.println("Nincs sebességhatár!");
    } else {
      for (int i = 0; i < urhajok.length; i++) {
        if (urhajok[i] != null && urhajok[i].getAktualisSebesseg() > sebessegHatar) {
          System.out.println("Építési év: " + urhajok[i].getEpitesiEv());
          System.out.println("Típus: " + urhajok[i].getTipus());
          System.out.println();
        }
      }
    }
  }
}