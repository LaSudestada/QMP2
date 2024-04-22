public class PrendaBuilder {
  private Tipo tipo;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;



  public PrendaBuilder(Tipo tipo) {
    if (tipo == null) {
      throw new RuntimeException("Tipo de prenda no puede ser nula");
    } else {
      this.tipo = tipo;
    }

  }

  public void setMaterial(Material material) {
    if (material == null) {
      throw new RuntimeException("Material no puede ser nula");
    } else {
      this.material = material;
    }

  }

  public void setColorPrimario(Color colorPrimario) {
    if (colorPrimario == null) {
      throw new RuntimeException("Color de prenda no puede ser nula");
    } else {
      this.colorPrimario = colorPrimario;
    }
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public Prenda build() {
    Prenda nuevaPrenda = new Prenda(tipo, material, colorPrimario, colorSecundario);
    return nuevaPrenda;
  }

}
