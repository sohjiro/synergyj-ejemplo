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
    return estaReproduciendo;
  }
}
