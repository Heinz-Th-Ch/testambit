package abstracts;

import org.junit.Assert;

import java.io.File;
import java.io.IOException;

public abstract class AbstractPlainJava extends Assert {

    private static final String TEST_DATA_PATH = "testData/";

    public String getTestDataPath() throws IOException {
        File path = new File(TEST_DATA_PATH);
        if (!path.exists()) {
            if (!path.mkdir()) {
                throw new IOException("creation of path failed");
            }
        }
        return TEST_DATA_PATH;
    }

    public String createTestPath(String simpleNameOfClass) throws IOException {
        String newPathName = getTestDataPath() + simpleNameOfClass;
        new File(newPathName).mkdirs();
        return newPathName;
    }

}
