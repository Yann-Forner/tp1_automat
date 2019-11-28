import java.util.*;

/**
 * classe Transitions
 *
 */
public class Transitions<S>
{
    private HashSet<Transition<S>> SetofTransitions; 
    
    /**
     * Constructeur d'objets de classe Transitions initialement vide
     */
    public Transitions()
    {
      this.SetofTransitions = new HashSet<Transition<S>>();  
    }
    
    /**
     * Constructeur d'objets de classe Transitions à partir d'un ensemble de transitions
     */
    public Transitions(HashSet<Transition<S>> T)
    {
      this.SetofTransitions = T;  
    }

    
    /**
     * Ajout d'une transition 
     */
    public void addTransition(Transition<S> t)
    {
      this.SetofTransitions.add(t);   
    }
    
    /**
     * Retourne l'ensemble des transitions représenté  
     */
    public HashSet<Transition<S>> getSetofTransitions()
    {
      return this.SetofTransitions;   
    }
    
    /**
     * Successeurs de l'état s et de la lettre a par les transitions
     */
    States<S> successor(S s,Letter a)
    {
     States<S> Targets = new States<S>(); 
     Iterator<Transition<S>> AllTransitions = this.SetofTransitions.iterator();
     while (AllTransitions.hasNext()){
         Transition <S> newTransition = AllTransitions.next();
         if(newTransition.getLabel() == a && newTransition.getSource() == s) {
                Targets.addState(newTransition.getTarget());
             }
         }
     return Targets; 
    }
    
 /**
     * successeurs de l'ensemble d'états S et de la lettre a par les 
     * transitions
     */  
    States<S> successors(States<S> set,Letter a)
    {
        States<S> Targets = new States<S>();
        Iterator<S> AllStates = set.iterator();
        while(AllStates.hasNext()) {
            S newState = AllStates.next();
            Iterator<Transition<S>> AllTransitions = this.SetofTransitions.iterator();
            while (AllTransitions.hasNext()){
                Transition <S> newTransition = AllTransitions.next();
                if(newTransition.getLabel() == a && newTransition.getSource() == newState) {
                    Targets.addState(newTransition.getTarget());
                }
            }
        }
        return Targets;
    }


    
 }
