package io.gamioo.game.word;

/**
 * some description
 *
 * @author Allen Jiang
 * @since 1.0.0
 */
import java.util.ArrayList;
import java.util.List;

public class DirtyWordUnit {
    private final String source;
    private final String keyWord;
    private final List<Integer> indexList = new ArrayList<>();

    public DirtyWordUnit(String source,String word){
        this.source = source;
        this.keyWord = word;
    }

    public void checkWordIndex(){
        int index = 0;
        if(source.length() < keyWord.length()){
            return ;
        }
        for (int i = 0,n=source.length(); i < n; i++) {
            if (keyWord.length() > index && source.charAt(i) == keyWord.charAt(index)) {
                indexList.add(index);
                index++;
                if(isGetTheWord()){
                    break;
                }
            }
        }
    }

    public boolean isGetTheWord(){
        return this.indexList.size() == keyWord.length();
    }

    public String getKeyWord() {
        return keyWord;
    }

    public List<Integer> getIndexList() {
        return indexList;
    }

}