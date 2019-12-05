import java.util.ArrayList;
import java.util.Iterator;

/** classe Word .*/
public class Word
{
    private ArrayList<Letter> contain;
    public ArrayList<Letter> getContain()
    {
        return this.contain;
    }

    Iterator<Letter> iterator()
    {
        return contain.iterator();
    }
}