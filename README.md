
# Welcome Generator-GUI

This tool is based on a open-source code generation tool(greedy/Generator:), we implement GUI of this tool, and also implement several enhanced functions.

Generator-GUI is a software engineering tool which generate java codes based on database tables. The code templates of this tool based on current mainstream Java Frameworks, such as Spring, SpringMVC, Mybatis（Mybatis-Plus、JPA）. This tool could decrease those boring and repetitive works, let developers more focused on technology and performance, imporve working efficiency and coding passion.

You can use Generator-GUI:
> * Generate entity class based on database business tables.
> * Generate Mapper class which including simple CURD(create/delete/select/update) sqls.
> * Generate Controller/Service/ServiceInterface/Dao codes (MVC).

### Enhance funtions(NC, means not complish yet)：
* 1. This tool has Graphical User Interface(GUI). With GUI, you can use this code generation tool without those complex steps and configuration. The User interfaces were developed by JavaFX & Scene Builder.
* 2. Support a new function(by button "Choose") that you can choose any file folder path to generate java files, only if the path meets our standard.
* 3. Support a new function(by button "Open Target Folder") that you can view those generated java files not only in IDE but also in File Explorer.
* 4. [NC]Support a new function(by button "Test Connection") that you can test your database connection in the user interface.
* 5. [NC;Bonus]Support a new function saving history settings. You can save your customized settings (including database connection,name,path,code format,annoations use,etc.) so that next time you can choose one history setting to generate codes easily.
* 6. Support .exe format(support Windows 32/64 bit, jdk 1.8+) so that you can easily use it. You can also git clone this project, and run it in your own IDE.
* 7. Customers can choose which files to generate when using this code generation tool. (use checkbox to choose)
* 8. [NC]When using this tool, customers can load tables from database, and choose which tables to generate related java files.
* 9. [NV]Customers can preview those generated java files by this tool.
