package data.types.clase;

import java.math.BigDecimal;
import java.math.BigInteger;

public class MyBig {

    BigInteger var18 = new BigInteger("12345678901234567890");
    BigDecimal var19 = new BigDecimal("3.141592653589793238");

    BigInteger var20 = var18.add(var18);
    BigInteger var21 = var18.subtract(var18);
    BigInteger var22 = var18.multiply(var18);
    BigInteger var23 = var18.divide(var18);

    BigDecimal var24 = var19.add(var19);
    BigDecimal var25 = var19.subtract(var19);
    BigDecimal var26 = var19.multiply(var19);
    BigDecimal var27 = var19.divide(var19);

}
