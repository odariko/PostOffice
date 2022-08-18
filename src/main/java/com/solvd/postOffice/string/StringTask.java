package com.solvd.postOffice.string;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class StringTask {
    private static final Logger log = LogManager.getLogger(StringTask.class);
    private static final File file = new File("src/main/java/com/solvd/postOffice/string/text.txt");
    private static String content = null;

    public static void read() {
        try {
            content = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
        }
        catch (IOException e) {
            log.info(e.getMessage());
        }
        log.info("File task\n");
        log.info(content);
        log.info("'and' matches\n");
        log.info(StringUtils.countMatches(content, "and"));
        log.info("\n\n");
    }
}
