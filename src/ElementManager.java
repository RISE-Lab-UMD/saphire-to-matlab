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

    public void addElement(String name, String[] connections){
        elements.add(new Node(name, connections));
    }

    public void parseLine(String line){
        String[] splitLine = line.split(" ");
        addElement(splitLine[0], new String[]{splitLine[2],splitLine[3]});
    }
}
