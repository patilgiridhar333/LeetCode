import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
       BigInteger dec=new BigInteger(a,2);
        BigInteger decimalNumber = new BigInteger(b, 2);
        BigInteger result=dec.add(decimalNumber);
        String res=result.toString(2);
        return res;
    }
}
