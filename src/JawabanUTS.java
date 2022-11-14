import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JawabanUTS {

    int jumlahprodi = 3;
    static int totalJumlahMahasiswa = 1050;
    public static String[] TI = new String[500];
    public static String[] DKV = new String[300];
    public static String[] TK = new String[250];

    public static void PrintInfoPendaftaran(){
        int totalTI=0;
        int totalSisakuota=0;
        for(int index=0;index<TI.length;index++){
            if(TI[index] != null){
                totalTI++;
            }
        }
        int totalDKV=0;
        for(int index=0;index<DKV.length;index++){
            if(DKV[index] != null){
                totalDKV++;
            }
        }
        int totalTK=0;
        for(int index=0;index<TK.length;index++){
            if (TK[index] != null){
                totalTK++;
            }
        }
        totalSisakuota = totalJumlahMahasiswa - totalTI - totalDKV - totalTK;
        System.out.println("Total TI: " + totalTI + " | Total DKV: " + totalDKV + " | Total TK: " + totalTK );
        System.out.println("Jumlah Seluruh Mahasiswa : "+ totalJumlahMahasiswa + " | Total Sisa Kuota: " + totalSisakuota);
        System.out.println();
    }
    public static void CheckIndexArray(String[] myArray,String Mahasiswa){
        int indexNow = 0;
        for(int index=0; index<myArray.length;index++){
            if(myArray[index] != null){
                indexNow = index+1;
            }
        }
        if(indexNow < myArray.length){
            myArray[indexNow] = Mahasiswa;
        }
    }
    public static void simpanMahasiswa(int angkaRandom, String Mahasiswa){
        switch (angkaRandom){
            case 1:
                CheckIndexArray(TI,Mahasiswa);
                System.out.println("Anda Mendapat Nik : TI22"+ angkaRandom);
                PrintInfoPendaftaran();
                break;
            case 2:
                CheckIndexArray(DKV,Mahasiswa);
                System.out.println("Anda Mendapat Nik : DK22"+ angkaRandom);
                PrintInfoPendaftaran();
                break;
            case 3:
                CheckIndexArray(TK,Mahasiswa);
                System.out.println("Anda Mendapat Nik : TK22"+ angkaRandom);
                PrintInfoPendaftaran();
                break;
        }
    }
    public static void inputMahasiswa(){
        Scanner inputData = new Scanner(System.in);
        while(true){
            System.out.println("Nama Mahasiswa Baru : ");
            String namaMahasiswa = inputData.nextLine();
            System.out.println("Prodi : ");
            String Prodi = inputData.nextLine();
            if(namaMahasiswa.isBlank()){
                System.out.println("Nama Mahasiswa Baru wajib diisi ");
                inputMahasiswa();
            }else{
                Random hasilRandom = new Random();
                int JenisRandom = hasilRandom.nextInt(3)+1;
                simpanMahasiswa(JenisRandom,namaMahasiswa);
            }
        }
    }
    public static void main(String[] args) {
        inputMahasiswa();
    }
}