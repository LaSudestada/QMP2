@SuppressWarnings("checkstyle:MissingJavadocType")
public class Prenda {
  private Tipo tipo;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;

  //constructor
  public Prenda(Tipo tipo, Material material, Color colorPrimario, Color colorSecundario) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  public Tipo getTipo() {
    return tipo;
  }

  public Categoria getCategoria() {
    return tipo.getCategoria();
  }

  public Material getMaterial() {
    return material;
  }

  public Trama getTrama() {
    return material.getTrama();
  }

  public Color getColorPrimario() {
    return colorPrimario;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }


}
