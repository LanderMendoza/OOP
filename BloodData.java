class BloodData {
	public static  String bloodType;
	public static String rhFactor;

    public BloodData() {
    	bloodType = "0";
    	rhFactor = "+";
    }
    public BloodData(String bt, String rh){
    	bloodType = bt;
    	rhFactor = rh;
    }
    public void display(){
    	System.out.print(bloodType + rhFactor + "is added to the blood bank.");
    }
    
    
}