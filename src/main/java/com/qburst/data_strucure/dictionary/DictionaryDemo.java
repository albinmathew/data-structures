package com.qburst.data_strucure.dictionary;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by albin on 26/9/14.
 */
public class DictionaryDemo {

    public  static  void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("/home/albin/Desktop/test")));
        String inputLine ;
        Map dictionary = new HashMap();

        try {
            while((inputLine = reader.readLine()) != null) {
                String[] words = inputLine.split("\\s+");
                if(inputLine.equals(""))
                    continue;

                for(String word: words) {
                    word = word.replace(".", "");
                    word = word.replace(",", "");

                    if(dictionary.containsKey(word)) {
                        Integer val = (Integer) dictionary.get(word);
                        dictionary.put(word, val + 1);
                    }
                    else
                        dictionary.put(word, 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Object key: dictionary.keySet()) {
            System.out.println(key + ": " + dictionary.get(key));
        }


        reader.close();
    }
}