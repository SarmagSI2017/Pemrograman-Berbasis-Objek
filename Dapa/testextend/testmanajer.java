class karyawan1 {
    private String nama;
    private double gaji;
    private static double persengaji = 0.10;

    karyawan1(String nm, double gj){
        nama = nm;
        gaji = gj;
    }

    void setNama(String nm){
        nama = nm;
    }

    String getNama(){
        return nama;
    }

    void setGaji(double gj){
        gaji = gj;
    }

    double getGaji(){
        return gaji;
    }

    void setPersentase(double persen){
        persengaji = persen;
    }

    double getPersentase(){
        return persengaji;
    }

    void naikGaji(){
        gaji+=(gaji*persengaji);
    }
}

class manajer extends karyawan1{
    private static double bonus = 500000;

    manajer(String nm, double gj){
        super(nm,gj);//(gj+bonus));
    }

    double getBonus(){
        return bonus;
    }

    void setBonus(double bns){
        //double temp = super.getGaji() - bonus;
        bonus = bns;
        //super.setGaji(temp+bonus);
    }

    double getGaji(){
        double gajidasar = super.getGaji();
        return gajidasar + bonus;
    }
}

public class testmanajer{
    public static void main(String[] args) {
        manajer kar = new manajer("ANDI",300000);
        System.out.println("Nama Karyawan  : "+kar.getNama());
        System.out.println("Gaji Dasar     : "+(kar.getGaji()-kar.getBonus()));
        System.out.println("Bonus Karyawan : "+kar.getBonus());
        System.out.println("Gaji Karyawan  : "+kar.getGaji());
        kar.naikGaji();
        System.out.println("------------------");
        System.out.println("Naik Gaji      : "+kar.getGaji());
    }
}