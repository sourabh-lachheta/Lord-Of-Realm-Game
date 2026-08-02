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


    public void selectChoice(){

    }

    public void getCurrentScene(){

    }

    private void goToScene(int sceneId){

    }

}
