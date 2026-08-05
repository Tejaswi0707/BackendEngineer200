package library_management.util;

public class ValidationUtil {

    public static boolean isValidIsbn(String isbn){
        return isbn!=null && isbn.startsWith("ISBN");
    }
    
}
