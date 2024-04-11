import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
public class ElementManager {
    private HashMap<String,Element> elements;
    public ElementManager(){
        elements = new HashMap<>();
    }


    public String getData(){
        StringBuffer sb = new StringBuffer();
        for(Element e: elements.values()){
            sb.append(e.toString()+"\n");
        }
        return sb.toString();
    }

    public int getIDfromName(String name){
        if(elements.containsKey(name)){
            return elements.get(name).getID();
        }
        return -1;
    }

    public void addElement(String name, String connectionType, String[] connections){
        System.out.print(name);
        elements.put(name, new Node(name, connectionType, connections));
    }

    public void addElement(String name, String probability){
        System.out.print(name);
        elements.put(name, new Node(name, probability));
    }

    public void parseBasicEvent(String line){
        String[] splitLine = line.split(",");
        String name = splitLine[0].replaceAll("\\s","");
        String probability = splitLine[5];
        if(elements.containsKey(name)){
            elements.get(name).setProbability(probability);
        }
        addElement(name, probability);
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

    public String drawConnections(){
        StringBuffer con = new StringBuffer();
        for(String s: elements.keySet()){
            if(elements.get(s).getConnections() != null){
                for(String st: elements.get(s).getConnections()){
                    con.append("net.addArc("+elements.get(st).getID()+","+elements.get(s).getID()+")\n");
                }
            }
        }
        return con.toString();
    }

    public String setProbabilities(){
        StringBuffer prob = new StringBuffer();
        String elemprob;
        for(String s: elements.keySet()){
            elemprob = elements.get(s).getProbability();
            if(elemprob != null){
                prob.append("net.setNodeDefinition(\""+s.replaceAll("-","_")+"\",["+elemprob+",1-"+elemprob+"])\n");
            }
        }
        return prob.toString();
    }


    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(addAllElements());
        sb.append(drawConnections());
        sb.append(setProbabilities());
        sb.append("");
        return sb.toString();
    }

    public String addAllElements(){
        StringBuffer sb = new StringBuffer();
        ArrayList<Node> allNodes = new ArrayList<>();
        for(String s: elements.keySet()){
            allNodes.add((Node) elements.get(s));
        }
        Collections.sort(allNodes);
        for(Node n: allNodes){
            sb.append(n.toString());
        }
        return sb.toString();
    }
    
}
