class SolarSystemTester{
  public static void main(String args[]){
  
  SolarSystem ss = new SolarSystem();
  ss.name="neptune";
  ss.colour="blue";
  ss.toGetEnergy();
  System.out.println(ss.name + " "+ ss.colour);
  
  
  SolarSystem ss1=new SolarSystem();
  ss1.name="saturn";
  ss1.colour="brown";
  ss1.toGetEnergy();
  System.out.println(ss1.name + " "+ ss1.colour);
  }
}