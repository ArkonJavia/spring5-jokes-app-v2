package guru.springframework.Spring5jokesappv2.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceSimpl implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public JokeServiceSimpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
