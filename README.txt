The program is written in Java, and the Lucene library is required. To successfully run our program, you will have to download the Lucene library from https://lucene.apache.org/core/downloads.html, choose the latest version or the older version won't significantly affect our program. Version 3.6.2 or higher is recommended. 

Once you download your Lucene library 3.6.2, you can create a java project with a package named Lucene, right-click the project, build path and set configuration. 

After doing that, you can see "Add external JARs" where select your Lucene-analyzers-common-3.6.2.jar, Lucene-core-3.6.2, along with lucene-queryparser-3.6.2. 

Once the classpath is settled, you need to edit the code to match your directories.

NOTE: We use eclipse to code this and IDE must be in admin mode to write and read files from PC system.

For the documentProcessor program (processes Wt-01, Wt-02, Wt-03 doucments) to edit:
1. In the documentProcessor.java you need to change all lanes containing: "C:\\ProcessedWebDoc\\" You need to change this to folder to which you want process document files to be stored
2. In the ProcessFiles.java you need to change lines 16, 19 C:\\Lucene\\DATA\\ to the data directory folder which you extracted the raw data too.

For the indexer program you need to edit
1. Index path in LuceneTester.java line 15 to an empty folder where your index files will be generated
2. Data dir where the data which will be used to be indexed. Data must be processed for to txt files using documentProcessor Program however, you can use our zipped DATA folder containing the txt files.

For the Searcher Program you need to edit 
1. Index path in LuceneTester.java line 15 to the indexed folder where your index files should be in.
2. You can use our INDEX folder which has already files indexed for you.

Note: if you encounter errors.
 - Did you change package name?
 - Did you add external libraries to support lucene classes
 - Did you change the path locaations for all 3 main programs?
 - You can skip documentProcessor Program if you have our Search Program and INDEX Folder and Data Folder
 - Need support contact Christopher at ZenonZeni@hotmail.com or zenon@my.yorku.ca

Web System Program uses TOMCAT
- It uses Lucenehandler.java to handle post request from.jsp files to create a query and send info to the searcher program then returns string of info.
- Our web System program imports all jars into project and implements the searcher program.

For the meta-search GUI, use this link below, which is deployed in Chris's personal server.
https://zenonzeni.com/ITEC4020A3/Search.jsp
You can type in the Topic number along with your query to use our search engine, relevant files will be retrieved and displayed. You can also click the "link" button to view the file details.
