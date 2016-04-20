
class time {
	int hour;
	int minute;
	
	time(){};

	public static void main(String[] args) {
		time t=new time();
		t.hour=3;
		t.minute=25;
		System.out.print("The time now is "+t.hour+":"+t.minute);
	}
}
