package ISE;

public class AgeException extends Exception{
    String message;
    AgeException(String mess)
    {
        message=mess;
    }
    
    String tostring()
    {
        return message;
    }

}
