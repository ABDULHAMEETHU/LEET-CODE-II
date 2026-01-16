class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> list = new ArrayList<>();
       
        for(int i = 0; i < numRows; i++){
            list.add(demo(numRows, i));  
        }
        return list;
    }

    static List<Integer> demo(int numRows, int currow){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int result = 1;
        for(int i = 1; i <= currow; i++){
            result = result * (currow - i + 1);
            result = result / i;
            list.add(result);
        }
        return list;
    }
}
