public class JavaDataTypes {
    /*
    Type        Description                 Default                 Size                Example Literals            Range of values
    boolean     true or false	              false	                  1 bit	              true, false	                true, false
    byte 	      twos-complement             integer	0	              8 bits	            (none)	                    -128 to 127
    char        Unicode character	          \u0000	                16 bits 	          ‘a’, ‘\u0041’, ‘\101’,      characters representation of ASCII values
                                                                                        ‘\\’, ‘\’, ‘\n’, ‘β’	      0 to 255
    short	      twos-complement integer	    0                       16 bits	            (none)	                    -32,768 to 32,767
    int	        twos-complement intger	    0	                      32 bits	            -2,-1,0,1,2	                -2,147,483,648 to 2,147,483,647
    long	      twos-complement integer	    0	                      64 bits	            -2L,-1L,0L,1L,2L	          -9,223,372,036,854,775,808 to
                                                                                                                    9,223,372,036,854,775,807
    float 	    IEEE 754 floating point	    0.0	                    32 bits	            1.23e100f , -1.23e-100f ,   upto 7 decimal digits
                                                                                        .3f ,3.14F	
    double      IEEE 754 floating point	    0.0     	              64 bits	            1.23456e300d ,              upto 16 decimal digits 
                                                                                        -123456e-300d , 1e1d	

     */


     /*
        Type	                  Default Value
        
        byte	                  0
        short	                  0
        int	                    0
        long	                  0
        float	                  0.0f
        double	                0.0d
        char	                  '\u0000'
        boolean	                false
        String or other object	null 

      */

    public static void main(String[] args) {

        byte b = Byte.MIN_VALUE;
        short s;
        int i = 145269;
        long l;
        float f;
        double d;
        char c;
        String str;
        boolean bool;
        System.out.println("byte b = " + b);
        //System.out.println("short s = " + s);
        System.out.println("int i = " + i);
        //System.out.println("long l = " + l);
        //System.out.println("float f = " + f);
        //System.out.println("double d = " + d);
        //System.out.println("char c = " + c);
        //System.out.println("String str = " + str);
        //System.out.println("boolean bool = " + bool);
    }
}
