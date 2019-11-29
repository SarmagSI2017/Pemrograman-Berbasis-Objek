
package siwir;

import java.util.Scanner;


public class Siwir {
    String nama;
    String jurusan;
    String angkatan;
    String nm; 
    public Siwir(String n1,String n2, String nom){
    
    switch (nom.substring(0, 3)) {
            case "101":
                this.jurusan=("Sistem info");
            case "570":
                this.jurusan=("Teknik info");
            case "111":
                this.jurusan=("Manajemen info");
            case "310":
                this.jurusan=("Sis Kom");
            case "311":
                this.jurusan=("Tek Kom");
        }     
    
    this.angkatan=nom.substring(3, 5);
    this.nama=n1.concat(n2);
    this.nm=nom;
    
    
    }
    

    
    
    
    public static void main(String[] args) {
        Siwir[] data = new Siwir[4];
        Scanner masuk = new Scanner(System.in);
        String namdep;
        String nambel;
        String npm;


        
        
        
        for(int i=0;i<2;i++){
            namdep = masuk.nextLine();
            nambel= masuk.nextLine();
            npm= masuk.nextLine();
            data[i]=new Siwir(namdep,nambel,npm);
            
        
        
        }
        System.out.println();
        System.out.println();
        System.out.println();
        
        for(int i=0;i<2;i++){
        
        System.out.format("%-50s%-50s%-50s%-50s\n",data[i].nm,data[i].nama,data[i].jurusan,data[i].angkatan);
        
        }
        
        
    }
    
}
