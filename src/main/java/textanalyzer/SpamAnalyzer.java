package textanalyzer;

public class SpamAnalyzer extends KeywordAnalyzer {

    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeyWord() {
        return keywords;
    }
    public Label getLabel() {
        return Label.SPAM;
    }
}
