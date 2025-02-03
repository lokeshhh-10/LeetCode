class Solution {
    public int fact(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return n*fact(n-1);
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long val = 1;
        
        for (int i = 0; i <= rowIndex; i++) {
            row.add((int) val);
            val = val * (rowIndex - i) / (i + 1);
        }
        
        return row;
    }
}