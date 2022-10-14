package com.xworkz.programs.boot;


import com.xworkz.programs.*;

public class SongRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Song songName=new Song();
		Song songType=new Song();
		Song songLyricist=new Song();
		Song SongLanguage=new Song();
		
		
		songName.name="kesariya";
		songType.type="item";
		songLyricist.lyricst="vasukiVaibhav";
		SongLanguage.language="kannada";
		
		System.out.println(songName.name);
		System.out.println(songType.type);
		System.out.println(songLyricist.lyricst);
		System.out.println(songLyricist.language);
		
		
		
		
		
	}

}
