package assessment;

import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.FileDownloadedPage;
import util.Driver;

import java.io.File;
import java.io.IOException;

public class FileDownload extends Hooks {

    // file destination -> C:\Users\Jawal\IdeaProjects\dotdash\target\downloaded-files-from-tests
    FileDownloadedPage page = new FileDownloadedPage(Driver.getDriver());

    @Test
    public void file_download_test() throws InterruptedException {
        Driver.getDriver().get("http://localhost:7080/download");

        page.fileLink.click();

        Thread.sleep(75);

        try {
            Assert.assertTrue(page.fileDownload("some-file.txt"), "file not found in " + page.directory);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
