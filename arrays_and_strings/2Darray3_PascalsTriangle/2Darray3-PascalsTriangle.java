class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> pascalsTriangle = new ArrayList<>();
        List<Integer> triangleRow = new ArrayList<>();
        
        if (numRows == 0)
            return pascalsTriangle;
            
        triangleRow.add(1);
        pascalsTriangle.add(triangleRow);

        List<Integer> previousRow = triangleRow;
            
        for (int row = 1; row < numRows; row++) {
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

        return pascalsTriangle;
        
    }
}