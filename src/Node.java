public class Node implements Element{
    private String name;
    private String connectionType;
    private String[] connections;
    
    private String position;
    private int id;
    private int nodeType;
    public static int totalNodes = 0;
    public static int positionx = 50;
    public static int positiony = 50;

    
    public Node(String name,String connectionType, String[] connections){
        this.name = name;
        this.connectionType = connectionType;
        this.connections = connections;
        this.connections = connections;
        this.id = totalNodes++;
        this.position = positionx+ "," + positiony;
        
        nodeType = (connections.length > 0)? 4: 18;
        if(nodeType == 4){
            positionx += 30;
        }
        positiony += 15;
    }

    public String createNode(){
        return "net.addNode("+nodeType+",\""+ name.replaceAll("-", "_")+"\")\n";
    }

    public String setPosition(){
        return "net.setNodePosition(\""+name+"\","+position+",80,80)\n";
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
