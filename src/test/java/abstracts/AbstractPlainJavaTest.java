package abstracts;

import org.junit.Assert;
import org.junit.Test;

public class AbstractPlainJavaTest {

    private static final String CLASS = "AbstractPlainJava";
    private static final String PACKAGE = "abstracts";
    private static final AbstractPlainJava testClass = new AbstractPlainJava();

    @Test
    public void testClass() {
        Assert.assertEquals("", testClass.getClass().getPackage().getName(), PACKAGE);
        Assert.assertEquals("", testClass.getClass().getSimpleName(), CLASS);
    }

}