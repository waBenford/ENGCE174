package javaLab5.lab5_6;
import java.util.Scanner;

public class Lab5_6 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.println( "Video(title/duration):" );
		String Vtitle = getValue.nextLine();
		int Vdur = getValue.nextInt();
		getValue.nextLine();
		
		System.out.println( "Audio(title/quality):" );
		String Atitle = getValue.nextLine();
		String Adur = getValue.nextLine();
		
		Media video = new Video( Vtitle, Vdur );
		Media audio = new Audio( Atitle, Adur );
		
		Processor.runProcessor(video);
		Processor.runProcessor(audio);
	}

}

class Media { //Superclass ->
	protected String title;
	
	public Media( String Title ) {
		this.title = Title;
	}
	
	public void process() {
		System.out.println( "Stating generic media processing." );
	}
} // <- Superclass

class Video extends Media { //Video
	protected int duration;
	
	public Video( String Title, int Duration ) {
		super( Title );
		this.duration = Duration;
	}
	
	@Override
	public void process() {
		System.out.println( "Processing video: " + this.title + " for " + this.duration + " minutes." );
	}
}

class Audio extends Media { //Audio
	protected String quality;
	
	public Audio( String Title, String Quality ) {
		super( Title );
		this.quality = Quality;
	}
	
	@Override
	public void process() {
		System.out.println( "Processing audio: " + this.title + " with " + this.quality + " quality." );
	}
}

class Processor { //Utility
	public static void runProcessor(Media m) {
		m.process();
	}
}