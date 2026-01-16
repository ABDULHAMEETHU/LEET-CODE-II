class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        long result = 1;
    	for(int i=1;i<=rowIndex;i++){
            result = result * (rowIndex-i+1);
            result = result /i;
            list.add((int)result);
        }
        return list;
    }
}