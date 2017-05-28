@Test

public class HeroesNacionales {
  nombre = "";
  public HeroesNacionales(String n) {
    this.nombre = n; 
  }
}

public void haySanMartin() {
  Assert.assertEquals(libertador.nombre, "San Martin");
}