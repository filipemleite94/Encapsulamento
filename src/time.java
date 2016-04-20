
class time {
	//inicializar variaveis
	protected int hour;
	protected int minute;
	time(){};
	
	//recebe a hora
	private void hour(int hour){
		this.hour=hour;
	}
	
	//recebe os minutos
	private void minute(int minute){
		this.minute=minute;
	}
	
	//retorna a hora
	private int hour(){
		return hour;
	}
	
	//retorna os minutos
	private int minute(){
		return minute;
	}
	
	//main
	public static void main(String[] args) {
		time t=new time();
		t.hour(3);
		t.minute(25);
		System.out.print("The time now is "+t.hour()+":"+t.minute());
	}
}
