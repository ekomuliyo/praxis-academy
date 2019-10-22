
import java.util.Scanner;

public class PenjumlahanMatriksInput{
    public static void main(String[] args) {

        Scanner inputMatriks = new Scanner(System.in);
        

        System.out.println("Masukan Matriks Pertama");
        
        int matriks1[][] = new int[3][3];
        for(int i=0; i < matriks1.length; i++){
            for(int j=0; j < matriks1.length; j++){
                System.out.format("Masukan nilai baris ke - %d kolom ke - %d : ", i+1, j+1 );
                matriks1[i][j] = inputMatriks.nextInt();
            }
        }

        System.out.println();
        
        System.out.println("Masukan Matriks Kedua");

        int matriks2[][] = new int[3][3];
        for(int i=0; i< matriks2.length; i++){
            for(int j=0; j < matriks2.length; j++){
                System.out.format("Masukan nilai baris ke - %d kolom ke - %d : ", i+1, j+1);
                matriks2[i][j] = inputMatriks.nextInt();
            }
        }

        System.out.println();

        // menampilkan 
        
        // Matriks1
        System.out.println("Matriks 1");
        for (int i = 0; i < matriks1.length; i++) {
            for (int j = 0; j < matriks1.length; j++) {
                System.out.print(matriks1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Matriks2
        System.out.println("Matriks 2");
        for (int i = 0; i < matriks2.length; i++) {
            for (int j = 0; j < matriks2.length; j++) {
                System.out.print(matriks2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Hasil
        System.out.println("Hasil");
        for(int i=0; i < matriks1.length; i++){
            for(int j=0; j < matriks1.length; j++){
                int element = matriks1[i][j] + matriks2[i][j];
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}