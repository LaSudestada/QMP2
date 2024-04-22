@SuppressWarnings("checkstyle:MissingJavadocType")
public class Color {
  private int red;
  private int green;
  private int blue;

  @SuppressWarnings("checkstyle:MissingJavadocMethod")
  public Color(int r, int g, int b) {
    this.red = r;
    this.green = g;
    this.blue = b;
  }

  public int getR() {
    return red;
  }

  public int getG() {
    return green;
  }

  public int getB() {
    return blue;
  }
}
