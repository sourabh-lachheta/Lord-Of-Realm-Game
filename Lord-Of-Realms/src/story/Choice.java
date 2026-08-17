
/*
  -> represents a single choice the player can select
  -> in a story scene.
 */




package story;

import inventory.Item;

public class Choice {
    private String text;
   // private StoryScene nextScene;
    private int nextSceneId;

    private Item reward;
    private Item requiredItem;



    public Choice(String text, int nextSceneId){
        this.text = text;
        this.nextSceneId = nextSceneId;
        this.reward = null;
        this.requiredItem = null;
    }
    // overloading for items
    public Choice(String text, int nextSceneId,Item reward, Item requiredItem){
        this.text = text;
        this.nextSceneId = nextSceneId;
        this.reward = reward;
        this.requiredItem = requiredItem;
    }
    public int getNextSceneId(){
        return nextSceneId;

    }

    public String getText(){
        return text;

    }

    public Item getReward(){
        return reward;
    }

    public Item getRequiredItem(){
        return requiredItem;
    }
}
