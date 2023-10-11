package ex1td;

public class Utiliserlivre {
public static void main(String[] args) {
	Livre l1=new Livre();
	Livre l2=new Livre("le fou","yy", 550);
	l2.setAuteur("kahlil jobrane");
	Livre l3=new Livre("ahmed","rrr",300);
	l3.getAuteur();
	l3.getNbPages();
	l3.getTitre();
	l3.setPrix(29.99);
	Livre[] TLivres = new Livre[3];
	TLivres[0]=new Livre ("L'alchimiste","Coelho",225);
	TLivres[1]=new Livre ("Le Coran",null, 508);
	TLivres[2]=new Livre ("Harry Potter","JK Rowling");
	TLivres[1].setAuteur("Paulo Coelho");
	TLivres[2].setNbPages(461);


if (l2.getAuteur().equals(l3.getAuteur())) {
    System.out.println("Les deux livres ont le même auteur.");
} else {
    System.out.println("Les deux livres n'ont pas le même auteur.");
} 
System.out.println("Description du Livre 1 :");
l1.decrire();

System.out.println("Description du Livre 2 :");
l2.decrire();
for (int i1 = 0; i1 < TLivres.length; i1++) {
    System.out.println("Livre " + (i1 + 1) + " : " + TLivres[i1].toString());
}
for (Livre livre : TLivres) {
    livre.decrire();
}
}
}

	