/*CSCI2110: Assignment 3
 * This is the Pair class. This contains setters,getters, isEqual,toString and toCompare methods.
 * Linh Truong | B00708389 | Nov 16th,2019
 */

public class Pair implements Comparable<Pair>{
	
    private char value;
    private double prob;
 

    //constructor
    public Pair(){
    }

    public Pair(char c){
        value = c;
    }

    public Pair(char c, double p){
        value = c;
        prob = p;
    }
//setters and getters
    public void setValue(char v){
        value = v;
    }

    public void setProb(double p){
        prob =p;
    }

    public char getValue(){
        return value;
    }

    public double getProb(){
        return prob;
    }

     public String toString(){
        return "Value: "+value + " Probability: " + prob ;
    }

     //whether the pair id equal or not
    public boolean isEqual(Pair p){
        return this.getValue() == p.getValue();
    }

    //compare pairs
    @Override
    public int compareTo(Pair p) {
        return Double.compare(this.getProb(),p.getProb());
    }
}