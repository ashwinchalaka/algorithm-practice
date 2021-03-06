class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        int matrixRows = matrix.length;
        int matrixCols = matrix[0].length;
        
        int[] diagOrderArr = new int[matrixRows * matrixCols];
        
        int iMatrix = 0;
        int jMatrix = 0;
        
        int upOrDown = 0;
        
        // System.out.print("\n" + matrix[iMatrix][jMatrix]);
        
        for (int p = 0; p < diagOrderArr.length; p++) {
            
            if (upOrDown == 0) {
                System.out.print("\n#1\n");
                jMatrix++;
                upOrDown = 2;
            }
            else if (jMatrix >= matrixCols && iMatrix <= 0){
                System.out.print("\n#2\n");
                iMatrix++;
                jMatrix--;
                iMatrix++;
                upOrDown = 2;
            }
            else if (iMatrix >= matrixRows && jMatrix <= 0) {
                System.out.print("\n#3\n");
                iMatrix--;
                jMatrix++;
                jMatrix++;
                upOrDown = 1;
            }
            else if (upOrDown == 1) {
                System.out.print("\n#6\n");
                if (iMatrix == 0) {
                    jMatrix++;
                    upOrDown = 2;
                } else if (iMatrix == matrixRows) {
                    jMatrix++;
                    upOrDown = 1;
                } else {
                    iMatrix--;
                    jMatrix++;   
                }
                
            } else if (upOrDown == 2) {
                System.out.print("\n#7\n");
                if (jMatrix == 0) {
                    iMatrix++;
                    upOrDown = 1;
                } else if (jMatrix == matrixCols) {
                    iMatrix++;
                    upOrDown = 2;
                } else {
                    iMatrix++;
                    jMatrix--;
                }   
                
            } else {
                System.out.print("\n#8\ngotta debug something here...");
            }
                
            System.out.print("\n" + matrix[iMatrix][jMatrix]);
            
        }

        return diagOrderArr;

    }
}

// class Solution {
    
//     private static boolean isPointerValid(int[] pointer, int[][] matrix) {
//         return pointer[0] < matrix.length-1 && pointer[1] < matrix[0].length-1;
//     }
    
//     private static int whichDirection4Pointer(int[] pointer, int[][] matrix) {
//         if ((pointer[0] == 0 || pointer[0] == matrix.length-1) 
//                  && pointer[1] % 2 == 0)
//             return 1; // go right
//         else if ((pointer[0] == 0 && pointer[1] % 2 == 1)
//                  || (pointer[1] == matrix[0].length-1 && pointer[0] % 2 == 1))
//             return 2; // go diagonally down
//         else if ((pointer[1] == 0 && pointer[0] % 2 == 1)
//                  || (pointer[1] == matrix[0].length-1 && pointer[0] % 2 == 0))
//             return 3; // go straight down
//         else if ((pointer[1] == 0 && pointer[0] % 2 == 0)
//                  || (pointer[0] == matrix.length-1 && pointer[0] % 2 == 1))
//             return 4; // go diagonally up
//         else
//             return 5;
//     }
    
//     private static void goRight(int[] pointer) {
//         pointer[1]++;
//     }
//     private static void goDiagDown(int[] pointer) {
//         pointer[0]++;
//         pointer[1]--;
//     }
//     private static void goDown(int[] pointer) {
//         pointer[0]++;
//     }
//     private static void goDiagUp(int[] pointer) {
//         pointer[0]--;
//         pointer[1]++;
//     }
    
//     private static void writeTo1DArray(int[][] matrix, int[] pointerMatrix, int[] array, int pointerArray) {
//         array[pointerArray] = matrix[pointerMatrix[0]][pointerMatrix[1]];
//         pointerArray++;
//     }
    
//     public int[] findDiagonalOrder(int[][] matrix) {
        
//         int[] indexPointer4Matrix = {0,0};
//         int[] diagOrderArray = new int[matrix.length * matrix[0].length];
//         int indexPointer4Array = 0;
        
//         // System.out.println("Length of return array = " + diagOrderArray.length);
        
//         if (matrix.length > matrix[0].length) {
            
//             String str = "";
            
//             for (int i = 0; i < matrix.length; i++) {
//                 if (i != 0) {
//                     indexPointer4Matrix[0]++;
//                     indexPointer4Matrix[1] = 0;
//                 }
//                 for (int j = 0; j < matrix[0].length; j++) {
//                     if (j != 0)
//                         indexPointer4Matrix[1]++;
//                     str += "\n\npointer position = ("
//                                + indexPointer4Matrix[0] + "," + indexPointer4Matrix[1] + ")" 
//                                + "\npointerRowIsValid = " + pointerRowIsValid
//                                + "\npointerColumnIsValid = " + pointerColumnIsValid
//                                + "\npointerNeedsToGoRight = " + pointerNeedsToGoRight
//                                + "\npointerNeedsToGoDiagDown = " + pointerNeedsToGoDiagDown
//                                + "\npointerNeedsToGoDiagUp = " +pointerNeedsToGoDiagUp
//                                + "\npointerNeedsToGoDown = " + pointerNeedsToGoDown;
//                 }
//             }
            
//             System.out.println(str);
            
//             // System.out.println("\npointer position = ("
//             //                    + indexPointer4Matrix[0] + "," + indexPointer4Matrix[1] + ")" 
//             //                    + "\npointerRowIsValid = " + pointerRowIsValid
//             //                    + "\npointerColumnIsValid = " + pointerColumnIsValid
//             //                    + "\npointerNeedsToGoRight = " + pointerNeedsToGoRight
//             //                    + "\npointerNeedsToGoDiagDown = " + pointerNeedsToGoDiagDown
//             //                    + "\npointerNeedsToGoDiagUp = " +pointerNeedsToGoDiagUp
//             //                    + "\npointerNeedsToGoDown = " + pointerNeedsToGoDown);
            
// //             while (pointerRowIsValid && pointerColumnIsValid) {
                
// //                 if (pointerNeedsToGoRight)
// //                     goRight(indexPointer4Matrix);
// //                 else if (pointerNeedsToGoDiagDown)
// //                     goDiagDown(indexPointer4Matrix);
// //                 else if (pointerNeedsToGoDiagUp)
// //                     goDiagUp(indexPointer4Matrix);
// //                 else if (pointerNeedsToGoDown)
// //                     goDown(indexPointer4Matrix);
// //                 else
// //                     System.out.println("\nERROR:\nMatrix Type: ROWS > COLS\nError Type: Pointer cannot move right,down,diag,etc.\n");
        
// //                 writeTo1DArray(matrix,indexPointer4Matrix,diagOrderArray,indexPointer4Array);
//             }
            
// //         } else if (matrix.length < matrix[0].length) {
            
// //         } else if (matrix.length == matrix[0].length) {
            
// //         } else {
// //             System.out.println("new case...");
// //         }
        
// //         writeTo1DArray(matrix,indexPointer4Matrix,diagOrderArray,indexPointer4Array);
//         return diagOrderArray;
        
// //         while (indexPointer4Matrix[0] < matrix.length-1 && indexPointer4Matrix[1] < matrix[0].length-1) {
            
// //             if () {
// //                 writeTo1DArray(matrix,indexPointer4Matrix,diagOrderArray,indexPointer4Array);
// //                 goRight(indexPointer4Matrix);
// //             } else if () {
// //                 writeTo1DArray(matrix,indexPointer4Matrix,diagOrderArray,indexPointer4Array);
// //                 goDown(indexPointer4Matrix);
// //             } else if () {
// //                 writeTo1DArray(matrix,indexPointer4Matrix,diagOrderArray,indexPointer4Array);
// //                 goDiagDown(indexPointer4Matrix);
// //             } else if () {
// //                 writeTo1DArray(matrix,indexPointer4Matrix,diagOrderArray,indexPointer4Array);
// //                 goDiagUp(indexPointer4Matrix);
// //             } else {
// //                 System.out.println("Something is wrong...");
// //             }
// //         }

//     }
// }