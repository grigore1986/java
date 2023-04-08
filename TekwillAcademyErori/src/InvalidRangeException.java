// Clasa InvalidRangeException reprezinta o exceptie pentru
// cazul in care limita inferioara este mai mare decat limita superioara
public class InvalidRangeException extends Exception{
    public InvalidRangeException(String message){
        super(message);
    }
}
