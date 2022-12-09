package edk_junit;

import org.junit.Test;
import static org.junit.Assert.*;

import static javafxapplication.FXMLDocumentController.equation;

public class JUnitTest {
        
    @Test
    public void test1FXML() throws Exception {
        assertTrue(equation(2, 2, 4) == 0.75);
        assertTrue(equation(4, 4, 3) == 11.00);
    }
    
    @Test
    public void test2FXML() throws Exception {
        try {
            assertTrue("Проверка деления на 0", equation(0, 0, 4) == 0);
            fail("Нет ошибки при делении на 0");
        } catch (Exception thrown) {
            assertNotEquals("", thrown.getMessage());
        }
        try {
            assertTrue("Проверка деления 0 на 0", equation(-1, 0, 4) == 0);
            fail("Нет ошибки при делении 0 на 0");
        } catch (Exception thrown) {
            assertNotEquals("", thrown.getMessage());
        }
    }

}
