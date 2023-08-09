from gtts import gTTS
from playsound import playsound

audio = gTTS("Sim ou não, senhores?", lang='pt')
audio.save('professor.mp3')
playsound('professor.mp3')
