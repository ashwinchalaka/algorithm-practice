class Solution {
    
    private static String rowToString(List<Integer> arrayList) {
        
        String str = "";
        
        for (int i = 0 ; i < arrayList.size(); i++) {
            str += arrayList.get(i) + ", ";
        }
        
        return str;        
    }
    
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> pascalsTriangle = new ArrayList<>();
        List<Integer> triangleRow = new ArrayList<>();
        
        if (numRows == 0)
            return pascalsTriangle;
            
        triangleRow.add(1);
        pascalsTriangle.add(triangleRow);

        if (numRows == 1)
            return pascalsTriangle;

        triangleRow = new ArrayList<>();
        triangleRow.add(1);
        triangleRow.add(1);
        pascalsTriangle.add(triangleRow);

        if (numRows == 2)
            return pascalsTriangle;

        List<Integer> previousRow = triangleRow;
        int firstHidden = 0;
        int lastHidden = 0;
            
        for (int row = 3; row <= numRows; row++) {
            triangleRow = new ArrayList<>();
            
            triangleRow.add(firstHidden + previousRow.get(0));
            
            for (int pointer = 0; pointer < previousRow.size()-1; pointer++) {
                int newSum = previousRow.get(pointer) + previousRow.get(pointer+1);
                triangleRow.add(newSum);
            }
            
            triangleRow.add(lastHidden + previousRow.get(previousRow.size()-1));
            
            pascalsTriangle.add(triangleRow);
            previousRow = triangleRow;
        }

        return pascalsTriangle;
        
        
    }
}