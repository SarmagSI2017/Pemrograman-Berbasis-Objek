import java.util.Scanner;

class peserta{
    String namaDepan, namaBelakang, namaLengkap, npm, jurusan, angkatan;

    public peserta(String namaDepan, String namaBelakang, String npm){
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.namaLengkap = namaDepan.concat(" "+namaBelakang);
        this.npm = npm;
        this.jurusan = jurusan(npm);
        this.angkatan = npm.substring(3,5);
        //Daffa Daraz Aslam
    }

    public static String jurusan(String npm){
        String cari = npm.substring(0,3);
        
        switch (cari){
            case "110":
                return "SI";
            case "510":
                return "TI";
            case "111":
                return "MI";
            case "310":
                return "SK";
            case "311":
                return "TK";
            default:
                return "NA";
        }
    }
}

class StringOb{
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
            System.out.format("%-15s%-25s%-15s%-15s",
                                npmo,
                                dataPeserta[i].namaLengkap,
                                dataPeserta[i].jurusan,
                                dataPeserta[i].angkatan);
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