import java.util.*;
public class determinant3x3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] detA = new int[3][3];
        int[][] detB = new int[3][3];
        int[][] hasil = new int[3][3];

        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print("Masukkan nilai Matrix A index ke - ["+i+"]["+j+"] : ");
                detA[i][j] = input.nextInt();
            }
        }
        System.out.println("--------------------------------------------\n");

        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(detA[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("--------------------------------------------\n");

        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print("Masukkan nilai Matrix B index ke - ["+i+"]["+j+"] : ");
                detB[i][j] = input.nextInt();
            }
        }
        System.out.println("--------------------------------------------\n");

        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(detB[i][j] + "\t");
            }
            System.out.println("");
        }

        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0; j<3 ; j++){
                hasil[i][j] = 0;
                    for(int k = 0; k < 3; k++){
                        hasil[i][j] += detA[i][k] * detB[k][i];
                    }
            }
        }
        System.out.println("--------------------------------------------\n");
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println("");
        }
        input.close();

    }
}
