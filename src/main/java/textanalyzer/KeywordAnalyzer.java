package textanalyzer;

import java.util.Arrays;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeyWord();
    protected abstract Label getLabel();

    @Override
    public Label processText(String text) {
        Label label = Label.OK;
        for (String keyword : getKeyWord()) {
            if (text.contains(keyword)) {

                label = getLabel();
                break;
            }
        }
        return label;
    }
}
