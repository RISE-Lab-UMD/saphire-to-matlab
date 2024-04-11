public interface Element {
    public String toString();
    public int getID();
    public String getName();
    public String[] getConnections();
    public void setProbability(String probability);
    public String getProbability();
}
