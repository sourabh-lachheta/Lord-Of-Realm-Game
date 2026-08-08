package story;



import javax.swing.text.AsyncBoxView;
import java.util.HashMap;
import java.util.Map;

import inventory.Item;
import player.Player;




public class StoryManager {

    private Map<Integer, StoryScene> scenes;
    private StoryScene currentScene;
    private Player player;

    public StoryManager(Player player){
        scenes = new HashMap<>();
        this.player= player;
        initializeStory();
    }

    public void addScene(StoryScene scene){
        scenes.put(scene.getId(),scene);
    }

    public void startStory(int startSceneId){
        currentScene = scenes.get(startSceneId);

    }

    public void selectChoice(int choiceIendex){
        Choice selectedChoice = currentScene.getChoices().get(choiceIendex);

        if(selectedChoice.getReward() != null){
            player.addItem(selectedChoice.getReward());
            

        }

        int nextSceneId = selectedChoice.getNextSceneId();
        goToScene(nextSceneId);

    }

    public StoryScene getCurrentScene(){
        return currentScene;

    }

    private void goToScene(int sceneId){
        currentScene = scenes.get(sceneId);

    }

    private void initializeStory(){

        StoryScene scene1 = new StoryScene(
                1,
                "You slowly open your eyes."
        );

        scene1.addChoice(new Choice("Look Around",2));
        scene1.addChoice(new Choice("Stand up",3));
        scene1.addChoice(new Choice("Check Body",4));
        scene1.addChoice(new Choice("Close Eyes", 5));

        addScene(scene1);



        StoryScene scene2 = new StoryScene(
                2,
                "Towering trees surround you. Nearby, you notice a broken sword half-buried in the soil"
        );

        scene2.addChoice(new Choice("Pick up the sword",6,new Item("Rusty Sword")));
        scene2.addChoice(new Choice("Return",1));
        scene2.addChoice(new Choice("Go Forward", 7));
        addScene(scene2);

        StoryScene scene3 = new StoryScene(
                3,
                "you now can see clearly"
        );
        scene3.addChoice(new Choice("Look Around", 2));
        scene3.addChoice(new Choice("sleep",1));
        addScene(scene3);

        StoryScene scene4 = new StoryScene(
                4,
                "you are totally fine , but on your hand have little mark on it"
        );
        scene4.addChoice(new Choice("touch the mark",8));
        scene4.addChoice(new Choice("Look Around",2));
        addScene(scene4);

        StoryScene scene5 = new StoryScene(
                5,
                "you are sleeping now"
        );
        scene5.addChoice(new Choice("wake up", 1));
        addScene(scene5);

        StoryScene scene6 = new StoryScene(
                6,
                " you have now weapon"

        );
        scene6.addChoice(new Choice("swing the sword",9));
        scene6.addChoice(new Choice("Go Forward",7));
        addScene(scene6);



    }

}
