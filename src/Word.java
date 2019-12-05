import java.util.ArrayList;
import java.util.Iterator;

/** classe Word .*/
public class Word
{
    private ArrayList<Letter> contain= new ArrayList<>(0);

    public Word(String str) {
        for (int i = 0; i <str.length() ; i++) {
            contain.add(new Letter(String.valueOf(str.charAt(i))));
        }
        System.out.println(contain.getClass().toString());
    }


    public ArrayList<Letter> getContain()
    {
        return this.contain;
    }
    public Letter get(int index){
//        System.out.println(this.contain.get(index));
        return this.contain.get(index);
    }

    Iterator<Letter> iterator()
    {
        return contain.iterator();
    }
    public  int size(){
        return this.contain.size();
    }
}