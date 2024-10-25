/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

 import com.mycompany.ticketmaster.core.PapelMoeda;
 import junit.framework.Assert;
 import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.*;
 
 /**
  *
  * @author jehsi
  */
 public class PapelMoedaTest {
     
     public PapelMoedaTest() {
     }
 
     @Test
     public void InserirPapelMoedaSucesso() 
     {
         PapelMoeda p = new PapelMoeda(2,3);
         int valor = p.getValor();
         int quantidade = p.getQuantidade();
         
         Assert.assertEquals(2, valor);
         Assert.assertEquals(3, quantidade);
     }
 }
 