
public class PenjumlahanMatriks{
    public static void main(String[] args) {

        int matriks1[][] = new int[3][3];

        matriks1[0][0] = 2;
        matriks1[0][1] = 3;
        matriks1[0][2] = 5;

        matriks1[1][0] = 1;
        matriks1[1][1] = 5;
        matriks1[1][2] = 2;

        matriks1[2][0] = 4;
        matriks1[2][1] = 7;
        matriks1[2][2] = 9;

        int matriks2[][] = new int[3][3];

        matriks2[0][0] = 6;
        matriks2[0][1] = 7;
        matriks2[0][2] = 3;

        matriks2[1][0] = 8;
        matriks2[1][1] = 10;
        matriks2[1][2] = 11;

        matriks2[2][0] = 7;
        matriks2[2][1] = 10;
        matriks2[2][2] = 15;

        for(int i=0; i < matriks1.length; i++){
            for(int j=0; j < matriks1.length; j++){
                int element = matriks1[i][j] + matriks2[i][j];
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}