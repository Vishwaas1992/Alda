# Alda
This is a xtext based eclipse editor for composing music using [Alda](https://github.com/alda-lang)

# Disclaimer
This is in very early stages of development

# How to Test/Run
1. Install the latest version of Eclipse from [here](https://www.eclipse.org/downloads/?)
2. Clone/Download Alda-Eclipse-Plugin from [here](https://github.com/VishwaasHegde/Alda-Eclipse-Plugin.git)
3. The plug-in org.xtext.editor.alda.repository is the update-site, install this update site in your eclipse
4. For information on how to install update site see [this](http://help.eclipse.org/mars/index.jsp?topic=%2Forg.eclipse.platform.doc.user%2Ftasks%2Ftasks-127.htm)
5. Create a dummy project in your workspace and create a file called sample.alda
6. Double click on the file
7. Go to External tool configurations and double clik on program to create a new configuration
8. In the mains tab add alda.exe for the locations field
9. In the working directory add the path of your currect project
10. In Arguments field add this command "alda play --file sample.alda"
