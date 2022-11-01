class BigBazarTester{

     public static void main(String args[]){
	 
	 BigBazar ref = new BigBazar();
	 ref.noOfWorkers = 25;
	 ref.gstNo = "AAA55452045hg";
	 ref.branch = "JPnagar";
	 ref.brand = "StarBeam";
	 ref.manager = "Sneha";
	 ref.toGetItems();
	 System.out.println(ref.noOfWorkers + " "+ ref.gstNo + " "+ ref.branch + " "+ ref.brand + " "+ ref.manager);
	 
	 BigBazar ref1 = ref ;
	 /*BigBazar ref1 = new BigBazar();
	 ref1.noOfWorkers = 22;
	 ref1.gstNo = "AAA55452045hg";
	 ref1.branch = "JPnagar";
	 ref1.brand = "StarBeam";
	 ref1.manager = "Sneha";
	 ref1.toGetItems();*/
	 System.out.println(ref1.noOfWorkers + " "+ ref1.gstNo + " "+ ref1.branch + " "+ ref1.brand + " "+ ref1.manager);
	 
	 
	 /*BigBazar ref2 = new BigBazar();
	 ref2.noOfWorkers = 45;
	 ref2.gstNo = "DSD124542452SJ";
	 ref2.branch = "Navarang";
	 ref2.brand = "Starbuck";
	 ref2.manager = "Anu";
	 ref2.toGetItems();
	 System.out.println(ref2.noOfWorkers + " "+ ref2.gstNo + " "+ ref2.branch + " "+ ref2.brand + " "+ ref2.manager);*/
	 
	}

}