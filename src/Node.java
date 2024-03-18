public class Node {
    private String name;
    private String[] connections;
    private StringBuffer fullString;
    public Node(String name,String[] connections){
        this.name = name;
        this.connections = connections;
        fullString = new StringBuffer();
    }

    public void createNode(){
        fullString.append("net.add(17"+ name+")");
    }
    public String toString(){
        return name;
    }
}
