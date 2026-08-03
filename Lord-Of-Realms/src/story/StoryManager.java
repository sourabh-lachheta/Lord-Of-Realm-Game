package story;

import java.util.HashMap;
import java.util.Map;

public class StoryManager {

    private Map<Integer, StoryScene> scenes;
    private StoryScene currentScene;

    public StoryManager(){
        scenes = new HashMap<>();
    }

    public void addScene(StoryScene scene){
        scenes.put(scene.getId(),scene);
    }

    public void startStory(int startSceneId){
        currentScene = scenes.get(startSceneId);

    }
    
    public void selectChoice(int choiceIendex){
        Choice selectedChoice = currentScene.getChoices().get(choiceIendex);
        int nextSceneId = selectedChoice.getNextSceneId();
        goToScene(nextSceneId);

    }

    public StoryScene getCurrentScene(){
        return currentScene;

    }

    private void goToScene(int sceneId){
        currentScene = scenes.get(sceneId);

    }

}
