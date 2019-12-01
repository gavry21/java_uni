package com.Sofia.ind.lab.task6;


import com.Sofia.ind.lab.task5.WordCounterFile;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class FilesTest {
    @Test
    void WordsCounterFileTest() throws IOException {
        WordCounterFile wordCounterFile = new WordCounterFile("src\\main\\resources\\TestFiles\\");
        assertEquals(wordCounterFile.col("Hello"),1);
        assertEquals(wordCounterFile.col("Hi"),1);

    }
}
