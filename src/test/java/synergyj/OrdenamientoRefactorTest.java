package synergyj;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class OrdenamientoRefactorTest {

  private List<Integer> elementosDesordenados;
  private List<Integer> listaDeElementosEsperados;

  @Before
  public void setup() {
    elementosDesordenados = new ArrayList<Integer>();
    elementosDesordenados.add(5);
    elementosDesordenados.add(2);
    elementosDesordenados.add(8);
    elementosDesordenados.add(3);
    elementosDesordenados.add(0);
    elementosDesordenados.add(1);


    listaDeElementosEsperados = new ArrayList<Integer>();
    listaDeElementosEsperados.add(0);
    listaDeElementosEsperados.add(1);
    listaDeElementosEsperados.add(2);
    listaDeElementosEsperados.add(3);
    listaDeElementosEsperados.add(5);
    listaDeElementosEsperados.add(8);
  }


  @Test
  public void deberiaOrdenarElementosPorElMetodoBurbuja() {
    Ordenamiento ordenamiento = new Ordenamiento();
    List<Integer> elementosOrdenados = ordenamiento.ordenarElementosPorBurbuja( elementosDesordenados );
    assertNotNull( elementosOrdenados );
    assertFalse( elementosOrdenados.isEmpty() );

    assertEquals(elementosOrdenados.toString(), listaDeElementosEsperados.toString());
  }

  @Test
  public void deberiaOrdenarElementosPorElMetodoQuickSort() {
    Ordenamiento ordenamiento = new Ordenamiento();
    List<Integer> elementosOrdenados = ordenamiento.ordenarElementosPorQuickSort( elementosDesordenados, 0, (elementosDesordenados.size() - 1) );
    
    assertNotNull( elementosOrdenados );
    assertFalse( elementosOrdenados.isEmpty() );
    assertEquals(elementosOrdenados.toString(), listaDeElementosEsperados.toString());
  }
}
