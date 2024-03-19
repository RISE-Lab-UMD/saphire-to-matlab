public class Node implements Element{
    private String name;
    private String connectionType;
    private String[] connections;
    private int id;
    private int nodeType;
    public static int totalNodes = 0;

    public Node(String name,String connectionType, String[] connections){
        this.name = name;
        this.connectionType = connectionType;
        this.connections = connections;
        this.connections = connections;
        this.id = totalNodes++;
        nodeType = (connections.length > 0)? 4: 18;
    }

    public String createNode(){
        return "net.addNode("+nodeType+",\""+ name.replaceAll("-", "_")+"\")\n";
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

    @Override
    public String[] getConnections() {
        return connections;
    }
}
