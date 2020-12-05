package abstracts;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class AbstractPlainJavaTest extends Assert {

    private final String TEST_DATA_PATH = "testData/";

    private final AbstractPlainJavaImpl abstractTest = new AbstractPlainJavaImpl();

    @Before
    public void setup() throws IOException {
        File path = new File(TEST_DATA_PATH);
        if (path.exists()) {
            if (!path.delete()) {
                throw new IOException("preparation of test failed");
            }
        }
    }

    @Test
    public void getTestDataPath() throws IOException {
        // act and assert
        assertEquals("wrong path received",
                TEST_DATA_PATH,
                abstractTest.getTestDataPath());
        // assert
        assertTrue("path do not exist",
                new File(TEST_DATA_PATH).exists());
    }

    @Test
    public void createTestPath() throws IOException {
        // arrange
        String className = getClass().getSimpleName();
        String temporaryTestPath = TEST_DATA_PATH + className;
        // act
        abstractTest.createTestPath(className);
        // assert
        assertTrue("path do not exist",
                new File(temporaryTestPath).exists());
        // clean up
        new File(temporaryTestPath).delete();
    }

    static class AbstractPlainJavaImpl extends AbstractPlainJava {
    }

}