package searchfunctionality;

import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

public class TestSearchFunctionality {

	SearchFunctionality sf;

	@Before
	public void init() {
		sf = new SearchFunctionality();
	}

	@Test
	public void shouldReturnNoResultIfInputIsFewerThanTwoChar() {
		assertEquals("", sf.lengthCheck(""));
		assertEquals("", sf.lengthCheck("P"));
		assertEquals("Pa", sf.lengthCheck("Pa"));
	}

	@Test
	public void shouldReturnCitiesBegginByInput() {
		assertEquals("", sf.searchCities("V"));
		assertEquals("[Valencia, Vancouver]", sf.searchCities("Va"));
	}

	@Test
	public void shouldBeCaseInsensitive() {
		assertEquals("[Valencia, Vancouver]", sf.searchCities("va"));
	}

	@Test
	public void shouldReturnCitiesIfInputIsAPartOfTheName() {
		assertEquals("[Budapest]", sf.searchCities("ape"));
		assertEquals("[Skopje, Bangkok, Hong Kong]", sf.searchCities("ko"));
	}

	@Test
	public void shouldReturnAllCitiesIfInputIsAsterisk() {
		assertEquals(
				"[Paris, Budapest, Skopje, Rotterdam, Valencia, Vancouver, Amsterdam, Vienna, Sydney, New York City, London, Bangkok, Hong Kong, Dubai, Rome, Istanbul]",
				sf.getAllCities("*"));
	}
}
