package com.allstate;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 03/01/17.
 */
public class FileDataTest {

    @Test
    public void FileDataTest_ReadFile_Test(){
        String fileName = "/Users/localadmin/workspace/Office/src/test/resources/sample.txt";
        FileData file = new FileData();
        file.readFile(fileName);
    }
}