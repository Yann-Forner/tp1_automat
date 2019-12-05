import java.util.HashSet;
import java.util.Iterator;

public class AFN<S> {
    private HashSet<Letter> alphabet ;
    States<S> setOfStates ;
    States<S> setOfInitialStates ;
    States<S> setOfFinalStates ;
    Transitions<S> transitionRelation ;

    public AFN(HashSet<Letter> alphabet, States<S> setOfStates, States<S> setOfInitialStates, States<S> setOfFinalStates, Transitions<S> transitionRelation) {
        this.alphabet = alphabet;
        this.setOfStates = setOfStates;
        this.setOfInitialStates = setOfInitialStates;
        this.setOfFinalStates = setOfFinalStates;
        this.transitionRelation = transitionRelation;
    }

    public HashSet<Letter> getAlphabet() {
        return alphabet;
    }

    public States<S> getSetOfStates() {
        return setOfStates;
    }

    public States<S> getSetOfInitialStates() {
        return setOfInitialStates;
    }

    public States<S> getSetOfFinalStates() {
        return setOfFinalStates;
    }

    public Transitions<S> getTransitionRelation() {
        return transitionRelation;
    }
    public boolean Recognize(Word w){
        States<S> cur = setOfInitialStates;
        for (int i = 0; i <w.size() ; i++) {
            cur=transitionRelation.successors(cur,w.get(i));
        }
        return isFinal(cur);
    }

    public boolean isFinal(States<S> states){
        Iterator<S> iter = states.iterator();
        while (iter.hasNext()){
            if(this.setOfFinalStates.contains( iter.next()))return true;
        }
        return false;
    }
}
