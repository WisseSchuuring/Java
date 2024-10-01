package section3_apis.part1_interfaces;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class CombinerFactory {
    /**
     * This method serves a StringCombiner that will surround the given arguments with double quotes,
     * separated by spaces and the result surrounded by single quotes.
     *
     * For example, the call
     *      combiner.combine("one", "two")
     * will return '"one" "two"'
     * @return quotedCombiner
     */
    static StringCombiner getQuotedCombiner() {
        StringCombiner combiner = new StringCombiner() {
            @Override
            public String combine(String first, String second) {
                return ("'" + '"' + first + '"' + " " + '"' + second + '"' + "'");
            }
        };
        return combiner;
    }

    /**
     * This method serves a StringCombiner that will combine the given arguments reversed and original,
     * concatenated with a space in between.
     *
     * For example,
     *      combiner.combine("one", "two")
     * will return "oneeno twoowt"
     *
     * (the quotes are not included in the return value).
     * @return reversedCombiner
     */
    static StringCombiner getReversedCombiner() {
        //YOUR CODE HERE (and remove the throw statement)
        StringCombiner combiner = new StringCombiner() {
            @Override
            public String combine(String first, String second) {

                String firstReversed = "";
                String secondReversed = "";

                for (int i=0; i < first.length();i++){
                    char ch = first.charAt(i);
                    firstReversed = ch+firstReversed;
                }

                for (int i=0; i < second.length();i++){
                    char ch = second.charAt(i);
                    secondReversed = ch+secondReversed;
                }
                return first + firstReversed + " " + second + secondReversed;
            }
        };
        return combiner;
    }

    /**
     * <strong>Challenge!</strong>
     * This method serves a StringCombiner that will combine the given arguments so that the characters of both
     * arguments are converted to their ASCII values and then the summed. These numbers are combined with a space
     * in between and returned.
     *
     * For example,
     *      combiner.combine("one", "two")
     * will return "322 346"
     * Because 111 + 110 + 101 = 322 and 116 + 119 + 111 = 346.
     *
     * Hint: a char IS AN integer behind the scenes
     *
     * @return reversedCombiner
     */
    static StringCombiner getAsciiSumCombiner() {
        //YOUR CODE HERE (and remove the throw statement)
        throw new UnsupportedOperationException("Not implemented yet");
    }

}
