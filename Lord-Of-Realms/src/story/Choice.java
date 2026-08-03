
/*
  -> represents a single choice the player can select
  -> in a story scene.
 */




package story;

public class Choice {
    private String text;
   // private StoryScene nextScene;
    private int nextSceneId;


    public Choice(String text, int nextSceneId){
        this.text = text;
        this.nextSceneId = nextSceneId;


    }
    public int getNextSceneId(){
        return nextSceneId;

    }

    public String getText(){
        return text;

    }
}
