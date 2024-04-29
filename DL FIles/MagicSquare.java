import java.util.*;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rowSize = 0;
        int colSize = 0;
        while (true) {
            while (true) {
                try {
                    System.out.print("Enter the number of rows (Max of 15): ");
                    rowSize = input.nextInt();
                    System.out.print("Enter the number of columns (Max of 15): ");
                    colSize = input.nextInt();


                    if (rowSize>15||rowSize<=0) {
                        System.out.println("The number of rows and columns must be on the range.");
                        while (true) {
                            System.out.print("Would you like to try again? (Y/N): ");
                            char retry = input.next().charAt(0);

                            if (retry == 'N' || retry == 'n') {
                                return;
                            }
                            else if (retry == 'Y'|| retry== 'y'){
                                break;
                            }
                            else {
                                System.out.println("Please Only Input Y or N");
                            }
                        }   
                    }
                    else if (rowSize != colSize || rowSize % 2 == 0) {
                        System.out.println("The number of rows and columns must be equal and odd for a magic square.");
                        while (true) {
                            System.out.print("Would you like to try again? (Y/N): ");
                            char retry = input.next().charAt(0);

                            if (retry == 'N' || retry == 'n') {
                                return;
                            }
                            else if (retry == 'Y'|| retry== 'y'){
                                break;
                            }
                            else {
                                System.out.println("Please Only Input Y or N");
                            }
                        }   
                    } 
                    else{
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number.");
                    input.next();

                    while (true) {
                        System.out.print("Would you like to try again? (Y/N): ");
                        char retry = input.next().charAt(0);

                        if (retry == 'N' || retry == 'n') {
                            return;
                        }
                        else if (retry == 'Y'|| retry== 'y'){
                            break;
                        }
                        else {
                            System.out.println("Please Only Input Y or N");
                        }
                    }   
                }
            }

            int[][] magicSquare = new int[rowSize][colSize];

            int row = 0;
            int col = rowSize / 2;
            magicSquare[row][col] = 1;

            for (int i = 2; i <= rowSize * rowSize; i++) {
                if (magicSquare[(row - 1 + rowSize) % rowSize][(col + 1) % rowSize] == 0) {
                    row = (row - 1 + rowSize) % rowSize;
                    col = (col + 1) % rowSize;
                } else {
                    row = (row + 1) % rowSize;
                }
                magicSquare[row][col] = i;
            }

            // print magic square
            System.out.println("Magic Square:");
            for (int i = 0; i < rowSize; i++) {
                for (int j = 0; j < rowSize; j++) {
                    System.out.printf("%4d",magicSquare[i][j]);
                }
                System.out.println();
            }

            // ask if the user wants to try again
            while (true) {
                System.out.print("Would you like to try again? (Y/N): ");
                char retry = input.next().charAt(0);

                if (retry == 'N' || retry == 'n') {
                    return;
                }
                else if (retry == 'Y'|| retry== 'y'){
                    break;
                }
                else {
                    System.out.println("Please Only Input Y or N");
                }
            } 
        }  
    }
}
