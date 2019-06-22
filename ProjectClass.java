public class ProjectClass{
    private String name;
    private String description;
    private Double cost;
    
    public String elevatorPitch(){
        return(this.returnName() + " ($" +Double.toString(returnCost()) + ")" + " : " + this.returnDescription());
    }

    //Constructors
    public ProjectClass(){
        this.name = "";
        this.description = "";
        this.cost = 0.00;
    }
    public ProjectClass(String a){
        this.name = a;
        this.description = "";
        this.cost = 0.00;  
    }
    public ProjectClass(String a, String b){
        this.name = a;
        this.description = b;
        this.cost = 0.00;
    }
    public ProjectClass(String a, String b, Double c){
        this.name = a;
        this.description = b;
        this.cost = c;        
    }

    //Setters
    public void setName(String a){
        this.name = a;
    }
    public void setDescription(String a){
        this.description = a;
    }
    public void setCost(Double a){
        this.cost = a;
    }

    //Getters
    public String returnName() {
        return (name);
    }
    public String returnDescription(){
        return (description);
    }
    public Double returnCost(){
        return (cost);
    }
}
