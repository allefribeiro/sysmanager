package sysmanager;

import java.util.List;
import java.util.LinkedList;

/**
 *
 * @author Allef
 */
public class TrainComposition {

    private LinkedList<Integer> trem;

    public TrainComposition() 
    {
      this.trem = new LinkedList<>();
    }
    
    public void inserirVagaoEsquerda( int vagaoID) 
    {
      this.trem.addFirst( vagaoID);
    }

    public void inserirVagaoDireita( int vagaoID) 
    {
      this.trem.addLast( vagaoID);
    }

    public int retirarVagaoEsquerda() 
    {
        if( !trem.isEmpty()) 
        {
          return this.trem.removeFirst();
        }

        return -1;
    }

    public int retirarVagaoDireita() 
    {
        if( !trem.isEmpty()) 
        {
          return this.trem.removeLast();
        }

        return -1;
    }

    public static void main(String[] args) 
    {
        TrainComposition composicao = new TrainComposition();
        composicao.inserirVagaoEsquerda(7);
        composicao.inserirVagaoEsquerda(13);
        System.out.println(composicao.retirarVagaoDireita()); // 7 
        System.out.println(composicao.retirarVagaoEsquerda()); // 13
    }
}
