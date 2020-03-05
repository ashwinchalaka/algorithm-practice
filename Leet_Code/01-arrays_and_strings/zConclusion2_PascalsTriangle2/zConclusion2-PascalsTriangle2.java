class Solution {
    public List<Integer> getRow(int rowIndex) {
                
        List<List<Integer>> pascalsTriangle = new ArrayList<>();
        List<Integer> triangleRow = new ArrayList<>();
            
        triangleRow.add(1);
        pascalsTriangle.add(triangleRow);
        
        if (rowIndex == 0) {
            return triangleRow;
        }

        List<Integer> previousRow = triangleRow;
            
        for (int row = 1; row <= rowIndex; row++) {
            triangleRow = new ArrayList<>();
            
            triangleRow.add(1);
            
            for (int pointer = 0; pointer < previousRow.size()-1; pointer++) {
                int newSum = previousRow.get(pointer) + previousRow.get(pointer+1);
                triangleRow.add(newSum);
            }
            
            triangleRow.add(1);
            
            pascalsTriangle.add(triangleRow);
            previousRow = triangleRow;
        }

        return previousRow;
    }
}