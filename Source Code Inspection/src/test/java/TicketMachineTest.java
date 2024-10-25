/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

 import com.mycompany.ticketmaster.core.TicketMachine;
 import com.mycompany.ticketmaster.exception.PapelMoedaInvalidaException;
 import com.mycompany.ticketmaster.exception.SaldoInsuficienteException;
 import junit.framework.Assert;
 import static org.junit.jupiter.api.Assertions.assertThrows;
 
 import org.junit.jupiter.api.Test;
 
 /**
  *
  * @author jehsi
  */
 public class TicketMachineTest {
     
     public TicketMachineTest() {
         
     }
     
     @Test
     public void ImprimirTicketComSaldoZerado() throws SaldoInsuficienteException 
     {
         TicketMachine t = new TicketMachine(3);
         assertThrows(SaldoInsuficienteException.class, () -> {
             t.imprimir();
         });
     }
     
     @Test
     public void ImprimirTicketSucesso() throws PapelMoedaInvalidaException, SaldoInsuficienteException 
     {
         TicketMachine t = new TicketMachine(2);
         t.inserir(2);
         String ticket = t.imprimir();
         System.out.println(ticket);
         Assert.assertNotNull(ticket);
     }
     
     @Test
     public void ImprimirTicketComSaldoAbaixo() throws SaldoInsuficienteException, PapelMoedaInvalidaException 
     {
         TicketMachine t = new TicketMachine(5);
         t.inserir(2);
         assertThrows(SaldoInsuficienteException.class, () -> {
             t.imprimir();
         });
     }
     
     @Test
     public void InserirDinheiroSucesso() throws PapelMoedaInvalidaException
     {
         TicketMachine t = new TicketMachine(5);
         t.inserir(2);
         int saldo = t.getSaldo();
         Assert.assertEquals(2, saldo);
     }
     
     @Test
     public void InserirDinheiroInvalido() throws PapelMoedaInvalidaException
     {
         TicketMachine t = new TicketMachine(5);
         assertThrows(PapelMoedaInvalidaException.class, () -> {
             t.inserir(3);
         });
         int saldo = t.getSaldo();
         Assert.assertEquals(0, saldo);
     }
 }
 