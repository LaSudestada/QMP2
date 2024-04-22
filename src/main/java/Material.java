public class Material {
  Tela tela;
  Trama trama = Trama.LISA;


  public Material(Tela tela, Trama trama) {
    this.tela = tela;
    this.trama = trama;
  }

  public Tela getTela() {
    return tela;
  }

  public Trama getTrama() {
    return trama;
  }
}
