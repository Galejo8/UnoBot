/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uno2;

import java.util.Iterator;

/**
 * @author Michael Salerno 
 * ID# 108512298 
 * E-Mail roofis20002003@yahoo.com
 * Homework2 
 * CSE214 
 * Recitation 04 Phillip Huff 
 * Grading TA Ming Chen
 *
 **/
public class PlayerListIterator implements Iterator<Player>{
    private final PlayerList list;
    int at;
    
    public PlayerListIterator(PlayerList list){
        this.list = list;
        at = -1;
    }

    @Override
    public boolean hasNext() {
        return (at < (this.list.count()-1));
    }

    @Override
    public Player next() {
        return this.list.get(++at);
    }

    @Override
    public void remove() {
        this.list.remove(at);
    }
    
}