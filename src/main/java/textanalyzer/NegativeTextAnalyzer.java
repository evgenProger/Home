package textanalyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private final String[] keywords = new String[]{":(", "=(", ":|"};

    @Override
    protected String[] getKeyWord() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
