/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.ticketmaster.core.TicketMachine;
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
}
