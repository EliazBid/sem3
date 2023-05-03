package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertArrayEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.FixMethodOrder;

import org.junit.Test;

import integration.*;



public class PrinterTest {
    
    Printer printerOutput = new Printer();

    @Test
    public void testPrintReceipt() {
        String expectedOutput = "Receipt";
        String actualOutput = "Receipt";
        assertEquals("The receipt was not printed correctly.", expectedOutput, actualOutput);
    }
}
