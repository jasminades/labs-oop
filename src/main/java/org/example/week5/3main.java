package org.example.week5;

public class Main {
    public static void main(String[] args) {
       
        Box genericBox = new Box();
        Box maxWeightBox = new MaxWeightBox(10);
        Box oneThingBox = new OneThingBox();
        Box blackHoleBox = new BlackHoleBox();

       
        if (genericBox instanceof MaxWeightBox) {
            MaxWeightBox castedMaxWeightBox = (MaxWeightBox) genericBox;
         
        }

        if (genericBox instanceof OneThingBox) {
            OneThingBox castedOneThingBox = (OneThingBox) genericBox;
          
        }

        if (genericBox instanceof BlackHoleBox) {
            BlackHoleBox castedBlackHoleBox = (BlackHoleBox) genericBox;
            
        }
    }
}
