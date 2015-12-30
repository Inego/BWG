package inego.bwg;


import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

class SampleWord {
    public String word;
    public float score;

    public SampleWord(String word, float score) {
        this.word = word;
        this.score = score;
    }
}

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Gson g = new Gson();

        SampleWord sw = new SampleWord("lampa", 5);

        try {
            FileWriter fileWriter = new FileWriter("test.json");
            g.toJson(sw, fileWriter);
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // g.toJson();


    }
}
