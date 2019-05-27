package si.slotex.nlp.gui.models;

import java.io.Serializable;
import java.util.List;

public class Sentence implements Serializable
{

    private String sentence;
    private Integer numberOfTokens;
    private List<Token> tokens;

    public String getSentence()
    {
        return sentence;
    }

    public void setSentence(String sentence)
    {
        this.sentence = sentence;
    }

    public Integer getNumberOfTokens()
    {
        return numberOfTokens;
    }

    public void setNumberOfTokens(Integer numberOfTokens)
    {
        this.numberOfTokens = numberOfTokens;
    }

    public List<Token> getTokens()
    {
        return tokens;
    }

    public void setTokens(List<Token> tokens)
    {
        this.tokens = tokens;
    }
}
