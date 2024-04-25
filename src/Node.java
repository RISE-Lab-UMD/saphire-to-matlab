public class Node implements Element,Comparable<Node>{
    private String name;
//    private String connectionType;
    private String[] connections;
    
    private String probability;

    private String position;
    private int id;
    protected int nodeType;

    public static int totalNodes = -1;
    
    
    public Node(String name,String connectionType, String[] connections){
        this.name = name;
 //       this.connectionType = connectionType;
        this.connections = connections;      
        nodeType = 4;
        this.id = totalNodes++;
    }

    public Node(String name, String probability){
        this.name = name;
        this.probability = probability;
        nodeType = 18;
        this.id = totalNodes++;
    }


    public String setPosition(){
        return "net.setNodePosition(\""+name.replaceAll("-", "_")+"\","+position+",80,80)\n";
    }

    public String toString(){
        return "net.addNode("+nodeType+",\""+ name.replaceAll("-", "_")+"\")\n";
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
    @Override
    public void setProbability(String probability){
        this.probability = probability;
    }

    @Override
    public String getProbability(){
        return probability;
    }

    @Override
    public int compareTo(Node o) {
        return this.id - o.id;
    }

}
