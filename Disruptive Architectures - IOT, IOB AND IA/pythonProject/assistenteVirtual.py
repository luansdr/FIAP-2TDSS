from gtts import gTTS
import speech_recognition as sr
from playsound import playsound
import os

microfone = sr.Microphone()
reconhecedor = sr.Recognizer()

with microfone as mic:
    reconhecedor.adjust_for_ambient_noise(mic)
    reconhecedor.listen(mic)

    audio = gTTS("Deseja ouvir uma musica topzera", lang='pt');
    audio.save('pergunta.mp3');
    playsound('pergunta.mp3')
    print("Deseja ouvir uma musica topzera?")
    resposta = reconhecedor.listen(mic)
    print(resposta)
    print("aguarde, reconhecendo")
    texto = reconhecedor.recognize_google(resposta, language='pt')
    lista = ['OK', 'SIM', 'PODE SER', 'QUERO']
    if texto.upper in lista:
        audio = gTTS("ok, abrindo a musica", lang='pt')
        audio.save('ok.mp3')
        playsound('ok.mp3')
        os.system('musica.mp3')
    else:
        audio = gTTS("tudo bem, encerrando", lang='pt')
        audio.save('fim.mp3')
        playsound('fim.mp3')