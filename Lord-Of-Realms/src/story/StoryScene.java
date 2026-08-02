

/*
    -> One scene in the story
    -> Holding the story text and available choices
 */


package story;

import java.util.ArrayList;
import java.util.List;

public class StoryScene {


    private int id;
    private String storyText;
    private List<Choice> choices;


    public void StoryScene(int id ,String storyText){
        this.id = id;
        this.storyText = storyText;
        this.choices = new ArrayList<>();
    }

    public void addChoice(Choice choice){
        choices.add(choice);
    }

    public int getId(){
        return id;
    }

    public String getStoryText(){
        return storyText;
    }

    public List<Choice> getChoice(){
        return choices;
    }

}
