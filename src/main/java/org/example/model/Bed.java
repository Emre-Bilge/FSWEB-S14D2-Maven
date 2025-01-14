package org.example.model;

public class Bed {
    // Instance değişkenleri
    private String style;   // Yatak stili
    private int pillows;    // Yastık sayısı
    private int height;     // Yatak yüksekliği
    private int sheets;     // Çarşaf sayısı
    private int quilts;      // Yorgan sayısı

    // Constructor
    public Bed(String style, int pillows, int height, int sheets, int quilts) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }

    // Metotlar
    public void make() {
        System.out.println("The bed is being made.");
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }
    public String getStyle(){
       return this.style;
    }
}


/*package org.example.model;

public class Bed {

    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilts;


    public Bed(String style, int pillows, int height, int sheets, int quilts) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }

    public void make(){
        System.out.println("The bed is being made.");
    }

    public int getPillows() {
        return this.pillows;
    }

    public int getHeight() {
        return this.height;
    }

    public int getSheets() {
        return this.sheets;
    }

    public int getQuilts() {
        return this.quilts;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "style='" + style + '\'' +
                ", pillows=" + pillows +
                ", height=" + height +
                ", sheets=" + sheets +
                ", quilts=" + quilts +
                '}';
    }
}*/
