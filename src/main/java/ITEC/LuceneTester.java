package ITEC;

import java.io.IOException;

import org.apache.lucene.document.Document;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;

public class LuceneTester {
	//Used to test searcher
   //String indexDir = "/INDEX"; //Point to index folder :)
   Searcher searcher;

   public static String run(String Number, String input, String indexDir) {
      LuceneTester tester;
      String x = "";
      try {
        tester = new LuceneTester();
        x = tester.searchSystem(Number, input, indexDir); //First number is topic NUM//Insert string for basic search or file using: ReadFile.readFile("C://Lucene//topics.txt")
      } catch (IOException e) {
         e.printStackTrace();
      } catch (ParseException e) {
         e.printStackTrace();
      }
      return x;
   }

   private void search(String docNum,String searchQuery, String indexDir) throws IOException, ParseException {
	  int rank = 1;
      searcher = new Searcher(indexDir);
      long startTime = System.currentTimeMillis();
      TopDocs hits = searcher.search(searchQuery);
      long endTime = System.currentTimeMillis();

      System.out.println(hits.totalHits +
         " documents found. Time :" + (endTime - startTime) +" ms");
      for(ScoreDoc scoreDoc : hits.scoreDocs) {
         Document doc = searcher.getDocument(scoreDoc);
         float score = scoreDoc.score;
         System.out.print(docNum);
         System.out.print(" Q0");
         System.out.print(" "+ doc.get(LuceneConstants.FILE_PATH).substring(15, doc.get(LuceneConstants.FILE_PATH).length()-4));
         System.out.print(" " + rank);
         System.out.print(" " + score);
         System.out.println(" group3");
         rank++;
      }
      searcher.close();
   }
   
   private String searchSystem(String docNum,String searchQuery, String indexDir) throws IOException, ParseException {
		  int rank = 1;
	      searcher = new Searcher(indexDir);
	      long startTime = System.currentTimeMillis();
	      TopDocs hits = searcher.search(searchQuery);
	      long endTime = System.currentTimeMillis();
	      String x ="<p> Search Test </p>";
	      
	      x= x + "<p>"+hits.totalHits +
	         " documents found. Time :" + (endTime - startTime) +" ms </p>";
	      
	      for(ScoreDoc scoreDoc : hits.scoreDocs) {
	         Document doc = searcher.getDocument(scoreDoc);
	         float score = scoreDoc.score;
	         x= x + "<p>"+docNum +" Q0" + 
	         " "+ doc.get(LuceneConstants.FILE_PATH).substring(15, doc.get(LuceneConstants.FILE_PATH).length()-4)
	         +" " + rank + " " + score +" group3 </p>";
	         //doc.get(LuceneConstants.FILE_PATH).substring(15, doc.get(LuceneConstants.FILE_PATH).length())
	         String y =" <a href=\"/ITEC4020A3/DATA/"+ doc.get(LuceneConstants.FILE_PATH).substring(15, doc.get(LuceneConstants.FILE_PATH).length()) +" \" "+ ">"+" link</a>";
	         x= x+ y;
	         rank++;
	      }
	      searcher.close();
	      return x;
	   }
}

