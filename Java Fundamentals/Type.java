// Type conversion and Type casting

// implicit conversion and explicit conversion

// byte b = 127;
// int a = 12 ;

// b = a ; -> error because int is bigger and byte is smaller.
// b = (byte)a;  -> convert that number in a to bytes first and then store into b.  -> this is called casting. 
// a = b -> yes possible because int is bigger and this is called implicit conversion.


public class Type {
    public static void main(String[] args) {
        // byte b = 127;
        // int n = b; 
        // System.out.println(n); -> 127

        // int a = 257;
        // byte b = (byte)a;
        // System.out.println(b); // 1 -> modulus with range of byte i.e 256.
        
        // float f = 5.6f;
        // int u = (int)f;
        // System.out.println(u); // 5

        byte a = 12;
        byte b = 34;

        int result = a*b;
        System.out.println(result);  // 408 and its called type promotion as the result value will eexceed the range of the byte data type.

        

    }
}
