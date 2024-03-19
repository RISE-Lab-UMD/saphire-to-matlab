import java.util.ArrayList;
public class Node implements Element{
    private String name;
    private ArrayList<String> connections;
    private StringBuffer fullString;
    private int id;
    public static int totalNodes = 0;

    public Node(String name,String[] connections){
        this.name = name;
        for(String s: connections){
            this.connections.add(s);
        }
        fullString = new StringBuffer();
        this.id = totalNodes++;
    }

    public void createNode(){
        fullString.append("net.add(17"+ name+")");
    }
    public String toString(){
        return name;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getName() {
        return new String(name);
    }
}
