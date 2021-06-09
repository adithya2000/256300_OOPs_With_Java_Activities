package Question_1;
class FourWheeler extends Vehicle {
    private String audioSystem;
    private int numberOfDoors;
    
     FourWheeler(String make,String Vnumber,String fType,int cap,int cc,String audioSyste,int numberOfDoors){
    super(make,Vnumber,fType,cap,cc);
    this.audioSystem=audioSyste;
    this.numberOfDoors=numberOfDoors;
}
    public String getAudio(){
        return this.audioSystem;
    }
    public int getNumber(){
        return this.numberOfDoors;
    }
    
       public void displayDetailInfo(){
        System.out.println("---Detail Informations---");
        System.out.println("Audio System: "+audioSystem);
        System.out.println("Number of Doors "+numberOfDoors);
    }
    
}
