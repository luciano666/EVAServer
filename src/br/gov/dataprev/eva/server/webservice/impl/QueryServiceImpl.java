package br.gov.dataprev.eva.server.webservice.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.gov.dataprev.eva.server.webservice.QueryService;

public class QueryServiceImpl implements QueryService {

	@GET
	@Produces("application/json")
	@Path(value = "/processarConsulta/{consulta}")
	public String processarConsulta(@PathParam("consulta") String consulta) {

		String retVal = "";
		try {

			URL url = new URL("http","10.21.23.211", 8983, "/solr/gettingstarted/select?indent=on&wt=json&q=" + consulta);
//			System.out.println(url.getContent());
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
				retVal = output;
			}

			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		return retVal;
	}

}
