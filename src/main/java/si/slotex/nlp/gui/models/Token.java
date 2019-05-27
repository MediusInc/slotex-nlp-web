package si.slotex.nlp.gui.models;

import java.io.Serializable;

public class Token implements Serializable
{

    private String word;
    private String posTag;
    private String lemma;
    private String nerTag;

    public String getWord()
    {
        return word;
    }

    public void setWord(String word)
    {
        this.word = word;
    }

    public String getPosTag()
    {
        return posTag;
    }

    public void setPosTag(String posTag)
    {
        this.posTag = posTag;
    }

    public String getLemma()
    {
        return lemma;
    }

    public void setLemma(String lemma)
    {
        this.lemma = lemma;
    }

    public String getNerTag()
    {
        return nerTag;
    }

    public void setNerTag(String nerTag)
    {
        this.nerTag = nerTag;
    }
}
