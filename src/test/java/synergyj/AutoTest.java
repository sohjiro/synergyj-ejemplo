package synergyj;

import org.junit.*;
import static org.junit.Assert.*;
import org.mockito.*;
import static org.mockito.Mockito.*;

public class AutoTest {

  @InjectMocks
  private Auto auto;

  @Mock
  private Stereo stereo;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void alEncenderElCarroElStereoDebeEstarApagado() {
    assertFalse(auto.estaEncendido());
    auto.encender();
    assertFalse(auto.estaElStereoEncendido());
  }

  @Test
  public void elStereoNoDebePrenderConElCarroApagado() {
    assertFalse(auto.estaEncendido());

    auto.encenderElStereo(null);
    assertFalse(auto.estaElStereoEncendido());
    verify(stereo, never()).estaReproduciendo();
  }

  @Test
  public void elStereoDebePrenderConElCarroEncendido() {
    assertFalse(auto.estaEncendido());

    auto.encender();
    assertTrue(auto.estaEncendido());

    when(stereo.estaReproduciendo()).thenReturn(true);
    auto.encenderElStereo(stereo);
    
    assertTrue(auto.estaElStereoEncendido());
    verify(stereo).estaReproduciendo();
  }
}
