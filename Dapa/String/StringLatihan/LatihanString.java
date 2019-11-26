import java.util.Scanner;

class peserta{
    String namaDepan, namaBelakang, npm;

    public peserta(String namaDepan, String namaBelakang, String npm){
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.npm = npm;
        //Daffa Daraz Aslam
    }
}

class LatihanString{
    public static Scanner scan = new Scanner (System.in);

    public static peserta[] InputData(int jum){
        String namaDepanT, namaBelakangT, npmT;
        peserta[] dataPeserta = new peserta[jum];
        for(int i = 0; i < jum; i++){
            System.out.println("Peserta ke - "+(i+1));
            System.out.print("Nama Depan    : "); namaDepanT = scan.nextLine();
            System.out.print("Nama Belakang : "); namaBelakangT = scan.nextLine();
            System.out.print("NPM           : "); npmT = scan.nextLine();
            
            dataPeserta[i] = new peserta(namaDepanT, namaBelakangT, npmT);
        }
        return dataPeserta;
    }

    public static String namaLengkap(String namaDepanT, String namaBelakangT){
        return namaDepanT.concat(" "+namaBelakangT);
    }

    // 111 17 400
    public static String jurusan(String npm){
        String cari = npm.substring(0,3);
        String jurusan;
        if( cari.equals("110") )
            jurusan = "SI";
        else if( cari.equals("510") )
            jurusan = "TI";
        else if( cari.equals("111") )
            jurusan = "MI";
        else if( cari.equals("310") )
            jurusan = "SK";
        else if( cari.equals("311") )
            jurusan = "TK";
        else
            jurusan = "NA";

        return jurusan;
    }

    public static String angkatan(String npm){
        return npm.substring(3,5);
    }

    public static void OutputData(peserta[] dataPeserta){
        System.out.println();
        System.out.println("DATA PESERTA");
        System.out.println("PELATIHAN PEMGROGRAMAN JAVA");
        System.out.println("----------------------------------------------------------------");
        System.out.format("%-15s%-25s%-15s%-15s","NPM","Nama Lengkap","Jurusan","Angkatan");
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        
        for(int i = 0; i < dataPeserta.length; i++){
            String npmo = dataPeserta[i].npm;
            String namaLengkapo = namaLengkap(dataPeserta[i].namaDepan, dataPeserta[i].namaBelakang);
            String jurusano = jurusan(npmo);
            String angkatano = angkatan(npmo);
            System.out.format("%-15s%-25s%-15s%-15s",npmo,namaLengkapo,jurusano,angkatano);
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------");
    }
    public static void main(String[] args) {
        System.out.print("Banyak data : ");
        int jum = scan.nextInt(); scan.nextLine();
        peserta[] dataPeserta = InputData(jum);
        OutputData(dataPeserta);
    }
}