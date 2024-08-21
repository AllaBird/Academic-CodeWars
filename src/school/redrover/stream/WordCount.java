package school.redrover.stream;

import java.util.List;

public class WordCount {

    static class Counters {
        private int words = 0;
        private int lines = 0;

        public void addWords(int noOfWords) {
            words += noOfWords;
        }

        public void addLines(int noOfLines) {
            lines += noOfLines;
        }

        public String getString() {
            return String.format("Lines: %s, Words: %s", lines, words);
        }
    }

    public static Counters wc(List<String> lines) {
        return lines.stream()   //Stream<String>
                .reduce(
                        new Counters(),   //Counters(0,0)
                        (counters, line) -> {
                            counters.addLines(1);
                            counters.addWords(line.split(" ").length);
                            return counters;
                        },
                        (c1, c2) -> {
                            c1.addWords(c2.words);
                            c1.addLines(c1.lines);
                            return c1;
                        }
                );
    }

    public static void main(String[] args) {
        System.out.println(wc(List.of("This is my fierst line",
                "Second line",
                "third line",
                "I'm really tired of typing lines"
        )).getString());
    }
}
