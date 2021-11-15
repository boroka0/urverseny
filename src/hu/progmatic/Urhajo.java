package hu.progmatic;

public class Urhajo {
  private final int epitesiEv;
  private String tipus;
  private int aktualisSebesseg;
  private int magassag;
  private int hossz;
  private int szelesseg;
  private boolean leszabalyozva;

  public boolean isLeszabalyozva() {
    return leszabalyozva;
  }

  public void setLeszabalyozava(boolean leszabalyozva) {
    this.leszabalyozva = leszabalyozva;
    if(getAktualisSebesseg() <= 2500) {
    } else {
      System.out.println("Leszabályozva!");
    }
  }

  public Urhajo(int epitesiEv) {
    this.epitesiEv = epitesiEv;
  }

  public Urhajo(int epitesiEv, String tipus) {
    this.epitesiEv = epitesiEv;
    this.tipus = tipus;
  }

  public Urhajo(int epitesiEv, String tipus, int aktualisSebesseg) {
    this.epitesiEv = epitesiEv;
    this.tipus = tipus;
    this.aktualisSebesseg = aktualisSebesseg;
  }

  public Urhajo(int epitesiEv, String tipus, int magassag, int szelesseg, int hossz) {
    this.epitesiEv = epitesiEv;
    this.tipus = tipus;
    this.magassag = magassag;
    this.szelesseg = szelesseg;
    this.hossz = hossz;
  }

  public int getTerfogat(int magassag, int szelesseg, int hossz) {
    return getMagassag() * getSzelesseg() * getHossz();
  }

  public final int getEpitesiEv() {
    return epitesiEv;
  }

  public String getTipus() {
    return tipus;
  }

  public void setTipus(String tipus) {
    this.tipus = tipus;
  }

  public int getAktualisSebesseg() {
    return aktualisSebesseg;
  }

  public void setAktualisSebesseg(int aktualisSebesseg) {
    this.aktualisSebesseg = aktualisSebesseg;
  }

  public int getMagassag() {
    return magassag;
  }

  public void setMagassag(int magassag) {
    this.magassag = magassag;
  }

  public int getHossz() {
    return hossz;
  }

  public void setHossz(int hossz) {
    this.hossz = hossz;
  }

  public int getSzelesseg() {
    return szelesseg;
  }

  public void setSzelesseg(int szelesseg) {
    this.szelesseg = szelesseg;
  }

  public void kiiras() {
    System.out.println("Építési év: " + epitesiEv);
    System.out.println("Típus: " + tipus);
    System.out.println("Aktuális sebesség: " + aktualisSebesseg);
    System.out.println("Magasság: " + magassag);
    System.out.println("Szélesség: " + szelesseg);
    System.out.println("Hossz: " + hossz);
    System.out.println("Térfogat: " + getTerfogat(magassag, szelesseg, hossz));
    System.out.println();
  }
}
