package com.gft.tdd.model.loja;

import java.util.List;

public class ImprimeVideoGames {

	public static void imprimeVideoGames(List<VideoGame> vGames) {
		if(vGames.isEmpty())
			System.out.println("A loja nao tem video-games no seu estoque");
		else {
			for(VideoGame game : vGames)
				System.out.println(game);
		}
	}
	
}
