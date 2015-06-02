# ReCiter

## ReCiter wiki
The <a href="../../wiki">wiki</a> includes descriptions of files used for computation, an overview of error analysis, a log of performance, and use cases, among other informational material on the project.

## Setting up development environment
1. Install `Java JDK 8` from http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html.
2. Download `Eclipse Luna` from http://eclipse.org/downloads/.
3. Follow the instructions here (http://www.vogella.com/tutorials/EclipseGit/article.html) to install `EGit` for `Eclipse`.
4. Install `Maven Integration for Eclipse` in Eclipse Marketplace.
5. Do `git clone` a copy of ReCiter in an empty directory.
6. Open `Eclipse`, go to `File` -> `New` -> `Java Project` -> Enter `Project name` -> Uncheck `Use default location` -> `Browse` to the location of the cloned ReCiter project -> `Finish`.
7. Right click project -> If you have installed `Maven Integration for Eclipse` successfully in Step 4, you should be able to see `Maven` -> select `Update Project`.
8. Right click Project -> `Build Path` -> `Add Libraries` -> JUnit -> Select `JUnit 4` -> `Finish`.
9. Replace `data` folder with the unzipped `data.7z`.

## MySQL Setup
1. If you do not have MySQL installed, download it from https://www.mysql.com and install. (Any current version of MySQL will work) 
2. To connect to your local development environment's database:
3. Change the following in *database.properties*.
```
	url = "jdbc:mysql://localhost/reciter";
	username = "root";
	password = "";
```
4. Download the ReCiter database .SQL file (See the <a href="../../wiki">wiki</a> for information on how to obtain this file and additional files that may optionally be used with ReCiter)
5. Use your preferred database management tool to import the .SQL file to your localhost database. If using MySQL workbench, select "Data Import/Restore" in the left navigation bar; in the "Import from Disk" tab, select "Import from Self-Contained File"; and select "Start Import".

## Running ReCiter


## Examining ReCiter output
ReCiter writes output to csv_output.csv in `data/csv_output`.
The precision and recall can be found in `reciter.log` after running `ReCiterExample.java`.
