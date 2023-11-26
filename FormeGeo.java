package supp;

public class FormeGeo {
    private String forme;
    private String couleur;
	public FormeGeo(String forme, String couleur) {
		this.forme = forme;
		this.couleur = couleur;
	}
	public String getNom() {
		return forme;
	}
	public String getCouleur() {
		return couleur;
	}
    public double Surface() {
    	return 0;
    }
    public double Perimetre() {
    	return 0;
    }
    public void Afficher() {
    	System.out.println("c'est la forme: "+this.forme+" couleur: "+this.couleur+" Surface: "+this.Surface()+" Perimetre: "+this.Perimetre());
    }
    
    public static void main(String[]args) {
    	FormeGeo C=new Cercle("cercle","rouge");
    	FormeGeo T=new Triangle("triangle", "bleu");
    	FormeGeo R=new Rectangle("rectangle","vert");
    	
    }
}
