# Saphire to Matlab

This script is used to convert Fault trees from SAPHIRE into Bayesian Networks and Graphs in Genie.

# Requirements

MATLAB
Windows
Java


## installation

Download the .jar file and place it into a new folder
## Usage
Add your .ftl and .bei file into the same folder

shift+right click your folder and open a powershell

Type in
```bash
java -jar saphire-to-matlab.jar
```
click and enter the prompts correctly

returns a .m file that can create a Bayesian network if you have GENIE setup with matlab

## Other

testjar contains a sample ftl and bei file along with the compiled jar.
