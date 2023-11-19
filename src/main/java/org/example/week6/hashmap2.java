package org.example.week6;

import java.util.HashMap;

public class PromissoryNote{
    private HashMap<String, Double>debts;

    public PromissoryNote(){
        this.debts=new HashMap<>();
    }

    public void setLoan(String toWhom, double value){
        this.debts.put(toWhom, value);
    }

    public static void main(String[]args){
        PromissoryNote mattisNote=new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30);

        System.out.println(mattisNote.howMuchIsTheDebts("Arto"));
        System.out.println(mattisNote.howMuchIsTheDebts("Joel"));

        mattisNote.setLoan("Arto",10.5);
        System.out.println(mattisNote.howMuchIsTheDebts("Arto"));
    }
}