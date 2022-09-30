package MODULE1;

import java.io.File;
import org.apache.commons.io.FilenameUtils;

public class Opendownloadedfile {

	public static File waitForDownloadToComplete(File downloadPath, String fileName) throws Exception {
        boolean isFileFound = false;
        int waitCounter = 0;
        while (!isFileFound) {
            //logger.info("Waiting For Download To Complete....");
            for (File tempFile : downloadPath.listFiles()) {
                if (tempFile.getName().contains(fileName)) {
                    String tempEx = FilenameUtils.getExtension(tempFile.getName());
                    // crdownload - For Chrome, part - For Firefox
                    if (tempEx.equalsIgnoreCase("crdownload") || tempEx.equalsIgnoreCase("part")) {
                        Thread.sleep(1000);
                    } else {
                        isFileFound = true;
              //          logger.info("Download To Completed....");
                        return tempFile;
                    }
                }
            }
            Thread.sleep(1000);
            waitCounter++;
            if (waitCounter > 25) {
                isFileFound = true;
            }
        }
        throw new Exception("File Not Downloaded");
    }
}