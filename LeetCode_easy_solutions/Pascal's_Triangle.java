class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ss=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ss.add(new ArrayList<>());
            // ss.get(i-1).add(1);
            for(int j=1;j<=i;j++){
                  int res=1;
                  for(int k=0;k<j-1;k++){
                      res=res*((i-1)-k);
                      res=res/(k+1);
                  }
                  ss.get(i-1).add(res);
            }
        }
         return ss;
    }
   
}
