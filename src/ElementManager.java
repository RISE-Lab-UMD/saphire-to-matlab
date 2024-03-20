import java.util.ArrayList;
public class ElementManager {
    private ArrayList<Element> elements;
    
    public ElementManager(){
        elements = new ArrayList<>();
    }


    public String getData(){
        StringBuffer sb = new StringBuffer();
        for(Element e: elements){
            sb.append(e.toString()+"\n");
        }
        return sb.toString();
    }

    public int getIDfromName(String name){
        for(Element e: elements){
            if(e.getName().equals(name)){
                return(e.getID());
            }
        }
        return -1;
    }

    public void addElement(String name, String connectionType, String[] connections){
        elements.add(new Node(name, connectionType, connections));
    }

    public String fillChildren(){
        StringBuffer con = new StringBuffer();
        ArrayList<Element> newNodes = new ArrayList<>();
        for(Element e: elements){
            for(String s: e.getConnections()){
                if(getIDfromName(s) == -1){
                    newNodes.add(new Node(s,"",new String[]{}));
                }
                
            }
        }
        for(Element e: newNodes){
            elements.add(e);
            if(e instanceof Node){
                Node n = (Node) e;
                con.append(n.createNode()+n.setPosition());
            }
        }
        return con.toString();
    }

    public String drawConnections(){
        StringBuffer con = new StringBuffer();

        for(Element e: elements){
            for(String s: e.getConnections()){
                con.append("net.addArc("+getIDfromName(s)+","+e.getID()+")\n");
            }
        }
        return con.toString();
    }

    public void parseFaultTreeLine(String line){
        String[] splitLine = line.split("\\s+");
        String name = splitLine[0];
        String conType = splitLine[1];
        int conLength = splitLine.length -2;
        String[] connections = new String[conLength];
        for(int i = 0; i < connections.length; i++){
            connections[i] = splitLine[i+2];
        }   
        addElement(name, conType, connections);
        
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        for(Element e: elements){
            if(e instanceof Node){
                Node n = (Node) e;
                sb.append(n.createNode());
            }
        }
        sb.append(fillChildren());
        sb.append(drawConnections());
        sb.append("");
        return sb.toString();
    }
}
