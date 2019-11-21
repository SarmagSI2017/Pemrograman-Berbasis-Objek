/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keluarjajan;

import java.util.*;
/**
 *
 * @author Aditya
 */
public class Keluarjajan {
    private String nama;
    private int uang;
    public Keluarjajan(String namaku,int uangku ){
        this.nama=namaku;
        this.uang=uangku;
    
    }
    public void cetaktabel(String ming,int sen,int sel,int rab, int kam,int jum,int tot, String stats){
        System.out.format("%-10s%-15d%-15d%-15d%-15d%-15d%-15d%-15s",ming,sen,sel,rab,kam,jum,tot,stats);
    }
    
    public void cetak(String name, int money){
        System.out.println();
        System.out.println();
        
        System.out.println("Nama pelapor: "+name);
        System.out.println("Jumlah uang masuk: "+money);
        
        
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.format("%-10s%-15s%-15s%-15s%-15s%-15s%-15s%-15s"," ","Sen ","Sel ","Rab ","Kam","Jum","Total","Stats");
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] hari = {"senin", "selasa", "rabu", "kamis","jumat","sabtu","minggu"};
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("masukkan nama anda: ");
        String nama = masuk.nextLine();
        System.out.println("masukkan uang pemasukkan : ");
        int uangku = Integer.valueOf(masuk.nextLine());
        Keluarjajan data = new Keluarjajan(nama,uangku);
        
        
        int [][]jajan = new int[4][6];
        int [][] trans = new int[4][6];
        int [] keluar = new int[6];
        int [][] tet =  new int[4][6];
        String [] status = new String[4];
        for(int i=0;i<4;i++){
            System.out.println("minggu ke: "+(i+1));
            for(int j =0 ; j<5;j++){
                System.out.println("hari: "+(hari[j]));
                System.out.println("masukkan uang jajan: ");
                jajan[i][j] += Integer.valueOf(masuk.nextLine());
                System.out.println("masukkan uang transport: ");
                trans[i][j] += Integer.valueOf(masuk.nextLine());
                System.out.println();
                tet[i][j]+=jajan[i][j]+trans[i][j];
                keluar[i]+=tet[i][j];
           
                
                
            }
            System.out.println();
            
            if(keluar[i]>=(data.uang/4)){
            status[i]="boros";
            }
            else{status[i]="hemat";}
           
        
        
        }
        data.cetak(data.nama,data.uang);
        
        for(int i=0;i<4;i++){
            //System.out.format("%-10s%-15d%-15d%-15d%-15d%-15d%-15d%-15s","M"+(i+1),tet[i][0],tet[i][1],tet[i][2],tet[i][3],tet[i][4],keluar[i],status[i]);
            
            data.cetaktabel("M"+(i+1),tet[i][0],tet[i][1],tet[i][2],tet[i][3],tet[i][4],keluar[i],status[i]);
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        
        
    }
    
}
