class Computer
{
	public void PlayMusic()
	{
		System.out.println("Playing Music..");
	}
	public String GetMePen(int cost)
	{
		if(cost >= 10)
		    return "Pen";
		else
			return "Nothinng";
	}
}
public class OopsMethod {

	public static void main(String[] args) {
		
		Computer Obj = new Computer();
		Obj.PlayMusic();
		String str = Obj.GetMePen(11);
		System.out.println(str);

	}

}
