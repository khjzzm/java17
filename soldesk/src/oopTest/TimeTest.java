package oopTest;

class TimeCase{
	private int hour;
	private int minute;
	private int second;
	
	TimeCase(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if(hour<0 || hour>23) 
			return;		
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute<0 || minute>59)
			return;
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second<0 || second>59)
			return;
		this.second = second;
	}

	@Override
	public String toString() {
		return hour+":"+minute+":"+second;
	}
}

class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeCase t = new TimeCase(11, 30, 50);
		
		System.out.println(t);
		t.setHour(t.getHour()+1);
		
		System.out.println(t);
	}

}




