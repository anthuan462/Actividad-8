package deck.pkg1;

public class Card {
  
  String palo;
  String color;
  String valor;
    
    public static void main(String[] args){
    
    Card Atributos =new Card();
    
    Atributos.palo ="Treboles,Corazones,Picas,Diamantes";
    Atributos.color ="Negro o Rojo";
    Atributos.valor ="2 al 10,A,J,Q o K.";
    
    
   System.out.println("Palo: "+Atributos.palo);
   System.out.println("color: "+Atributos.color);
   System.out.println("valor: "+Atributos.valor);
   
    }
}
  

