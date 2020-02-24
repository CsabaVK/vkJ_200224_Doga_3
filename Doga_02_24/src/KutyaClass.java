/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author csabavk
 */
public class KutyaClass {
    private String fajta;
    private String nem;
    private int kor;
    private String nev;

    public KutyaClass(String sor) {
        String[] d = sor.split(";");
        this.fajta = d[0];
        this.nem = d[1];
        this.kor = Integer.parseInt(d[2]);
        this.nev = d[3];
    }

    public String getFajta() {
        return fajta;
    }

    public String getNem() {
        return nem;
    }

    public int getKor() {
        return kor;
    }

    public String getNev() {
        return nev;
    }
    
    
}
