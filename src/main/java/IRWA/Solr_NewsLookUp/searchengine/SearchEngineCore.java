package IRWA.Solr_NewsLookUp.searchengine;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;

public class SearchEngineCore {
	
	private static final SearchEngineCore  instance = new SearchEngineCore();
	
	private SolrClient newsCore;
	
	private SearchEngineCore() {
		newsCore = new  HttpSolrClient.Builder("http://localhost:8983/solr/SrilankanNewsLookUP").build();
		System.out.println("Solr Client created "+((HttpSolrClient)newsCore).getBaseURL());
	}
	
	
	public static SearchEngineCore getInstance() {
		return instance;
	}
	
	public SolrClient getNewsClient() {
		return newsCore;
	}

}
