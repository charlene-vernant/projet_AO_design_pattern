public class Cake {
    private String cakeType = "";
    private String flavor = "";
    public void setCakeType(String cakeType)
    { this.cakeType = cakeType; }
    public void setFlavor(String flavor)
    { this.flavor = flavor; }

    @Override
    public String toString() {
        return flavor + " " + cakeType;
    }
}
