package de.benny.chess;

public enum Turn {
   WHITE,
   BLACK;
   public Turn nextTurn(){
      if (this == WHITE){
         return BLACK;
      } else return WHITE;
   }
}

