package GenericChallenge;

import Generic.Player;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Generic.Team<T>>{
    private  String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }
    public  boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName()+"is already");
            return false;
        }
        else{
            members.add(player);
            System.out.println(player.getName()+" Picked for team "+ this.name);
            return true;
        }
    }
    public int numPlayerr(){
        return  this.members.size();
    }
    public void matchResults(Generic.Team opponent, int ourScore, int theirScore){
        if(ourScore>theirScore) {
            won++;
        } else if(ourScore == theirScore){
            tied++;
        }else{
            lost++;
        }
        played++;
        if(opponent!= null){
            opponent.matchResults(null,theirScore,ourScore);
        }
    }
    public int ranking(){
        return (won*2)+tied;
    }
    @Override
    public int compareTo(Generic.Team<T> team){
        if(this.ranking()>team.ranking()){
            return -1;
        }
        else if (this.ranking()< team.ranking()){
            return 1;
        }
        else
            return 0;
    }

}
