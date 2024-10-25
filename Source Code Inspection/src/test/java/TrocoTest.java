/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

 import com.mycompany.ticketmaster.core.Troco;
 import com.mycompany.ticketmaster.exception.PapelMoedaInvalidaException;
 import junit.framework.Assert;
 import static org.junit.jupiter.api.Assertions.assertThrows;
 
 import org.junit.jupiter.api.Test;
 
 /**
  *
  * @author jehsi
  */
 public class TrocoTest {
     
     public TrocoTest() {
         
     }
     
     @Test
     public void IntanciarTrocoInvalido() throws PapelMoedaInvalidaException 
     {
         
         assertThrows(PapelMoedaInvalidaException.class, () -> {
            Troco troco = new Troco(1);
         });
     }
 }
 