import java.util.Scanner;

public class Matrik {
    public void jawaban(){
        System.out.print("Jawaban matriks adalah : ");
    }
        public int hitungluas(int p,int l){
            int luas;
            luas=p*l;
            return luas;
        }
        public int hitungvolume(int p,int l,int t){
            int volume;
            volume=p*l*t;
            return volume;
        }
        public static void main(String[] args) {
            int p,l,t;
            int nilai[];
            Scanner matrik=new Scanner(System.in);
            System.out.print("nilai panjang : ");
            p=matrik.nextInt();
            System.out.print("nilai lebar : ");
            l=matrik.nextInt();
            System.out.print("nilai tinggi : ");
            t=matrik.nextInt();
            nilai=new int[3];
            Matrik hitung=new Matrik();
            nilai[0]=hitung.hitungluas(p,l);
            nilai[1]=hitung.hitungvolume(p,l,t);
            nilai[2]=10;
            int bil=0;
            while (bil<=2) {
                hitung.jawaban();
                System.out.println(nilai[bil]);
                bil=bil+1;
            }
        }
}
