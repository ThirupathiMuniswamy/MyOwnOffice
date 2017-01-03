package com.allstate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by localadmin on 03/01/17.
 */
public class FileData {

    public static void readFile(String fileName){

        //read file into stream, try-with-resources
        try (Stream<String> s = Files.lines(Paths.get(fileName))) {

            Map<String, Long> counts =
                    s.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
            System.out.println(counts);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
