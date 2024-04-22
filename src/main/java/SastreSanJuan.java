class SastreSanJuan implements Sastre {

  @Override
  public Prenda fabricarParteSuperior() {
    PrendaBuilder borradorChomba = new PrendaBuilder(Tipo.CHOMBA);
    borradorChomba.setMaterial(new Material(Tela.PIQUE));
    borradorChomba.setColorPrimario(new Color(14, 122, 10));
    return borradorChomba.build();
  }

  @Override
  public Prenda fabricarParteInferior() {
    PrendaBuilder borradorPantalon = new PrendaBuilder(Tipo.PANTALON);
    borradorPantalon.setMaterial(new Material(Tela.ACETATO));
    borradorPantalon.setColorPrimario(new Color(102, 102, 102));
    return borradorPantalon.build();
  }

  @Override
  public Prenda fabricarCalzado() {
    PrendaBuilder borradorZapas = new PrendaBuilder(Tipo.ZAPATILLA);
    borradorZapas.setMaterial(new Material(Tela.LONA));
    borradorZapas.setColorPrimario(new Color(102, 102, 102));
    return borradorZapas.build();
  }
}

