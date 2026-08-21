package Q1_Filmes;

public class Main {

    public static void main(String[] args) {

        Filme f1 = new Filme("Interestelar", "Ficção Científica", 2014);
        Filme f2 = new Filme("Toy Story", "Animação", 1995);

        System.out.println("Filme 1: " + f1.titulo);
        System.out.println("Gênero : " + f1.genero);
        System.out.println("Ano de Lançamento: " + f1.AnoLanc);

        System.out.println();

        System.out.println("Filme 2: " + f2.titulo);
        System.out.println("Gênero : " + f2.genero);
        System.out.println("Ano de Lançamento: " + f2.AnoLanc);

    }
}
