public class Uniforme {
  Prenda parteSuperior;
  Prenda parteInferior;
  Prenda calzado;

  public Uniforme(Prenda prendaSup, Prenda prendaInf, Prenda calz) {
    parteSuperior = prendaSup;
    parteInferior = prendaInf;
    calzado = calz;
  }

  static Uniforme fabricar(Sastre sastre) {
    return new Uniforme(
        sastre.fabricarParteSuperior(),
        sastre.fabricarParteInferior(),
        sastre.fabricarCalzado()
    );
  }

  public Prenda getParteSuperior() {
    return parteSuperior;
  }

  public Prenda getParteInferior() {
    return parteInferior;
  }

  public Prenda getCalzado() {
    return calzado;
  }
}
