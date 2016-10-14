class Chick implements Animal 
{     
    private String myType;     
    private String mySound; 
    private String x;     
    public Chick(String type, String sound, String sond){         
        myType = type;         
        mySound = sound; 
        x=sond;    
    }   
    public String getSound(){
    	if(Math.random()<=.5){
    		return x;
    	}
    	else return mySound;
    }     
    public String getType(){return myType;} 
}