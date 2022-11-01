class ConventionHallTester{

  public static void main(String args[]){
  ConventionHall ch = new ConventionHall();
  ch.name="Shubha Convention Center";
  ch.place="basavanagudi Bengaluru";
  ch.rent="5000rs";
  ch.capacity="up to 1200 peoples";
  ch.parking="50 cars";
  ch.toGetMarrige();
  System.out.println(ch.name + " "+ ch.place + " "+ ch.rent + " "+ ch.capacity + " "+ ch.parking);
  
  
  ConventionHall ch1 = new ConventionHall();
  ch1.name="Shubha Convention Center";
  ch1.place="chennai";
  ch1.rent="6000rs";
  ch1.capacity="up to 1000 peoples";
  ch1.parking="40 cars";
  ch1.toGetMarrige();
  System.out.println(ch1.name + " "+ ch1.place + " "+ ch1.rent + " "+ ch1.capacity + " "+ ch1.parking);
  
  
  

  ConventionHall ch2 = new ConventionHall();
  ch2.name="Shubha Convention Center";
  ch2.place="rajajinagar Bengaluru";
  ch2.rent="8000rs";
  ch2.capacity="up to 1500 peoples";
  ch2.parking="60 cars";
  ch2.toGetMarrige();
  System.out.println(ch2.name + " "+ ch2.place + " "+ ch2.rent + " "+ ch2.capacity + " "+ ch2.parking);
  
  
 
  ConventionHall ch3 = new ConventionHall();
  ch3.name="Shubha Convention Center";
  ch3.place="malleshwaram Bengaluru";
  ch3.rent="10000rs";
  ch3.capacity="up to 2000 peoples";
  ch3.parking="80 cars";
  ch3.toGetMarrige();
  System.out.println(ch3.name + " "+ ch3.place + " "+ ch3.rent + " "+ ch3.capacity + " "+ ch3.parking);
  
  
  
  
  
  }
}