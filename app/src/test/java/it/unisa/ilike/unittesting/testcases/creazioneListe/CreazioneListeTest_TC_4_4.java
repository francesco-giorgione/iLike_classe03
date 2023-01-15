package it.unisa.ilike.unittesting.testcases.creazioneListe;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import it.unisa.ilike.account.storage.IscrittoBean;
import it.unisa.ilike.account.storage.IscrittoDAO;
import it.unisa.ilike.account.storage.IscrittoProxyBean;
import it.unisa.ilike.account.storage.IscrittoRealBean;
import it.unisa.ilike.liste.application.ListaImpl;
import it.unisa.ilike.liste.application.exceptions.NomeVuotoException;
import it.unisa.ilike.liste.storage.ListaBean;
import it.unisa.ilike.liste.storage.ListaDAO;
import it.unisa.ilike.utils.Utils;

import org.mockito.Mockito;
import static org.mockito.Mockito.when;

/**
 * Implementa il testing di unità per TC_4_4 (Creazione liste)
 * @author Simona Lo Conte
 */
@RunWith(Parameterized.class)
public class CreazioneListeTest_TC_4_4 {

    private static IscrittoBean getIscritto() {
        return new IscrittoRealBean("testiscritto1@ilike.it", null, null, null, null, null);
    }

    /**
     * Costruttore utilizzato per l'esecuzione dei test parametrizzati
     * @param nome stringa contenente il nome della lista
     * @param iscritto oggetto IscrittoBean che contiene le informazioni del creatore della lista
     * @param pubblica valore booleano che indica se la lista è pubblica o privata
     */
    public CreazioneListeTest_TC_4_4(String nome, IscrittoBean iscritto, Boolean pubblica) {
        this.nome = nome;
        this.iscritto = iscritto;
        this.pubblica = pubblica;
    }

    /**
     * Definisce i parametri di input del test
     * @return un oggetto Collection
     */
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"Pre-serata", getIscritto(), false}
        });
    }

    /**
     * Prepara i mock da usare per simulare l'accesso al database.
     */
    @Before
    public void init() {
        mockListaDAO = Mockito.mock(ListaDAO.class);
        mockUtils = Mockito.mock(Utils.class);

        boolean res = true;

        ListaBean lista = new ListaBean();

        when(mockListaDAO.doSave(lista)).thenReturn(res);
        when(mockUtils.hasLista(iscritto,nome)).thenReturn(false);

        listaService = new ListaImpl(mockListaDAO, mockUtils, lista);
    }

    /**
     * Implementa il test della funzionalità CreazioneListe
     * @throws Exception
     */
    @Test
    public void testCreaLista() throws Exception {

        System.out.println("Parameterized input is: " + nome + ", " + pubblica);

        assertNotNull(listaService.creaLista(iscritto, nome, pubblica));

    }


    private String nome;
    private IscrittoBean iscritto;
    private Boolean pubblica;
    private ListaDAO mockListaDAO;
    private ListaImpl listaService;
    private Utils mockUtils;
}
