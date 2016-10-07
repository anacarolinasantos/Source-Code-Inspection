package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import java.util.Iterator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bárbara
 */
public class TicketMachineTest {

    public TicketMachineTest() {
    }

    private TicketMachine ticketMachine;

    @Before
    public void criandoTicketMachine() {
        ticketMachine = new TicketMachine(20);
    }

    @Test
    public void inserirNotaDe2() throws PapelMoedaInvalidaException {
        ticketMachine.inserir(2);
        assertEquals(ticketMachine.getSaldo(), 2);
    }

    @Test
    public void inserirNotaDe5() throws PapelMoedaInvalidaException {
        ticketMachine.inserir(5);
        assertEquals(ticketMachine.getSaldo(), 5);
    }

    @Test
    public void inserirNotaDe10() throws PapelMoedaInvalidaException {
        ticketMachine.inserir(10);
        assertEquals(ticketMachine.getSaldo(), 10);
    }

    @Test
    public void inserirNotaDe20() throws PapelMoedaInvalidaException {
        ticketMachine.inserir(20);
        assertEquals(ticketMachine.getSaldo(), 20);
    }
    
    @Test
    public void inserirNotaDe50() throws PapelMoedaInvalidaException {
        ticketMachine.inserir(50);
        assertEquals(ticketMachine.getSaldo(), 50);
    }
    
    @Test
    public void inserirNotaDe100() throws PapelMoedaInvalidaException {
        ticketMachine.inserir(100);
        assertEquals(ticketMachine.getSaldo(), 100);
    }
    
    @Test
    public void inserirNotaInvalida() throws PapelMoedaInvalidaException {
        ticketMachine.inserir(3);
        assertEquals(ticketMachine.getSaldo(), 3);
    }
    
    @Test
    public void retornaTroco() throws PapelMoedaInvalidaException {
        ticketMachine.inserir(10);
        Iterator<PapelMoeda> troco = ticketMachine.getTroco();
        assertEquals(troco, 10);
    }
}
