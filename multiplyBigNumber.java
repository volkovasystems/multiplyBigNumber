package multiplyBigNumber;

import java.math.BigInteger;

public class multiplyBigNumber{
	public static void main( String... parameters ){
		try{
			BigInteger product = multiplyBigNumber( numbers );
			System.out.print( product.toString( ) );
		}catch( Exception exception ){
			System.err.print( exception.getMessage( ) );
		}
	}

	public static final BigInteger multiplyBigNumber( String... numbers ){
		BigInteger product = new BigInteger( numbers[ 0 ] );
		for( int index = 1; index < numbers.length; index++ ){
			product = product.multiply( new BigInteger( numbers[ index ] ) );	
		}
		return product;
	}
}