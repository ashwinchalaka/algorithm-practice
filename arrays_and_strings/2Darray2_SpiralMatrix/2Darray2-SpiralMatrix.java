class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if (matrix.length == 0) {
            ArrayList<Integer> spiralMatrixOrder = new ArrayList<>();
            return spiralMatrixOrder;
        }
        
        int matrixRows = matrix.length;
        int matrixCols = matrix[0].length;
        
        int matrixElements = matrixRows * matrixCols;
        
        int iMatrix = 0;
        int jMatrix = 0;
        
        ArrayList<Integer> spiralMatrixOrder = new ArrayList<>();
        
        int directionStatus = 1; // 1: right | 2: down | 3: left | 4: up
        
        int topBarrierIndex = 0;
        int rightBarrierIndex = matrixCols-1;
        int bottomBarrierIndex = matrixRows-1;
        int leftBarrierIndex = 0;
        
        for (int p = 0; p < matrixElements; p++) {
            
            spiralMatrixOrder.add(matrix[iMatrix][jMatrix]);
            
            switch (directionStatus) {
                case 1: // going right
                    jMatrix++;
                    break;
                case 2: // going down
                    iMatrix++;
                    break;
                case 3: // going left
                    jMatrix--;
                    break;
                case 4: // going up
                    iMatrix--;
                    break;
                default: // catch all
                    System.out.print("Switch Statement error...");
                    break;
            }
            
            if (jMatrix > rightBarrierIndex) {
                jMatrix--;
                iMatrix++;
                directionStatus = 2;
                topBarrierIndex++;
            }
            else if (iMatrix > bottomBarrierIndex) {
                iMatrix--;
                jMatrix--;
                directionStatus = 3;
                rightBarrierIndex--;
            }
            else if (jMatrix < leftBarrierIndex) {
                jMatrix++;
                iMatrix--;
                directionStatus = 4;
                bottomBarrierIndex--;
            }
            else if (iMatrix < topBarrierIndex) {
                iMatrix++;
                jMatrix++;
                directionStatus = 1;
                leftBarrierIndex++;
            }
            else
                System.out.println("No change in direction.");
            
        }
        
        return spiralMatrixOrder;
    }
}