package PadraoProxy;

public class Main {
    public static void main(String[] args) {

        Conteudo conteudo = new FilmePremiumProxy();

        // Cenário 1 — usuário premium
        Usuario u1 = new Usuario("Carlos", "PREMIUM");
        conteudo.assistir(u1);

        System.out.println();

        // Cenário 2 — usuário básico
        Usuario u2 = new Usuario("Ana", "BASICO");
        conteudo.assistir(u2);

        System.out.println();

        // Cenário 3 — outro usuário premium
        Usuario u3 = new Usuario("Marina", "PREMIUM");
        conteudo.assistir(u3);

        System.out.println();

        // Cenário 4 — outro usuário básico
        Usuario u4 = new Usuario("Pedro", "BASICO");
        conteudo.assistir(u4);

        System.out.println();

        // Cenário 5 — usuário inválido
        try {
            conteudo.assistir(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }
}
