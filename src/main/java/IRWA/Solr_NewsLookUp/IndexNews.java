package IRWA.Solr_NewsLookUp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.zookeeper.ClientCnxn;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import IRWA.Solr_NewsLookUp.bean.News;
import IRWA.Solr_NewsLookUp.searchengine.SearchEngineCore;

public class IndexNews {
	
	public static void main(String[] args) throws IOException, SolrServerException {
		SolrClient client = SearchEngineCore.getInstance().getNewsClient();
		
		File directory = new File("/home/akash/Documents/FInal_News_ApacheSolr/hiruNews");
		
		for(File file : directory.listFiles()) {
			
			String fileContent = FileUtils.readFileToString(file);
			Gson gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
			
			News newsBean = gson.fromJson(fileContent, News.class);
			
			System.out.println("Adding Bean to solr "+newsBean.getId());
			client.addBean(newsBean);
		}
		
		client.commit();
		System.out.println("Indexing done...");
		System.exit(-1);
	}

}
