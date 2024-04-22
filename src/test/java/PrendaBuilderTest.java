import org.junit.jupiter.api.Test;

public class PrendaBuilderTest {

  @Test
  public void prendaBuilderTest() {
    PrendaBuilder borrador = new PrendaBuilder(new Tipo(Categoria.PARTE_SUPERIOR));
    borrador.setMaterial(new Material(Tela.ALGODON, Trama.RAYADA));
    borrador.setColorPrimario(new Color(76, 129, 252));
    Prenda prenda = borrador.build();
  }
}
