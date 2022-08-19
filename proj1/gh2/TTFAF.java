package gh2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.GZIPInputStream;

/**
 * This code does some stuff. Run it (with sound on!) to find out what stuff it does!
 * Requires completion of CS 61B Homework 1.
 *
 * @author Eli Lipsitz
 */
public class TTFAF {
    public static void main(String[] args) {
//        try {
//            InputStream source = new ByteArrayInputStream(Base64.getDecoder().decode(TTFAF));
//            source = new GZIPInputStream(source);
//            GuitarPlayer player = new GuitarPlayer(source);
//            player.play();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // You can also do this:
        GuitarPlayer player = new GuitarPlayer(new java.io.File("gh2/beatles-yesterday.mid"));
        // GuitarPlayer player = new GuitarPlayer(new java.io.File("gh2/beatles-hey_jude.mid"));
        player.play();
    }

    private static final String TTFAF =
        "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"
        + "6zR/5Bb/AT7+4c9/APjxG/j/XQ2yXpqSAA==";
}
