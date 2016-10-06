package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
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
}
