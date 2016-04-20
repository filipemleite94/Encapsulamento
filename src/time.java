
class time {
	protected int hour;
	protected int minute;
	time(){};
	private void hour(int hour){
		this.hour=hour;
	}
	private void minute(int minute){
		this.minute=minute;
	}
	private int hour(){
		return hour;
	}
	private int minute(){
		return minute;
	}
	public static void main(String[] args) {
		time t=new time();
		t.hour(3);
		t.minute(25);
		System.out.print("The time now is "+t.hour()+":"+t.minute());
	}
}
