## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

This application monitors the specific directory for changes. When new text file is added into the directory, it will scan for specific word or pattern and replace with another word. It also can monitor changes in subdirectories recursively.

Usage Example:

###### Replace simple word: 
java --enable-preview DirectoryMonitor -r C:\temp foo bar
###### Hide visa credit card number:
java --enable-preview DirectoryMonitor -r C:\temp "\b4[0-9]{15}\b" hidden
###### Hide phone numner: 
java --enable-preview DirectoryMonitor -r C:\temp "\b[1-9][0-9]{2}-[0-9]{3}-[0-9]{4}\b" hidden

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
