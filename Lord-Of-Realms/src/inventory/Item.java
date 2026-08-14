package inventory;

public class Item {

    private String name;

    public Item(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Item)){
            return false;
        }

        Item other = (Item) obj;

        return name.equals(other.name);
    }


    @Override
    public int hashCode(){
        return name.hashCode();
    }
}
