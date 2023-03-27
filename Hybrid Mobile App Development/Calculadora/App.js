import { StatusBar } from 'expo-status-bar';
import { useState } from 'react';
import { Button, StyleSheet, Text, TextInput, View } from 'react-native';

export default function App() {

  const [peso, setPeso] = useState(Number);
  const [altura, setAltura] = useState(Number);


  const verificaImc = (peso, altura) => {

    const imc = Number(peso / (altura * 2))

    if (imc < 18.5) {
      return "Abaixo do peso"
    } else if (imc >= 18.5 && imc < 25) {
      return "Peso normal"
    } else if (imc >= 25 && imc < 30) {
      return "Acima do peso"
    }
    return "Obesidade"
  }

  return (
    <View style={styles.container}>
      <TextInput
        keyboardType='numeric'
        onChangeText={text => setPeso(text.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1'))}
        value={peso}
        style={styles.text_input}
        placeholder='Peso'
      />
      <TextInput
        keyboardType='numeric'
        onChangeText={text => setAltura(text.replace(/[^0-9.]/g, '').replace(/(\d)(?=(\d{2})+(?!\d))/g, '$1,').replace(',', '.'))}
        value={altura}
        style={styles.text_input}
        placeholder='Altura'></TextInput>
      <Button title="calcular" onPress={ _ => peso && altura ? alert(verificaImc(peso, altura), "Seu IMC") : alert("Preencha todos os campos")}/>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    padding: 15

  },
  text_input: {
    borderWidth: 1,
    width: "100%",
    padding: 10,
    marginVertical: 10,
    borderColor: '#2323',
    borderRadius: 5
  }
});
