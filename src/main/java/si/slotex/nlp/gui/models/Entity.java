package si.slotex.nlp.gui.models;

import java.io.Serializable;
import java.util.List;

public class Entity implements Serializable
{
    private Long id;
    private String word;
    private String type;
    private List<String> documentIds;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getWord()
    {
        return word;
    }

    public void setWord(String word)
    {
        this.word = word;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public List<String> getDocumentIds()
    {
        return documentIds;
    }

    public void setDocumentIds(List<String> documentIds)
    {
        this.documentIds = documentIds;
    }

    @Override
    public String toString()
    {
        return "Entity{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", type='" + type + '\'' +
                ", documentIds=" + documentIds +
                '}';
    }
}
