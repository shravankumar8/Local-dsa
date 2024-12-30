import java.math.BigInteger;

public class MulStrings {
    public String multiplyStrings(String s1,String s2)
    {
         BigInteger bigInt1 = new BigInteger(s1);
        BigInteger bigInt2 = new BigInteger(s2);
        BigInteger Product=bigInt1.multiply(bigInt2);
          String numberAsString2 = Product.toString();
          

       
        return numberAsString2;
        //code here.
    }

    
}
