import java.util.ArrayList;

//use generic type T to determine what team it is being referenced when invoked
// it is a upper bound. we cant extend for multiple classes but we can use a interface do it and class must be listed first and then the interfaces.
//if you want to use multiple bounds. it would look something like this  Team<T extends Player & Coach & captain>

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played=0;
    int won=0;
    int lost=0;
    int tied=0;

    private ArrayList<T> members=new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            //type casting for player object if we dont extend <T> for genric validation of a player eg: Team<string> and string unknown can be passed for player too
            System.out.println(((Player) player).getName()+" already in the team");
            return false;
        }
        else{
            members.add(player);
            //since we extend player from genric T to make sure we dont use type casting here
            System.out.println(player.getName()+" added for team "+this.name);
            return true;
        }
    }
    public int numPlayers(){
        return this.members.size();
    }


    //we add genric type sure to make the only players from identical sport are compared together
    public void matchResult(Team<T> opponent,int ourScore,int theirScore){
        String message;
        if(ourScore>theirScore){
            won++;
            message=" beats ";
        }else if (ourScore ==theirScore){
            tied++;
            message=" draws with ";

        }else {
            lost++;
            message=" loses to ";

        }
        played++;
        // passing null so it wont iterate again
        if(opponent!=null){
            System.out.println(this.getName()+message+opponent.getName());
            opponent.matchResult(null,ourScore,theirScore);
        }
    }

    public int ranking(){
        return (won*2)+tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        }else if(this.ranking()<team.ranking()){
            return 1;
        }else {
            return 0;
        }

    }
}
