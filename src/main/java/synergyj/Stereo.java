package synergyj;

public class Stereo {

  private boolean estaReproduciendo = true;

  public void reproducir() {
    estaReproduciendo = true;
  }

  public void detener() {
    estaReproduciendo = false;
  }

  public boolean estaReproduciendo() {
    // throw new RuntimeException("ERROR en el stereo");
    return estaReproduciendo;
  }
}
