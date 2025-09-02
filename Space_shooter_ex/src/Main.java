import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args) {

        Nave n1 = new Nave("Caça", 200, "Explosivo");
        Asteroide ast1 = new Asteroide("Lua", "Grande");
        n1.nave();
        n1.atirar(ast1);
        ast1.Asteroide();
        ast1.destruir();
    }
}