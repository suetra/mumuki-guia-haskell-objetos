@Test

public class HeroesNacionales {
  String nombre = "";
  public HeroesNacionales(String name) {
    this.nombre = name; 
  }
}


public void haySanMartin() {
  Assert.assertEquals(libertador.nombre, "San Martin");
}