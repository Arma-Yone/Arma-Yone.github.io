package exo;

public class Liste {
    private static final int LMAX=10000;
    private Element tab[];
    private int longueur;
    public static int getMAX() {
    	return LMAX;
    }
    public Element[] getTab() {
    	return this.tab;
    }
    public void setTab(Element[]tab) {
    	this.tab=tab;
    }
    public void setLongueur(int longueur) {
    	this.longueur=longueur;
    }
    public Liste listeVide() {
    	Liste L=new Liste();
    	L.tab=null;
    	L.longueur=0;
    	return L;
    }
    public Liste inserer(Liste L, int p, Element e) {
    	int j;
    	if(L.longueur<LMAX) {
    		if(L.longueur!=0&&p!=L.longueur+1) {
    			for(j=L.longueur;j>p;j--) {
    				L.tab[j+1]=L.tab[j];
    			}
    		}
    		L.tab[p]=e;
    		L.longueur=L.longueur+1;
    	}else {
    		System.out.println("l'insertion est impossible, la liste est saturee");
    	}
    	return L;
    }
    public Liste supprimer(Liste L, int p) {
    	int j;
    	if(L.longueur!=1) {
    		for(j=p;j<L.longueur-1;j++) {
    			L.tab[j]=L.tab[j+1];
    		}
    	}
    	L.longueur=L.longueur-1;
    	return L;
    }
    public Element acces(Liste L, int p) {
    	return L.tab[p];
    }
    public int Longueur_iter(Liste L) {
    	return L.longueur;
    }
    public int Longueur_recu(Liste L) {
    	if(L==listeVide()) {
    		return 0;
    	}else {
    		return 1+Longueur_recu(supprimer(L,1));
    	}
    }
    public boolean estVide(Liste L) {
    	return L.longueur==listeVide().longueur;
    }
    public Element queue(Liste L) {
    	return L.acces(L, L.Longueur_iter(L)-1);
    }
    public Liste concatiner(Liste L1, Liste L2) {
    	while(L2.estVide(L2)==false) {
    		L1.inserer(L1, L1.Longueur_iter(L1), L2.acces(L2, 0));
    		L2.supprimer(L2, 0);
    	}
    	return L1;
    }
    public Liste inverse(Liste L) {
    	Liste L2=new Liste();
    	L2.listeVide();
    	Element T[]=new Element[Liste.getMAX()];
    	L2.setTab(T);
    	while(L.estVide(L)==false) {
    	    L2.inserer(L2, L2.Longueur_iter(L2), L.acces(L, L.Longueur_iter(L)-1));
    	    L.supprimer(L, L.Longueur_iter(L));
    	}
    	return L2;
    }
}
