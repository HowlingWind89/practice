package testSteps;

import io.cucumber.java.en.And;
import utils.FileReaderUtil;
import utils.FileWriterUtil;
import veriffApiTests.VeriffApiTest;

import java.io.IOException;

public class FileTestSteps {

    private final FileWriterUtil fileWriterUtil;
    private final FileReaderUtil fileReaderUtil;

    public FileTestSteps( FileWriterUtil fileWriterUtil, FileReaderUtil fileReaderUtil) {
        this.fileWriterUtil = fileWriterUtil;
        this.fileReaderUtil = fileReaderUtil;
    }

    @And("I create a new file")
    public void createNewFile() throws IOException {
        fileWriterUtil.createNewFile();
    }

    @And("I write data in to the file")
    public void writeDataToFile() throws IOException {
        fileWriterUtil.writeDataToFile(VeriffApiTest.response);
    }

    @And("I read data from file")
    public String readDataFromFile() {
        return FileReaderUtil.readFile(fileWriterUtil.filePath);
    }
}
