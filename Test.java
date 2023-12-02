package exo;
import java.util.Scanner;

public class Test {
	static Scanner scr=new Scanner(System.in);
    public static Liste creationListe(Liste L) {
    	Element T[]=new Element[Liste.getMAX()];
    	L.setTab(T);
    	String i=scr.nextLine();
    	int j=0;
    	while(i!="") {
    		L.inserer(L, j, new Element(Integer.parseInt(i)));
    		j=j+1;
    		i=scr.nextLine();
    	}
    	return L;
    }
    public static void affichageListe(Liste L) {
    	for(int j=0;j<L.Longueur_iter(L);j++) {
    		System.out.println(L.acces(L, j).getId());
    	}
    }
    public static void main(String[]args) {
    	Liste liste1=new Liste();
    	liste1=liste1.listeVide();
    	creationListe(liste1);
    	Liste liste2=new Liste();
    	liste2=liste2.listeVide();
    	creationListe(liste2);
    	//affichageListe(liste1);System.out.println();
    	//affichageListe(liste2);System.out.println();
    	//System.out.println(liste1.Longueur_iter(liste1));
    	if(liste1.estVide(liste1)==true&&liste2.estVide(liste2))
    		System.out.println("le resultat de la concatination est vide");
    	if(liste1.estVide(liste1)==true) {
    		System.out.println("le resultat de la concatination est: ");
   			affichageListe(liste2);
   		}
    	if(liste2.estVide(liste2)==true) {
    		System.out.println("le resultat de la concatination est: ");
   			affichageListe(liste1);
   		}
    	if(liste1.Longueur_iter(liste1)+liste2.Longueur_iter(liste2)>Liste.getMAX()) {
    		System.out.println("concatination impossible");
    	}else {
    		liste1.concatiner(liste1, liste2);
    	}
    	affichageListe(liste1);System.out.println();
    	//liste1=liste1.inverse(liste1);
    	affichageListe(liste1.inverse(liste1));
    }
}
