
/*
  -> represents a single choice the player can select
  -> in a story scene.
 */




package story;

import combat.Enemy;
import inventory.Item;

public class Choice {
    private String text;
   // private StoryScene nextScene;
    private int nextSceneId;

    private Item reward;
    private Item requiredItem;
    private Enemy enemy;

    private ChoiceType type;



    public Choice(String text, int nextSceneId){
        this.text = text;
        this.nextSceneId = nextSceneId;
        this.reward = null;
        this.requiredItem = null;
        this.type = ChoiceType.NORMAL;
    }


    // overloading for items
    public Choice(String text, int nextSceneId,Item reward, Item requiredItem){
        this.text = text;
        this.nextSceneId = nextSceneId;
        this.reward = reward;
        this.requiredItem = requiredItem;
        this.type = ChoiceType.REWARD;
    }


    // overloading for choice
    public Choice(String text, int nextSceneId, Enemy enemy){
        this.text = text;
        this.nextSceneId = nextSceneId;
        this.enemy = enemy;
        this.type = ChoiceType.COMBAT;
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

    public Enemy getEnemy(){
        return enemy;
    }

    public ChoiceType getType(){
        return type;
    }
}
