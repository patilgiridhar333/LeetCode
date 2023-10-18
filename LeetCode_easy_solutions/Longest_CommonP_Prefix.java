class Solution {

    public int findShortestString(String[] strs){
        int k=strs[0].length();
        int index=0;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<k && strs[i]!=null){
                k=strs[i].length();
                index=i;
            }
        }
        return index;
    }
    public String longestCommonPrefix(String[] strs) {
        String str="";
        int k=findShortestString(strs);
        System.out.println(strs.length);
        for(int i=0;i<strs[k].length();i++){
              char ch=strs[k].charAt(i);
              for(int j=0;j<strs.length;j++){
                    if(strs[j].charAt(i)!=ch){
                        return str;
                    }
                    if(strs[j].charAt(i)==ch && j==strs.length-1){
                        str=str+ch;
                    }
                  }
              }
              return str;
        }
    }
