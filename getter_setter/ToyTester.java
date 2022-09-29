class ToyTester{

public static void main(String a[]){
Toy.setToyId(3534);
Toy.setToyBrand("Disney");
Toy.setToyName("Doll");
Toy.setToyPrice(999.00);

System.out.println(Toy.getToyId());
System.out.println(Toy.getToyBrand());
System.out.println(Toy.getToyName());
System.out.println(Toy.getToyPrice());

}

}