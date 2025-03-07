# solution-homework-4
Overview

This project demonstrates the implementation of two structural design patterns:

Singleton Pattern:
ConfigurationManager: Manages global configuration settings.

GameSettings: Stores and manages global game settings such as screen resolution, difficulty, and sound preferences.

Adapter Pattern:
ChatServiceAdapter: Adapts the legacy chat system (LegacyChatService) to conform to the new ChatService interface.

Game Settings:
java GameSettingsDemo
Chat Service Adapter:
java ChatAdapterDemo
Expected Output

Configuration Manager Output:
maxPlayers: 100
Configuration Settings:
maxPlayers -> 100
defaultLanguage -> en
gameDifficulty -> medium

Game Settings Output:

Game Settings:
Screen Resolution: 1920x1080
Difficulty: Medium
Sound Enabled: true
Volume Level: 50
Fullscreen Mode: false

Updated Settings:
Screen Resolution: 2560x1440
Difficulty: Hard
Sound Enabled: false
Volume Level: 75
Fullscreen Mode: true

Chat Adapter Output:
Legacy Chat: Hello world!

Code Structure
project_root/
│── ConfigurationManager.java
│── ConfigManagerDemo.java
│── GameSettings.java
│── GameSettingsDemo.java
│── LegacyChatService.java
│── ChatService.java
│── ChatServiceAdapter.java
│── ChatAdapterDemo.java
│── README.md

Additional Notes

The Singleton pattern ensures that only one instance of ConfigurationManager and GameSettings exists.

The Adapter pattern allows the new system to use the legacy chat system without modifying its original code.
