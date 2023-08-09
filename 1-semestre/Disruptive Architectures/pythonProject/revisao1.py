import pyttsx3

robo = pyttsx3.init()
robo.setProperty('rate', 150)
robo.setProperty('volume', 1) # volume maximo
robo.say("yes or no, sir?")
robo.runAndWait()