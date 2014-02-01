package com.nfeanalytics.core.map;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nfeanalytics.core.json.Coordinate;

public class GeocodingClient {

	/*
	 * TODO <Betioli> Melhorar cache
	 */
	private static Map<String, Coordinate>	cache		= new HashMap<String, Coordinate>();

	private static final Logger				LOGGER		= Logger.getLogger(GeocodingClient.class.getName());

	private static final String				BASE_URL	= "http://maps.googleapis.com/maps/api/geocode/json?sensor=false&address=";

	public static synchronized Coordinate geocode(String address) throws IOException, JsonProcessingException {

		if (cache.containsKey(address))
			return cache.get(address);

		String sUrl = BASE_URL + URLEncoder.encode(address, "UTF-8");
		InputStreamReader inputStreamReader = createInputStreamFromURL(sUrl);

		ObjectMapper mapper = new ObjectMapper();
		JsonNode rootNode = mapper.readTree(inputStreamReader);
		JsonNode location = rootNode.findPath("location");
		Iterator<JsonNode> elements = location.elements();

		if (elements.hasNext()) {
			Coordinate coordinate = new Coordinate(0, 0);
			coordinate = new Coordinate(elements.next().asDouble(), elements.next().asDouble());
			cache.put(address, coordinate);
			return coordinate;
		} else {
			LOGGER.warning("### Geocoding ERROR " + sUrl);
			return new Coordinate(0, 0);
		}
	}

	private static InputStreamReader createInputStreamFromURL(String address) throws UnsupportedEncodingException,
			MalformedURLException, IOException {

		URL url = new URL(address);

		return new InputStreamReader(url.openStream());
	}

}
